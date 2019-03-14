package edu.dmacc.codedsm.homework11;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Deal {

    public static <deck> void main(String[] args) {

        //init -
        Deck deck = new Deck();

        Deck theDeck = deck.getDeck();
        Scanner sc = new Scanner(System.in);
       // deck theDeck = new deck(1, true);

        //init the player objects
        Player  me = new Player ("Sheryl");
        Player two = new Player ("Nate");

        me.addCard(theDeck.dealNextCard());
        two.addCard(theDeck.dealNextCard());
        me.addCard(theDeck.dealNextCard());
        two.addCard(theDeck.dealNextCard());

        //print inital jhands
        System.out.println("Cards are dealt\n");
        System.out.println("Cards are dealt\n");
        System.out.println("\n");

        //flags for when each player is finished hitting
        boolean meDone = false;
        boolean twoDone = false;
        String ans;

        while (!meDone || !twoDone) {

            // player's turn
            if (!meDone) {

                System.out.println("Hit or Stay? (Enter H or S): ");
                ans = sc.next();
                System.out.println();

                // if player hits
                if (ans. compareToIgnoreCase("H") == 0) {

                    //add next card in the deck and store whether player is busted
                    meDone = !me.addCard(theDeck.dealNextCard());
                } else {
                    meDone = true;
                }
            }
            // Nates turn
            if (!twoDone) {

                System.out.println("Hit or Stay? (Enter H or S): ");
                ans = sc.next();
                System.out.println();

                // if Nate hits
                if (ans. compareToIgnoreCase("H") == 0) {

                    //add next card in the deck and store whether player is busted
                    twoDone = !two.addCard(theDeck.dealNextCard());
                } else {
                    twoDone = true;
                }
            }

            System.out.println();
        }

        //close scanner
        sc.close();

        //print final hands
        me.printHand(true);
        two.printHant(true);

        int mySum = me.getHandSum();
        int twoSum = two.getHandSum();

        if (mySum > twoSum && mySum <= 21 || twoSum > 21){
            System.out.println("You Win!");
        } else {
            System.out.println("Nate Wins!");
        }
    }
}
