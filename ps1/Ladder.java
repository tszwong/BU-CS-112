/*
Ladder.java
Completed by: Tsz Kit Wong
*/

import java.util.*; 

public class Ladder {
    public static void main (String args[]) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.print("height of ladder: ");
        int height = scan.nextInt();
        
        System.out.print("angle in degrees of ladder: ");
        int angle = scan.nextInt();
        
        double d_angle = angle;
        double radians = (d_angle * Math.PI) / 180.00;
        double length = height/(Math.sin(radians));
        double yards = length / 3;
        double remainder_feet = length % 3;

        System.out.println("The required length is:\n" + length + " feet\n" + yards + " yards");
        System.out.println((int)yards + " yards and " + remainder_feet + " feet");
        
        scan.close();
    }
}
