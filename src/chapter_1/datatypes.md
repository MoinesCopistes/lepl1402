# Types de données

Lorsque l'on programme, il faut manipuler des données (des nombres, des chaines de caractères, des "listes de trucs"). 
Et le java est un language qu'on appelle **strictement typé** c'est a dire qu'il faut explicitement toujours dire avec quoi on est entrain
de travailler (nombres, ...) et il faut donc pour ça connaitre les différents types de données.

## Les types primitifs

**int** :: Le type int fait référence a un nombre **entier** 

**float** :: Le type float fait référence a un nombre décimal (ex: 5,2) 

**long** :: Le type long contient un nombre **entier**, mais qui peut être bien plus grand que dans un `int`

**byte** :: Le type byte contient un byte, autrement dit 8 bits (0 ou 1) et peut donc stocker un nombre allant de -128 a 127 ($2^8$ = 256 possibilités dans 8 bits)

**double** :: Le type double peut contenir un nombre décimal plus grand que le nombre maximum d'un float.

**boolean** :: Le type boolean est un "vrai ou faux" (`true`: vrai et `false`: faux) 

**char** :: Le type char fait référence a **un** caractère

Ces types ne font que contenir une donnée. Tout ce que l'on peut faire avec ce sont les différentes opérations (cf: Chapitre 1.2).


## Comment les utiliser ?

En programmation, il existe ce qui s'appelle une **variable** qui peut être comparé a une boite dans laquelle on met une valeur. Voici comment en créer une en java:

```java
int life_answer = 42;
  
```

Vous remarquerez qu'il est **OBLIGATOIRE** de spécifier le type (`int` ici en l'occurence) de la variable que l'on est entrain de créer.

Il est possible de les utiliser par après en utilisant leur nom:

```java

int double_life_answer = life_answer * 2;

```


## Les classes au dessus des types primitifs

Ces types primitifs ne sont pas pratiques du tout, par exemple comment vous convertiriez un `char` en `int` facilement ? c'est vite compliqué.

Le language contient donc différentes `classes` (qui seront expliquées en détails plus tard dans le livre) permettant de faciliter ce genre d'opérations.


```admonish warning title="Attention"

Les variables utilisant ces types ne seront plus de simples valeur mais seront ce que l'on appelle des objets (instances).
  
```

### La classe String

Stocker un caractère (ex: 'a' ) dans un `char` c'est bien, mais généralement on voudra toujours stoquer des **chaines** de caractères (ex: "Hello World").
C'est à ça que sert la classe String ! 

```java
String ma_chaine = "Hello, World !";

```

L'avantage du fait que la variable soit un objet est qu'il est possible d'appeler des méthodes sur celle ci, ce qui n'est pas possible sur les types primitifs:

```java

ma_chaine.contains("Hello"); //Retourne true

```

### La classe Integer

La classe Integer permet principalement de faire des conversions entre les types. Il est par exemple possible de faire:

```java
char test = '5';
Integer i_am_cool = Integer.parseInt(test);
// i_am_cool vaudra 5

```

