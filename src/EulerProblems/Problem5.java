package EulerProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by cvalencia on 6/2/16.
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 extends Problem3{

    private static boolean found;
    private static long sum = 1;
    private static Map<Integer, Integer> primeMap = new HashMap<Integer, Integer>();


    public static void main(String args[]) {
//        System.out.println("Calculate the least common multiple of what number?");
//        Scanner s = new Scanner(System.in);

        for (int i = 2; i < 21; i++) {
            createPrimes(i);
            findLargestPrime(i, 0);
            factorialize();
            Iterator it = factorMap.keySet().iterator();
            while ( it.hasNext() ) {
                Integer j = Integer.valueOf(it.next().toString());
                if (!primeMap.containsKey(j)) {
                    primeMap.put(j, 1);
                } else if (primeMap.get(j) < factorMap.get(j)){
                    primeMap.put(j, factorMap.get(j));
                }
            }
            clear();
        }
        System.out.println(primeMap.toString());

        Iterator it = primeMap.keySet().iterator();
        while (it.hasNext() ) {
            int key = Integer.valueOf(it.next().toString());
            sum = sum * (long)(Math.pow((double)key, (double)primeMap.get(key)));
        }
        System.out.println("Least Common Multiple is: " + sum);
    }

    private static void clear() {
        primes = new ArrayList<Integer>();
        primeFactors = new ArrayList<Integer>();;
        factorMap = new HashMap<Integer,Integer>();
        maxPrime = 0;
    }

}
