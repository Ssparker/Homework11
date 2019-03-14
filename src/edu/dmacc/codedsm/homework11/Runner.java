package edu.dmacc.codedsm.homework11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static edu.dmacc.codedsm.homework11.Deck.createCards;
import static edu.dmacc.codedsm.homework11.Homework11.createDeck;

public class Runner {

    public static void main(String[] args) {
        Map<String, List<Integer>> deck = createDeck();
        List<Card> chosenCards = DeckRandomizer.chooseRandomCards(deck, 2);
        //remove cards
        removeChoosenCardsFromDeck(deck, chosenCards);

        promptUserWithCards(chosenCards);
        promptUserToHitOrStay(chosenCards, deck);
        int sum = 0;
        for(int i=0; i<chosenCards.size();i++){
            sum = sum + chosenCards.get(i).value;
        }
        System.out.println("Total sum value of cards choosen:" + sum);
    }

    private static void removeChoosenCardsFromDeck(Map<String, List<Integer>> deck, List<Card> cards) {
        Card card;
        for(int i=0; i<cards.size(); i++){
            card = cards.get(i);
            List<Integer> list = deck.get(card.suit);
            list.remove(card.value);
        }
    }

    private static void promptUserWithCards(List<Card> cards){
        for ( int i=0; i<cards.size(); i++ ){
            System.out.println("Card:" + cards.get(i).toString());
        }

    }
    //code to console
    private static void promptUserToHitOrStay(List<Card> cards, Map<String, List<Integer>> deck ){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int numberOfHitOrStay = 0;
        while (flag) {
            System.out.print("Hit or Stay? (Enter H or S) ");
            String ans = scanner.next();
            System.out.println();
            if ("H".equalsIgnoreCase(ans)){
                List<Card> hitCards = DeckRandomizer.chooseRandomCards(deck, 1);
                removeChoosenCardsFromDeck(deck, hitCards);
                System.out.println("Player choose to Hit; And Card:" + hitCards.get(0));
                cards.addAll(hitCards);
                numberOfHitOrStay++;
            } else if("S".equalsIgnoreCase(ans)){
                System.out.println("Player choose to Stay");
                numberOfHitOrStay++;
            } else{
                System.out.println("Invalid input, please enter valid values.");
            }
            if(numberOfHitOrStay == 2){
                break;
            }
        }
    }


    private static Map<String, List<Integer>> createDeck() {
        Map<String, List<Integer>> deck = new HashMap<>();
        deck.put("Clubs", createCards());
        deck.put("Diamonds", createCards());
        deck.put("Spades", createCards());
        deck.put("Hearts", createCards());
        return deck;
    }

    private static List<Integer> createCards() {
        List<Integer> cards = new ArrayList<>();
        for ( int i = 1; i < 14; i++ ) {
            cards.add(i);
        }
        return cards;
    }
}