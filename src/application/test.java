package application;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.ls.LSOutput;

import entities.Card;
import entities.Player;
import entities.enums.Simbol;

public class test {
	public static String str = "xyz";
	public static void main(String[] args) {

			
		List<Card> cards = new ArrayList<Card>();
		List<Card> player = new ArrayList<Card>();
		
		cards.add(new Card(Simbol.DIAMOND, "A"));
		cards.add(new Card(Simbol.DIAMOND, "B"));
		cards.add(new Card(Simbol.DIAMOND, "C"));
		
		player.add(cards.get(0));
		cards.remove(player.get(0));
		
		System.out.println("player");
		System.out.println(player.get(0).getName());
		
		System.out.println("cards after remove");
		for(Card c : cards) {
			System.out.println(c.getName());
		}
		
		cards.add(player.get(0));
		player.remove(0);
		
		System.out.println("cards");
		for(Card c : cards) {
			System.out.println(c.getName());
		}
		
		if(player != null) {
			System.out.println("player not null");
			
			for(Card c : player) {
				System.out.println("->" +c.getName());
			}
		}
		
		}
	
}
