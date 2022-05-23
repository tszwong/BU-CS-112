/**
 * First test client for the Card problem.
 * 
 * Do not open until after you have completed parts 1-6.
 */

public class Client1 {
    public static void processCard(Card c) {
        String color = c.getColor();
        System.out.println("getColor: " + color);
        int value = c.getValue();
        System.out.println("getValue: " + value);
        System.out.println();
    }
    
    public static void main(String[] args) {  
        boolean test1 = Card.isValidColor("blue");
        System.out.println("test1 (blue, should be true) = " + test1);

        boolean test2 = Card.isValidColor("Blue");
        System.out.println("test2 (Blue, should be false) = " + test2);

        boolean test3 = Card.isValidColor("yellow");
        System.out.println("test3 (yellow, should be true) = " + test3);

        boolean test4 = Card.isValidColor("purple");
        System.out.println("test4 (purple, should be false) = " + test4);

        System.out.println("creating card c1 (red 4):");
        Card c1 = new Card("red", 4);
        processCard(c1);
        
        System.out.println("creating card c2 (green 9):");
        Card c2 = new Card("green", 9);
        processCard(c2);
        
        System.out.println("creating card c3 (blue 0):");
        Card c3 = new Card("blue", 0);
        processCard(c3);
        
        // Changing an existing card using the mutators.
        System.out.println("changing card c3 to yellow 7:");
        c3.setColor("yellow");
        c3.setValue(7);
        processCard(c3);
        
        // Try to create invalid Cards. You may want to add additional tests
        // for invalid values.
        System.out.println("Trying to create a Card with a color of purple...");
        try {
            Card c4 = new Card("purple", 7);
            System.out.println("failed to throw an IllegalArgument Exception...");           
        } catch(IllegalArgumentException e) {
            System.out.println("correctly threw an IllegalArgumentException...");
        }
        System.out.println();
        
        System.out.println("Trying to create a Card with a value of -5...");
        try {
            Card c5 = new Card("yellow", -5);
            System.out.println("failed to throw an IllegalArgument Exception...");           
        } catch(IllegalArgumentException e) {
            System.out.println("correctly threw an IllegalArgumentException...");
        }
        System.out.println();
        
        // Try to make invalid changes to an existing Card. 
        // You may want to add additional tests here, too.
        System.out.println("Trying to change c1's color to gold...");
        try {
            c1.setColor("gold");
            System.out.println("failed to throw an IllegalArgument Exception...");           
            System.out.println();
        } catch(IllegalArgumentException e) {
            System.out.println("correctly threw an IllegalArgumentException...");
            System.out.println("c1 should still be red 4:");
            processCard(c1);
        }
        
        System.out.println("Trying to change c2's value to 10...");
        try {
            c2.setValue(10);
            System.out.println("failed to throw an IllegalArgument Exception...");           
            System.out.println();
        } catch(IllegalArgumentException e) {
            System.out.println("correctly threw an IllegalArgumentException...");
            System.out.println("c2 should still be green 9:");
            processCard(c2);
        }
    }
}
