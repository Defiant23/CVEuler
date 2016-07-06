package EulerProblems;

import java.math.BigInteger;

/**
 * Created by cvalencia on 6/2/16.
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6 {

    private static double sums = 0;
    private static double squares = 0;


    public static void main(String args[]) {

        for(int i = 1; i <= 100; i++) {
            sums += i;
            squares += Math.pow(i, 2);
        }
        sums = Math.pow(sums, 2);

        BigInteger difference = BigInteger.valueOf((long) Math.round(sums - squares));
        System.out.println(sums);
        System.out.println(squares);
        System.out.println(difference);


    }

}
