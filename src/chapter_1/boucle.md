# Boucles

Une boucle est une portion de code permettant d'éxécuter une tâche plusieurs fois.


## Les types de boucles

Il existe 2 types de boucles, les voici:

### La boucle while

Cette boucle est la plus simple, elle prends une condition en paramètre,et va l'évaluer avant chaque itération. 
Si c'est `true`, elle répète, si c'est `false` elle arrête.

```java
while (list.length > 0){
    list.remove('smth')
    //Do smth
}
```



### For

La boucle `for` est quand a elle un peu plus compliquée... Elle peut prendre en paramètre soit une notation spécifique permettant d'itérérer sur un nombre:
```java
for (int i=0:i < n; i++){
    //Do smth
}
```
ici le paramètres `i` est un nombre qui va de $0$ à $n-1$, pour $n>0$, utiliser 
```java
(int i=n; i<0; i--)
```
aurait créer un nombre `i` de $n$ à $1$, pour $n>1$

Ou bien prendre en paramètre un élement qui est soit un `Iterable` soit un `Array` avec une autre notation présente ci dessous. ([documentation](https://docs.oracle.com/javase/specs/jls/se7/html/jls-14.html#jls-14.14.2))

```java
Element[] array = Element[]{Element,Element}
for (Element element : array){
    //Do smth
}
```

