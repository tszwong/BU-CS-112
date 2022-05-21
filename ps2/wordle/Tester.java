/*
 * Tester.java 
 * 
 * A program that you can use to make test calls to the methods that you 
 * write as part of your Wordle implementation. 
 */

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // sample test for the includes method
        System.out.println("\nTesting includes method...");
        boolean result = Wordle.includes("hello", 'e');
        System.out.println("includes(\"hello\", 'e') returns " + result);

        // Add additional tests below to ensure that your methods
        // work correctly.

        console.close();
    }
}
