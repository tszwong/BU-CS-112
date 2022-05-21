/*
 * TripComp.java
 * 
 * A program that allows a user to compute the cost of a trip by car,
 * based on the price of gas, the car's MPG (miles per gallon) rating,
 * and the distance of the trip.
 * 
 * CS 112 Course Staff (cs112-staff@cs.bu.edu)
 * 
 * completed by: your name and email
 * partner (if any): 
 */ 

import java.util.*; 

public class TripComp {
    /*
     * formattedCost - takes an arbitrary real number representing a cost
     * in dollars and returns a string representation of the cost with 
     * the format "d.cc", where d is the number of dollars and cc is the
     * number of cents rounded to two places after the decimal
     */
    public static String formattedCost(double cost) {
        String costString = String.format("%.2f", cost);
        return costString;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        /*
         * TO DO: replace each of the 0s below with a method
         * call that gets an integer from the user.
         * You MUST use the Scanner object created above
         * at the start of main. You may NOT construct an
         * additional Scanner object.
         */

        System.out.print("gas price in cents: ");
        int gasPrice = scan.nextInt();
        System.out.print("MPG rating of the car: ");
        int mpgRating = scan.nextInt();
        System.out.print("distance in miles: ");
        int distance = scan.nextInt();

        /*
         * TO DO: complete the rest of the program below.
         */

        double d_distance = distance;
        double priceAdjust = gasPrice / 100.00;
        double distanceRating = d_distance / mpgRating;
        double cost = priceAdjust * distanceRating;

        scan.close();
        
        System.out.println(gasPrice);
        System.out.println(mpgRating);
        System.out.println(distance);
        System.out.println("The cost of the trip is $" + formattedCost(cost) + ".");
    }
}
