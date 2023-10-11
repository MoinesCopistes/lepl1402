# Arrays

Ici on peut séparer deux types, les primitifs et ceux basés sur les structures

## Primitif

S'écris avec une classe et deux [], la principale différence ici est que la taille est fixée et ne change pas
```java
int[] array = new int[]{1,2,3,4,5};
int[] voidarray = new int[5];
```

On accède à la longeur de l'array en utilisant `.length`

On peut soit lui donné des valeurs soit donné une taille fixe pour accéder à des valeurs on utilise :
```java
array[0] //=> 1
voidarray[0] = 0;
```

Pour copier un array, on doit soit utiliser une boucle `for` pour avoir les valeurs soit utiliser
```java
int[] sourceArray = {1, 2, 3, 4, 5};
int[] destinationArray = new int[sourceArray.length];
System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
```
pour copier les références

De manière générale, on peut également l'utiliser pour n'importe quelle classe comme apr exemple : 
 ```java
 Element[] elements = new Element[1];
 ```

## Structural

Tout d'abord, il doit être importé, 
```java
import java.util.ArrayList;
```

Sa taille est variable et ne change pas, on la construit en précisant le contenu des classes dans des `<>`
```java
ArrayList<Integer> myArrayList = new ArrayList<>();
```
Les trois méthodes principales sont 
```java
myArrayList.add(42);            // Add a value
int value = myArrayList.get(0);  // Access a value
myArrayList.remove(0);          // Remove a value
```
De manière similaire on peut utiliser la superclasse `List`, en réalité il y a des différences entre les deux et certains cas ou on préférera l'un par rapport à l'autre

Pour copier deux arrays on peut soit utiliser une boucle `for` pour avoir les valeurs copié soit utiliser des valeurs copiées
```java
ArrayList<Integer> array = new ArrayList<>();
ArrayList<Integer> array2 = new ArrayList<>(array);
```
 pour avoir les références 