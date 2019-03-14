package edu.dmacc.codedsm.homework11;

import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Random;



public class Homework11<n> {

    public static Map<String, List<Integer>> createDeck() {
        Map<String, List<Integer>> deck = new HashMap<>();

        deck.put("Clubs", createCards());
        deck.put("Diamonds", createCards());
        deck.put("Spades", createCards());
        deck.put("Hearts", createCards());

        return deck;
    }

    public static List<Integer> createCards() {
        List<Integer> cards = new ArrayList<>();

        for ( int i = 1; i < 14; i++ ) {
            cards.add(i);

        }

        return cards;
    }


    public static void main(String[] args) {
        Map<String, List<Integer>> deck = createDeck();

        for (String suitInDeck : deck.keySet()) {
            List<Integer> cardsInDeck = deck.get(suitInDeck);

            for ( Integer cardValue : cardsInDeck ) {
                System.out.println(suitInDeck + " - " + cardValue);

            }
        }

    }
}