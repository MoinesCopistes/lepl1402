package basics;

import java.math.BigInteger;
import java.util.Arrays;


/**
 * ***********
 * * English *
 * ***********
 *  The Pascal triangle up to row5 looks like this:
 *
 *  row1      1
 *  row2     1 1
 *  row3    1 2 1
 *  row4   1 3 3 1
 *  row5  1 4 6 4 1
 *
 * As you can observe, each element of each
 * row is either 1 or the sum of
 * the two elements right above it.
 * For example, the last row
 * of the triangle is constructed as such :
 *
 *   1   (since the first element of each row doesn't have two elements above it)
 *   4   (1 + 3)
 *   6   (3 + 3)
 *   4   (3 + 1)
 *   1   (since the last element of each row doesn't have two elements above it)
 *
 *  Your task is to return an array that represents
 *  the nth row of Pascal's triangle
 *
 *  You can add methods in the class.
 *
 *  ************
 *  * Français *
 *  ************
 *
 *  Le triangle de Pascal jusqu'à la 5ème rangée est donné ci-dessous:
 *
 *  row1      1
 *  row2     1 1
 *  row3    1 2 1
 *  row4   1 3 3 1
 *  row5  1 4 6 4 1
 *
 * Comme vous pouvez l'observer, chaque élément de chaque
 * ligne est soit 1, soit la somme de
 * des deux éléments situés juste au-dessus.
 * Par exemple, la dernière ligne
 * du triangle est construite comme suit :
 *
 * 1 (puisque le premier élément de chaque rangée n'a pas deux éléments au-dessus de lui)
 * 4 (1 + 3)
 * 6 (3 + 3)
 * 4 (3 + 1)
 * 1 (puisque le dernier élément de chaque ligne n'a pas deux éléments au-dessus de lui)
 *
 * Votre tâche est de retourner un tableau qui représente
 * la nième ligne du triangle de Pascal
 *
 * Vous pouvez ajouter des méthodes dans la classe.
 *

 */
public class PascalNewton {

    /**
     * Computes the nth row of Pascal triangle
     *
     * @param n > 0
     * @return the nth row of Pascal triangle
     */
    public static int[] pascal(int n) {
        int[] nthRow = new int[n];
        for (int i = 0; i <= n-1; i++) {
            BigInteger val = factorial(n-1).divide((factorial(n-i-1).multiply(factorial(i))));
            nthRow[i] = val.intValue();
         }
        return nthRow;
    }

    public static BigInteger factorial(int n) {
        BigInteger sum = BigInteger.ONE;
        if (n == 0) {return (BigInteger) sum;}
        for (BigInteger i = BigInteger.valueOf(n); i.compareTo(BigInteger.ZERO) > 0; i = i.subtract(BigInteger.ONE)) {
            sum = sum.multiply(i);
        }
        return sum;
    
    }
}