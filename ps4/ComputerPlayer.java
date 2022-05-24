// ComputerPlayer.java
// By: Tsz Kit Wong
// Email: wongt@bu.edu

import java.util.*;

public class ComputerPlayer extends Player{

    // ComputerPlayer constructor
    public ComputerPlayer(String name) {
        super(name);
    }
    
    /* overrides the inherited version of that method. This version of the method 
       should simply print the number of cards in the ComputerPlayer‘s hand
    */
    public void displayHand() {
        String cardOrCards = " ";
        if (this.getNumCards() == 1) {
            cardOrCards += "card";
        } else {
            cardOrCards += "cards";
        }
        System.out.println("the " + this.getName() + "'s hand:\n" + "  " + this.getNumCards() + cardOrCards);
    }

    /* getPlay method that overrides the inherited version of that method
       This version of the method should figure out if the computer has a card that matches the card at 
       the top of the discard pile (this card is passed in as the second parameter of the method)
    */
    public int getPlay(Scanner console, Card cardObject) {
        int index = -1;
        int maxVal = 0;

        for (int i = 0; i < this.getNumCards(); i++) {
            if (this.getCard(i).matches(cardObject) && this.getCard(i).getValue() > maxVal) {
                maxVal = this.getCard(i).getValue();
                index = i;
            }
        }
        return index;
    }
}
