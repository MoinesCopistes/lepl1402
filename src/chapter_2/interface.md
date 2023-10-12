# Interface

Une interface est un moyen abstrait de définir ce qui devrait être dans une classe,  on créer une interface avec des méthode et si on veut créer une classe basée sur cette interface, on doit l'implémenter avec `implements` et utiliser un décorateur pour signifier que l'on créer une methode de l'implementation que l'on va écraser
```java
interface Interface{
    public String InterfaceMethod();
}
public class Main implements Interface{
    public static void main(String[] args){

    }
    @Override
    public String InterfaceMethod() {
        return " ";
    }
}
```
```admonish warning title="Attention"
Il **faut** utiliser le décorateur `@Override` et implémenter la méthode
```

Certaine méthode peuvent prendre des arguments en paramètre, il faut alors l'indiquer dans l'interface, cela peut aussi etre des constantes et des variables propre à la classe

```java
interface Interface{
    public String InterfaceMethod();
    public String returnString(String message);

}
public class Main implements Interface{
    public static void main(String[] args){

    }
    @Override
    public String InterfaceMethod() {
        return " ";
    }
    @Override
    public String returnString(String message) {
        return null;
    }
}
```
Dans cet exemple, pour accéder à la méthode `InterfaceMethod` on doit créer une instance de `Main`
```java
String result = new Main().InterfaceMethod();
```

```admonish question title="Le saviez-vous?"
On peut définir des constantes et des paramètres dans une interface qui peuvent être acceder depuis celle ci
```

```java
interface Interface{
    public String InterfaceMethod();
    public String returnString(String message);
    int constant = 0; // Use Interface.constant to access 0
}
```


Afin d'éviter de devoir à chaque implémentation rajouter des méthode qui ne change pas de l'interface, on peut utiliser la signature `default`
```java
interface Interface {
    default String defaultMethod() {
        return "default";
    }   
}
public class Main implements Interface {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.defaultMethod()); // Output: "default"
    }
}
```
On peut bien sur l'écraser et changer le corp de la méthode
```java
interface Interface {
    default String defaultMethod() {
        return "default";
    }
}

public class Main implements Interface {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.defaultMethod()); // Output: "overrided"
    }
    @Override
    public String defaultMethod(){
        return "overrided";
    }
}
```

```admonish question title="Le saviez-vous?"
Si dans la construction d'une interface on utilise une méthode `static`, cette méthode n'est pas accessible depuis l'implémentation mais depuis l'interface
```

```java

interface Interface{
    public static String returnString(String message){
        return message;
    }
}
public class Main implements Interface{
    public static void main(String[] args){}
}
class Test{
    public static void main(String[] args){
        //Main.returnString(" "); returns an error
        Interface.returnString(" ");
    }
}
```

On peut également implémenter plusieurs interface en même temps

```java
interface Interface{
    public String InterfaceMethod();
}
interface Interface2{
    public String InterfaceMethod2();
}
public class Main implements Interface, Interface2{
    public static void main(String[] args){}
    @Override
    public String InterfaceMethod() {return " ";}

    @Override
    public String InterfaceMethod2() {return null;}
}
```



