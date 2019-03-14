package edu.dmacc.codedsm.homework11;

import java.util.ArrayList;

public class Player {


    private String firstName;
    private ArrayList<Card> myHand;

    public Player(String firstName) {

        this.firstName = firstName;
    }

    public boolean addCard(Card nextCard) {
        myHand.add(nextCard);

        return false;
    }

    public void printHand() {
        System.out.println(myHand.toString());

    }

    public void printHant(boolean b) {
    }

    public int getHandSum() {
        return 0;
    }

    public void printHand(boolean b) {
    }
}
