package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.Simbol;

public class Deck {
	
	

	private static List<Card> cards = new ArrayList<Card>();
	
	
	
	public static void printCards() {
		for(Card x : cards) {
			System.out.println(x.getName() + " " + x.getSimbol());
		}
	}
	
	
	public static void addCardDiamond(String simbol) {
		cards.add( new Card(Simbol.DIAMOND, simbol));
	}
	
	public static void addCardSpades(String simbol) {
		cards.add( new Card(Simbol.SPADES, simbol));
	}
	
	public static void addCardHeart(String simbol) {
		cards.add( new Card(Simbol.HEART, simbol));
	}
	
	public static void addCardClubs(String simbol) {
		cards.add( new Card(Simbol.CLUBS, simbol));
	}
	
	public static void CreateDeck() {
		addCardClubs("A");
		addCardClubs("2");
		addCardClubs("3");
		addCardClubs("4");
		addCardClubs("5");
		addCardClubs("6");
		addCardClubs("7");
		addCardClubs("Q");
		addCardClubs("J");
		addCardClubs("K");
		
		addCardDiamond("A");
		addCardDiamond("2");
		addCardDiamond("3");
		addCardDiamond("4");
		addCardDiamond("5");
		addCardDiamond("6");
		addCardDiamond("7");
		addCardDiamond("Q");
		addCardDiamond("J");
		addCardDiamond("K");
		
		addCardHeart("A");
		addCardHeart("2");
		addCardHeart("3");
		addCardHeart("4");
		addCardHeart("5");
		addCardHeart("6");
		addCardHeart("7");
		addCardHeart("Q");
		addCardHeart("J");
	    addCardHeart("K");
		
		addCardSpades("A");
		addCardSpades("2");
		addCardSpades("3");
		addCardSpades("4");
		addCardSpades("5");
		addCardSpades("6");
		addCardSpades("7");
		addCardSpades("Q");
		addCardSpades("J");
		addCardSpades("K");
	}


	public static List<Card> getCards() {
		return cards;
	}


	public static void setCards(List<Card> cards) {
		Deck.cards = cards;
	}
	
	public static void removeCard(Card card) {
		cards.remove(card);
	}
	
	public static Card addCard(int pos) {
		Card card = cards.get(pos);
		
		System.out.println(card.getName() + card.getSimbol());
		
		removeCard(card);
		
		return card;
	}
	
	
}
