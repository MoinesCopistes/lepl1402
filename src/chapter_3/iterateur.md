# Itérateur

Cette partie est basée sur le concept d'iterateur

Un itérateur est basée sur la classe [`Collections`](https://www.geeksforgeeks.org/collections-in-java-2/) qui est une classe très utilisée qui contient deux valeurs, une donnée à la classe et un pointer vers une autre `Collections` qui contient aussi une valeur etc

Pour l'importer, on a 
```java
import java.util.Iterator;
```

Il permet de lire d'itérer sur des classes de `Collections`, comme des `Arraylist`, `LinkedList`

Pour en créer un, il faut définir deux méthodes :
```java
Iterator<Integer> iterator = new Iterator<Integer>() {
    private int value = 0;
    @Override
    public boolean hasNext() {
        return value<10;
    }

    @Override
    public Integer next() {
        if (hasNext()){
            value++;
            return value;
        } else {
            return null;
        }
    }
};
```
Ici on peut définir les corps des méthodes `hasnext()` et  `next()` pour avoir ce que l'on désire, dans ce cas ci, en utilisant un appel comme 
```java
while (iterator.hasNext()){
    Integer val = iterator.next();
}
```
ici on itère de 1 à 9

