# Boucles

On distingue 2 type de boucles : 

## For

Les boucles `for` qui itèrent sur des classes ou nombres
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
On peut également les réécrire pour itérer sur des éléments
```java
Element[] array = Element[]{Element,Element}
for (Element element : array){
    //Do smth
}
```

## while

Similaire à une boucle for, elle itère sans nombre précis
```java
while (list.length > 0){
    list.remove('smth')
    //Do smth
}
```
