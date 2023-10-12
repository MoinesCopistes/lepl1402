# Programmation Objet

Cette partie est consacrée plus en particulier à la programmation orientée objet, il est conseillé d'être familier avec les concepts de [formatage](./../chapter_1/formatage.md) java pour comprendre la syntaxe

De manière générale, lorsqu'on veut accéder à une méthode depuis l'extérieur d'une classe, on utilise le `.`
```java
// Dans un fichier Main.java
public class Main {
    public static void main(String[] args){
    }
    public String stringMethod(){
        return new String(" ");
    }
}
class SecondClass {
    public static void main(String[] args){
        Main.main(args);
        Main main = new Main();
        main.stringMethod();
    }
}
```

Ici il est important de voir la différence entre la méthode d'appel d'une fonction `static` et non-static. Une méthode `static` est liée à la classe auquel elles appartient c'est à dire `Main`, tandis qu'une méthode qui ne l'est pas est liée à l'instance de la classe, on doit d'abord l'initialisée puis appelé la méthode

On peut également définir une classe qui dépend d'une autre classe et a des paramètres

```java
public class Main<E> { // la classe Main dépend d'une classe inconnue , E
    public E e; // variable de classe, de type E et nommée e
    public Main(E e){ // fonction pour initialisé la variable de classe, 
                      //appelée lors de la construction
        this.e = e; // parle de la variable de classe en utilisant `this`
    }
    public static void main(String[] args){
        Main<Integer> main = new Main<>(0);
    }

}
```

Ici le `<E>` specicifie la classe de `E`, on ne sait pas avant qu'on initialise cette classe, tout la classe `Main` est bassée sur `E` qui est inconnu

Pour initialiser il faut alors indiqué à la classe principale, la classe `E`, comme suis : `Main<Integer>` et lorsque l'on veut créer des variables propres à la classe, on créer une fonction constructeur ici `public Main(E e)` qui va donner une valeur à la variable de classe `e` déclarée par `public E e;`