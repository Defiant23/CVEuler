package EulerProblems;

/**
 * Created by cvalencia on 6/7/16.
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
public class Problem7 extends Problem3 {

    public static void main(String args[]) {
        createPrimes(10002);
        //System.out.println(primes.toString());
        System.out.println(primes.get(primes.size()-1));
    }
}
