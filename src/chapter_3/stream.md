# Stream

Les Streams en java sont un moyen de base de 'accéder à des valeurs de `Collections`, et de performer des operations sur des données et éléments de la structure

```java
Stream<Integer> stream1 = Stream.of(1,2,3,5);
```

Ici on créer un `Stream` sur un set de valeur finie, mais on peut aussi faire des streams infinis

## Stream infini

```java
UnaryOperator<Integer> operator = new UnaryOperator<Integer>() {
    @Override
    public Integer apply(Integer integer) {
        return integer/2;
    }
};
Stream<Integer> stream2 = Stream.iterate(1,operator);
Stream<Integer> stream3 = Stream.iterate(1,n -> n/2); // same as stream2
```

Ici le stream va donner comme résultat : 
```
1
0
0
0
...
```

car on l'a défini comme suit : on commence à 1 pour $n_0$ et $n_1$ est défini comme $n/2$, comme 1 est un entier, $1/2 = 0$

Il est important de remarqué que ce stream est infini, car on défini $n_{i+1}$ en fonction de $n_i$, un autre exemple avec

```java
Stream<Integer> stream = Stream.iterate(1,n -> n+1);
```
qui nous donne comme résultat

```java
1
2
3
4
...
```

## Itérateur

La manière utilisée pour accéder aux valeurs est de passé par un [itérateur](./iterateur.md)

```java
Stream<Integer> stream = Stream.iterate(1,n -> n+1);
Iterator<Integer> iterator = stream.iterator();
while (iterator.hasNext()){
    System.out.println(iterator.next());
}
```

## Stream fini

Si l'on désire obtenir un nombre fini d'itération, on peut utiliser la méthode `.limit()`

```java
Stream<String> stream = Stream.iterate("",n->n+"#").limit(5);
```

retourne

```

#
##
###
####
```

## Filtre

En plus de pouvoir choisir une limite, on peut choisir un filtre avec la méthode `.filter()`

```java
Predicate<String> predicate = new Predicate<String>() {
    @Override
    public boolean test(String s) {
        return s.length()/2 == ((float) s.length())/2;
    }
};
Stream<String> stream = Stream.iterate("",n->n+"#").limit(5).filter(predicate);
```

qui accepte un `Predicate` ou bien une fonction de tri

```java
class Main {
    public static boolean parNumberOfHashs(String s){
        return s.length()/2 == ((float) s.length())/2;
    }
    public static void main(String[] args){
        Stream<String> stream = Stream.iterate("",n->n+"#").limit(5)
                .filter(Main::parNumberOfHashs);
        Iterator<String> iterator = stream.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
```

retourne en out 
```

##
####
```

## Génération

On peut également généré des `Streams` avec des `Supplier` en utilisant la méthode `.generate()`

```java
Supplier<String> supplier = new Supplier<String>() {
    int index = 0;
    String past = "";
    @Override
    public String get() {
        index ++;
        if (index % 2 ==0) {
            past += "#";
        }
        return past;
    }
};
Stream<String> stream = Stream.generate(supplier).limit(5);
```

retourne 

```

#
#
##
##
```

## Collections

Un autre moyen d'accéder au stream est d'utiliser la méthode `.collect()` et de l'utiliser pour print le stream ou le transformer en array comme ici

```java
Stream<Integer> stream = Stream.iterate(1,n -> n+1).limit(10);
List<Integer> list =  stream.collect(Collectors.toCollection(ArrayList::new));
System.out.println(list); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
```

Ici on a utilisé la classe `Collectors` pour stocker toutes les valeurs sur lesquels le stream itère

```admonish warning title="Attention"

Si la méthode `.iterator()` est appelée, on ne peut pas utiliser `.collect()` après et vice-versa, car ces méthodes consomment le stream
```