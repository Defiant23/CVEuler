package EulerProblems;

import java.util.Scanner;

/**
 * Created by cvalencia on 6/1/16.
 * Prompt: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {

    public static void main(String args[]){
        System.out.println("What number would you like to go to?");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int total = 0;
        for (int i = 0; i < num; i++) {
            if(i%3 == 0 || i%5 == 0) {
                //System.out.println("First multiple: " + i);
                total += i;
            }
        }
        System.out.println(total);

    }
}
