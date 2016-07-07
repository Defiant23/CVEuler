package EulerProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by cvalencia on 6/1/16.
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

public class Problem3 {

    public static List<Integer> primes = new ArrayList<Integer>();
    public static Integer maxPrime = 0;
    public static List<Integer> primeFactors = new ArrayList<Integer>();
    public static Map<Integer, Integer> factorMap = new HashMap<Integer,Integer>();


    public static void main(String args[]){
        System.out.println("Calculate Prime Factors for what number?");
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        long startTime = System.currentTimeMillis();
        createPrimes(Math.sqrt((double)num));
        findLargestPrime(num, 0);
        factorialize();
        long endTime = System.currentTimeMillis();
        System.out.println("The largest prime number in " + num + " is: " + maxPrime);
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
        System.out.println("Prime Factors are: " + primeFactors.toString());
        System.out.println(factorMap.toString());
    }

    //I took this method largely from Google
    public static void createPrimes(double target){
        int num = 2, status = 1;
        double n = target;
        for ( int count = 2 ; count <=n ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                primes.add(num);
                count++;
            }
            status = 1;
            num++;
        }
    }

    public static void findLargestPrime(long num, int index) {
        while(index < primes.size() && num % primes.get(index) != 0){
            index++;
        }
        maxPrime = primes.get(index);
        primeFactors.add(maxPrime);
        num = num/maxPrime;
        if(num != 1 && index < primes.size()) {
            findLargestPrime(num, index++);
        }
    }

    public static void factorialize () {
        for (int i = 0; i < primeFactors.size(); i++) {
            if (!factorMap.containsKey(primeFactors.get(i))) {
                factorMap.put(primeFactors.get(i), 1);
            } else {
                factorMap.put(primeFactors.get(i), factorMap.get(primeFactors.get(i)) + 1);
            }
        }
    }
}
