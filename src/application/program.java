package application;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import entities.Card;
import entities.Deck;
import entities.Player;

public class program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Deck.CreateDeck();
		
		System.out.println(Deck.getCards().get(0).getName());
		
		int option = 0;
		
			while(option != 2) {
				System.out.println("-----------Truco Game -------------");
				System.out.println("1. Player Vs Player");
				System.out.println("2. Exit");
				option = scan.nextInt();
				
					if(option != 1 && option != 2) {
						System.out.println("Invalid Option");
					}
						
					if(option == 1) {
						
						//Create Players
						Player player_1 = new Player();
						Player player_2 = new Player();
						
						player_1.setPoints(0);
						player_2.setPoints(0);
						
						player_1.setName("Player 1");
						player_2.setName("Player 2");
						
						//STARTING GAMEPLAYS
						
						
						//created the main card
						Card mainCard = new Card();
						
						//CARD CASUAL DISTRIBUITION
							
							//max cards in the deck
							//each cycle of the distribution i will have less cards in the deck
							//and 3 cards for each player
						
							int maxCards = 40;
							int pos = casualNumbers(maxCards--);
							
							//casual card for the main card
							mainCard = Deck.getCards().get(pos);
							Deck.removeCard(mainCard);
							
									
						
							//3 casual cards for player 1 and remove from deck
							player_1.getCards().addAll(Arrays.asList(Deck.addCard(casualNumbers(maxCards--)),Deck.addCard(casualNumbers(maxCards--)), Deck.addCard(casualNumbers(maxCards--))));
							
							
							//3 casual cards for player 2 and remove from deck
							player_2.getCards().addAll(Arrays.asList(Deck.addCard(casualNumbers(maxCards--)),Deck.addCard(casualNumbers(maxCards--)), Deck.addCard(casualNumbers(maxCards--))));
						
							
							
							
							// 	----------------STARTING GAME------------------
							
							
							//cards support
							Card cardp1 = new Card();
							Card cardp2 = new Card();
							
							//round numbers
							int rounds = 0;
							
							
							//player points
							int p_points1 = 0;
							int p_points2 = 0;
							
							
							//STARTING ROUND GAMEPLAY
							
							while(rounds < 3) {
								
							
							System.out.println("------------TRUCO GAME-----------------");
							System.out.println("-                                     -");
							System.out.println("	Player1: " +p_points1+" | Player2: " +p_points2+"          -");
							System.out.println("-                                     -");
							System.out.println("	main card: "+ mainCard.getName() + mainCard.getSimbol());
							System.out.println("-               --------              -");
							
							
							//PLAYER 1 PLAY
							int card_option = 0;
							
							
								
								System.out.println("-Cards Player 1:                      -");
								
								for(Card c : player_1.getCards()) {
									
									System.out.println((card_option+1) + ") "  +  c.getName()+ "-" + c.getSimbol());
									card_option++;
								}
								
								//card selection position
								int card_selection = 0;
								
								//-----------------------------------------------------------------------------
								//WHILE 
								while(card_selection < 1 || card_selection > card_option) {
									System.out.println("Player 1 to play: select card 1, 2, 3");
									card_selection = scan.nextInt();
								
								}
								card_selection--;
							
								
								//-----------------------------------------------------------------------------	
							//PLAYER 1 PLAY : PRINT
							System.out.println("Player 1 : " + player_1.getCards().get(card_selection).getName() + " " + player_1.getCards().get(card_selection).getSimbol());
							cardp1 = player_1.getCards().get(card_selection);
							
							//REMOVE PLAYER 1 CARD PLAYED
							player_1.getCards().remove(card_selection);
								
							
							card_option = 0;
							
							//-----------------------------------------------------------------------------
							//PLAYER 2 PLAY
							System.out.println("-                                     -");
							System.out.println("-Cards PLayer 2:                      -");
							
							for(Card c : player_2.getCards()) {
								
								System.out.println((card_option+1)  +") " +  c.getName()+ "-" + c.getSimbol());
								card_option++;
							}
							
							System.out.println("-----------------------------------------");
							
							//WHILE
							while(card_selection < 1 || card_selection > card_option) {
								System.out.println("Player 2 to play: select card 1, 2, 3");
								card_selection = scan.nextInt();
							}
							card_selection--;
							//PLAYER 2 PLAY: PRINT
							System.out.println("Player 2 : " + player_2.getCards().get(card_selection).getName() + " " + player_2.getCards().get(card_selection).getSimbol());
							cardp2 = player_2.getCards().get(card_selection);
							
							//REMOVE CARD PLAYER 2
							player_2.getCards().remove(card_selection);
							
							System.out.println("Card Player 1: " +cardp1.getName() + " " + cardp1.getSimbol());
							System.out.println("vs");
							System.out.println("Card Player 2: " +cardp2.getName() + " " + cardp2.getSimbol());
							
							
							
							
							if(classPower(cardp1, mainCard) > classPower(cardp2, mainCard)) {
									p_points1++;
								}else {
									p_points2++;
								}
							
								rounds ++;
							
							
							}
							
							if(p_points1 > p_points2) {
								System.out.println("Player 1 wins");
							}else {
								System.out.println("Player 2 wins");
							}
							
							
							
							scan.close();
							
							
							
						}
							
						
						
						
						
					}
					
					
			}
		
		
	
	
	

	public static Integer casualNumbers(int maxCards) {
		Integer casualNumber = ThreadLocalRandom.current().nextInt(0, maxCards);
		return casualNumber;
	}
	
	public static int classPower(Card card, Card mainCard) {
		int point = 0;
		
		Map<String, Integer> mapPoints = new HashMap<>();
		
		mapPoints.put("4", 1);
		mapPoints.put("5", 2);
		mapPoints.put("6", 3);
		mapPoints.put("7", 4);
		mapPoints.put("Q", 5);
		mapPoints.put("J", 6);
		mapPoints.put("K", 7);
		mapPoints.put("A", 8);
		mapPoints.put("2", 9);
		mapPoints.put("3", 10);
		
		point = mapPoints.get(card.getName());
		
		
		return point;
	}
	
}
