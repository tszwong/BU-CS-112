/*
 * Card.java
 * 
 * A blueprint class for objects that represent a single playing card 
 * for a game in which cards have both colors and numeric values.
 * 
 * starter code: CS 112 Staff (cs112-staff@cs.bu.edu)
 * completed by: Tsz Kit Wong
 */

public class Card {
    /* The smallest possible value that a Card can have. */
    public static final int MIN_VALUE = 0;
    
    /* The possible colors that a Card can have. */
    public static final String[] COLORS = {"blue", "green", "red", "yellow"};

    /* Define the third class constant here. */
    public static final int MAX_VALUE = 9;

    /* Put the rest of your class definition below. */
    // Card object fields
    private String color;
    private int value;

    // Card constructor
    public Card(String color, int value) {
        this.setColor(color);
        this.setValue(value);
    }

    // accessor that returns the string representing the Card object's color
    public String getColor() {
        return this.color;
    }

    // accessor that returns the integer representing the Card object's value
    public int getValue() {
        return this.value;
    }

    /* it should take the name of a color as a parameter, and it should return 
       true if the specified color is valid (i.e., if it is one of the colors 
       listed in the COLORS array), and false otherwise
    */
    public static boolean isValidColor(String color) {
        for (int i = 0; i < COLORS.length; i++) {
            if (color == COLORS[i]) {
                return true;
            }
        }
        return false;
    }

    // mutator that takes a String representing a color and sets the value 
    // of the Card object’s color field to the specified color
    public void setColor(String newColor) {
        if (isValidColor(newColor) != true) {
            throw new IllegalArgumentException();
        }
        this.color = newColor;
    }

    // mutator that takes an integer and sets the value of the Card
    // object’s value field to the specified number.
    public void setValue(int newValue) {
        if (newValue < MIN_VALUE || newValue > MAX_VALUE) {
            throw new IllegalArgumentException();
        }
        this.value = newValue;
    }

    // method that returns a String representation of the Card object
    public String toString() {
        return "" + this.color + " " + this.value;
    }

    // compares two Card objects(this and other) and determines if it's equivalent
    // based on the color and value
    public boolean matches(Card other) {
        if (other == null) {
            return false;
        }
        if (this.color == other.color || this.value == other.value) {
            return true;
        } else {
            return false;
        }
    }

    // compares two Card objects(this and other) and determines if it's exactly equivalent
    public boolean equals(Card other) {
        if (other == null) {
            return false;
        }
        if (this.color == other.color && this.value == other.value) {
            return true;
        } else {
            return false;
        }
    }
}