// Player.java
// By: Tsz Kit Wong
// Email: wongt@bu.edu

import java.util.*;

public class Player {

    // Player object fields
    private String name;
    private Card[] hand;
    private int numCards;
    
    // Player constructor 
    public Player(String name) {
        this.name = name;
        this.numCards = 0;
        this.hand = new Card[CardMatch.MAX_CARDS];
    }

    // accessor that returns player's name
    public String getName() {
        return this.name;
    }

    // accessor that returns the number of card's in player's hand
    public int getNumCards() {
        return this.numCards;
    }

    // method that returns player's name
    public String toString() {
        return this.name;
    }

    /* mutator that adds specified card to the player's 
       hand filling the array from left to right
    */
    public void addCard(Card cardObject){
        if (cardObject == null || this.hand.length > CardMatch.MAX_CARDS) {
            throw new IllegalArgumentException();
        } else {
                this.hand[numCards] = cardObject;
                numCards++;
        }
    }

    /* accessor that takes an integer index as a parameter and returns the
       Card at the specified position in the player’s hand, without actually 
       removing the card from the hand
    */
    public Card getCard(int index) {
        boolean found = false;
        for (int i = 0; i < this.hand.length; i++) {
            if (i == index) {
                found = true;
            }
        }
        if (found != true) {
            throw new IllegalArgumentException(); 
        }
        return this.hand[index];
    }

    /* an accessor method named getHandValue that computes and returns the total 
       value of the player’s current hand plus an additional 20-point penalty if 
       the hand has the maximum number of cards 
    */
    public int getHandValue() {
        int handVal = 0;
        
        for (int i = 0; i < this.numCards; i++) {
            handVal += this.hand[i].getValue();
        }

        if (numCards >= CardMatch.MAX_CARDS) {
            handVal += CardMatch.MAX_CARDS_PENALTY;
        }

        return handVal;
    }

    /* an accessor method named displayHand that prints the current contents of the 
       player’s hand, preceded by a heading that includes the player’s name
    */
    public void displayHand() {
        System.out.println(this.name + "'s hand:");
        
        for (int i = 0; i < numCards; i++) {
            System.out.println("  " + i + ": " + hand[i].getColor() + " " + hand[i].getValue());
        }
    }

    /* a mutator method named removeCard that takes an integer index as a parameter 
       and both removes and returns the Card at that position of the player’s hand
    */
    public Card removeCard(int index){
        int lastIndex = 0;
        Card removedElement;

        if (index < 0 || index >= this.numCards) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 0; i < numCards; i++) {
                if (this.hand[i] != null) {
                    lastIndex = i;
                } else {
                    if (i != 0) {
                        lastIndex = i - 1;
                    } else {
                        return null;
                    }
                }
            }

            // swap
            removedElement = this.hand[index];
            this.hand[index] = this.hand[lastIndex];
            this.hand[lastIndex] = null;
            numCards--;
        }
        
        return removedElement;
    }

    /* an accessor method named getPlay that determines and returns the number corresponding to the 
       player’s next play: either -1 if the player wants to draw a card, or the number/index of the card 
       that the player wants to discard from his/her hand
    */
    public int getPlay(Scanner console, Card topDiscardCard) {
        int move = 0;

        while (true) {
            System.out.print("number of card to play (-1 to draw)? ");
            move = console.nextInt();

            if (move == -1 || (move < numCards && move >= 0)) {
                break;
            }
        }
        return move;
    }
}
