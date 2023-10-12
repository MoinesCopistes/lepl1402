# Formatage

## Structure de fichier

Tout fichier java doit respecter une certaine structure, premièrement le nom de fichier doit etre similaire à la classe publique principale, tout fonctionne par classe en java
Il faut également que la première ligne indique l'emplacement du fichier dans votre projet,
```
.
└── src/
    ├── MyClass.java
    └── folder/
        └── TestClass.java
```
ici `TestClass.java` ressemblera à 
```java
package folder;
public class TestClass {
    // functions here
}
```
Ensuite, il faut pour que vote fichier puisse être exécuté, c'est à dire pas depuis des tests, qu'il possède un fonction main comme 
```java
public class MyClass {
    public static void main(String[] args){
        // do smth
    }
}
```
On peut alors rajouter des fonctions et des classes (non publique)
```java
public class MyClass {
    public static void main(String[] args){
        // do smth
    }
    public static String operation(String input){
        return ThirdClass.function(input);
    }
    class ThirdClass{
        public static String function(String input){
            return SecondClass.function(input);
        }
    }
}
class SecondClass {
    public static String function(String input){return null;}
}
```

## Modifieurs d'accès
Comme déjà utilisé plus haut, on utilise des mot pour désigné des aspects d'une classe ou d'une fonction

`static` : accroche une méthode ou une variable à une classe
`public` : rend la méthode /variable publique ce qui veut dire qu'il n'y a pas de restriction pour l'appeler
`private`: rend la méthode /variable privée, seul une instance de la classe peut l'appeler
`final`  : indique qu'une variable ne peut pas ête modifiée

## Déclaration du type

En java comme dans d'autre language, il faut déclarer le type d'un objet quand on en crée ou reçois un, ainsi que dans une méthode, pour savoir ce qu'elle devrait retourner
comme ici
```java
public static void main(String[] args){
        int n = 0;
    }
```
la fonction doit retourner `void` c'est à dire rien, ce qui peut arriver avec une fonction qui créer un fichier par exemple ou bien qui utilise `System.out`, on peut aussi voir qu'elle prend `String[] args` en argument, `String[]` est le type de `args` soit une liste de [`String`](array.md), `n` aussi est déclaré, il est ici un entier (´int´)