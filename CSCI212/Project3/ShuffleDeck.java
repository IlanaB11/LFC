/*
 *File: ShuffleDeck.java
 * use card class to make and shuffle a deck of cards
 * Author: Ilana Berlin
 * Version 2.4 11/04/2024
 */

import java.util.ArrayList; //for making list//
import java.util.Collections; //for shuffling// 

public class ShuffleDeck {
    public static void main(String[] args) {

        final int DECK_SIZE = 52;

        ArrayList<Card> cardDeck = new ArrayList<Card>();// create a list for cards//
        String[] cardSuits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        int cardsCreated = -1;

        System.out.println("Unshuffled Deck: ");
        for (String suit : cardSuits) { // for each suit//
            for (int val = 1; val <= DECK_SIZE / 4; ++val) { // create 13 cards//
                cardDeck.add(new Card(val, suit));
            }
        }
        for (Card card : cardDeck) {
            card.viewCard(); // print card//
        }

        System.out.println("\nShuffled Deck: ");
        Collections.shuffle(cardDeck); // shuffle deck//
        for (Card card : cardDeck) {
            card.viewCard(); // print card//
        }
    }
}
