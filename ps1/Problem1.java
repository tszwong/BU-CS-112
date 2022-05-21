/*
 * Problem1.java
 * 
 * Fixing a program with lots of syntax errors!
 * 
 * Completed by: Tsz Kit Wong
 */

import java.util.*;

public class Problem1 {
    /*
     * This static method should take an integer x and return:
     *    - the opposite of x when x is negative
     *    - 10 more than x when x is non-negative and even
     *    - the unchanged value of x when x is non-negative and odd
     */
    public static int adjust(int x){
        if (x < 0){
            x *= -1;
        }
        else if (x % 2 == 0){
            x =+ 10;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter an integer x: ");
        int x = console.nextInt();

        System.out.print("adjust(x) = " + adjust(x));
        console.close();
    }
}
