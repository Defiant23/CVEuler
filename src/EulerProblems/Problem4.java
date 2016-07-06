package EulerProblems;

/**
 * Created by cvalencia on 6/2/16.
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {

    private static int maxPal;

    public static void main(String args[]){
        for (int i = 100; i < 1000; i++) {
            for(int j = 100; j < 1000; j++) {
                if(isPal(String.valueOf(i*j))) {
                    if (i*j > maxPal) {
                        maxPal = i * j;
                    }
                }
            }
        }
        System.out.println(maxPal);
    }

    private static boolean isPal (String num) {
        for (int i = 0; i < num.length(); i++) {
            if(num.charAt(i) != (num.charAt((num.length()-1)-i))) {
                return false;
            }
        }
        return true;
    }
}
