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
    private String color;
    private int value;

    public Card(String color, int value) {
        this.setColor(color);
        this.setValue(value);
    }

    public String getColor() {
        return this.color;
    }

    public int getValue() {
        return this.value;
    }

    public static boolean isValidColor(String color) {
        for (int i = 0; i < COLORS.length; i++) {
            if (color == COLORS[i]) {
                return true;
            }
        }
        return false;
    }

    public void setColor(String newColor) {
        if (isValidColor(newColor) != true) {
            throw new IllegalArgumentException();
        }
        this.color = newColor;
    }

    public void setValue(int newValue) {
        if (newValue < MIN_VALUE || newValue > MAX_VALUE) {
            throw new IllegalArgumentException();
        }
        this.value = newValue;
    }

    public String toString() {
        return "" + this.color + " " + this.value;
    }

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
