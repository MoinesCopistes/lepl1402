# Héritage

L'heritage permet de prendre des variables et éléments d'une classe et de les avoir dans une sous-classe sans devoir les redéfinir

Pour se faire on utilise `extends`, contrairement à [l'abstraction](./abstraction.md), ici toutes les méthode doivent être définie, et on peut en créer une nouvelle tandis qu'un classe abstraite ne peut être initialisée

```java
class SuperClass{
    public String stringMethod(){
        return "method";
    }
}
public class Main extends SuperClass{
    public static void main(String[] args){
        Main main = new Main();
        System.out.println(main.stringMethod()); // Returns "method"
    }
}
```

On peut également écraser une méthode une méthode de la classe mère

```java
class SuperClass{
    public String stringMethod(){
        return "method";
    }
}
public class Main extends SuperClass{
    public static void main(String[] args){
        Main main = new Main();
        System.out.println(main.stringMethod()); // Returns "new method"
    }
    public String stringMethod(){
        return "new method";
    }
}
```

