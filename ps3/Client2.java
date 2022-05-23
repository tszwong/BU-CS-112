/**
 * Second test client for the Card problem.
 * 
 * Do not open until after you have completed all parts of the problem.
 */

public class Client2 {
    public static void main(String[] args) {
        Card c1 = new Card("red", 4);
        Card c2 = new Card("green", 9);
        Card c3 = new Card("blue", 0);
        Card c4 = new Card("red", 9);
        Card c5 = new Card("green", 9);
        
        // test the toString() method. 
        // Note that we *don't* need to call it explicitly.
        // It gets called automatically as part of the concatenation.
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
        System.out.println("c5 = " + c5);
        System.out.println();
        
        // test the matches() method
        System.out.println("c1.matches(c1) = " + c1.matches(c1));
        System.out.println("c1.matches(c2) = " + c1.matches(c2));
        System.out.println("c1.matches(c4) = " + c1.matches(c4));
        System.out.println("c2.matches(c3) = " + c2.matches(c3));
        System.out.println("c2.matches(c4) = " + c2.matches(c4));
        System.out.println("c2.matches(c5) = " + c2.matches(c5));
        System.out.println("c2.matches(null) = " + c2.matches(null));
        System.out.println();
        
        // test the equals() method
        System.out.println("c1.equals(c1) = " + c1.equals(c1));
        System.out.println("c1.equals(c2) = " + c1.equals(c2));
        System.out.println("c1.equals(c4) = " + c1.equals(c4));
        System.out.println("c2.equals(c3) = " + c2.equals(c3));
        System.out.println("c2.equals(c4) = " + c2.equals(c4));
        System.out.println("c2.equals(c5) = " + c2.equals(c5));
        System.out.println("c2.equals(null) = " + c2.equals(null));
    }
}