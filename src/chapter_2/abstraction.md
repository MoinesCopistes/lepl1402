# Abstraction

Cette partie est en lien avec [les interfaces](./interface.md), il est conseillée d'avoir déjà lu la partie sur celles-ci

L'abstraction peut apparaitre sous forme de classe, méthode, le but ici est de définir des méthodes de base et un corp sans devoir le réécrire pour chaque classe qui l'utilise

Il ne faut le confondre avec une interface qui elle veut forcer l'implementation de méthode dans un classe alors qu'ici on veut insérer des méthodes dans une classe

A la manière des interfaces, on applique une classe abstraite sur une autre classe avec `extends`, bien que ce soit dans l'autre sens, notre classe ajoute du contenu a une classe abstraite
```java
abstract class AbstractClass{
    public String stringMethod(){
        return "method";
    }
}
public class Main extends AbstractClass{
    public static void main(String[] args){}
}
```

Comme dans les interfaces, on peut les écraser avec un décorateur

```java
abstract class AbstractClass{
    public String stringMethod(){
        return "method";
    }
}
public class Main extends AbstractClass{
    public static void main(String[] args){}
    @Override
    public String stringMethod(){
        return "overrided";
    }
}
```

On peut forcer une extension à utiliser une méthode en la déclarant abstraite, elle doit alors être implémentée

```java
abstract class AbstractClass{
    public abstract void abstractMethod();
}
public class Main extends AbstractClass{
    public static void main(String[] args){}
    @Override
    public void abstractMethod() {}
}
```
```admonish warning title="Attention"
Dans ce cas il **faut** utiliser le décorateur `@Override` et implémenter la méthode
```

