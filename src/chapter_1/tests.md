# Tests

Avant toute chose, vous devez avoir [Junit](https://www.jetbrains.com/help/idea/junit.html#intellij) sur votre projet


Pour créer un test Junit, votre fonction doit commencer par `test` et devrait être de type void, car elle teste et n'est pas censé interagir après avec d'autre fonction
```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Test{
    @Test
    public void testCountAlphabet() {
        assertEquals(0,testedfunc(input))
    }
}
```
On utilise ici les Assertions comme moyen de comparaison entre un résultat attendu et le resultat d'une fonction
Il y a également un décorateur à mettre devant chaque fonction, celui est indispensable (`@Test`)