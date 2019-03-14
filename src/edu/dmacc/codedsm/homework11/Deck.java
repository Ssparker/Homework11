package edu.dmacc.codedsm.homework11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deck {

    private Map<String, List<Integer>> deck;

    public Deck getDeck() {
        return this;
    }

    public Deck (){
        deck = new HashMap<>();

        deck.put("Clubs", createCards());
        deck.put("Diamonds", createCards());
        deck.put("Spades", createCards());
        deck.put("Hearts", createCards());
    }

    public static List<Integer> createCards() {
        List<Integer> cards = new ArrayList<>();

        for (int i = 1; i < 14; i++) {
            cards.add(i);

        }

        return cards;
    }

    public Card dealNextCard() {
        return null;
    }
}
