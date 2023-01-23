package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
						
						System.out.println("Player 1 name:");
						String player = scan.next();
						
						player_1.setName(player);
						
						System.out.println("Player 2 name:");
						player = scan.next();
						
						player_2.setName(player);
						
						//Game Play
						
						Card mainCard = new Card();
						
						
						
						
						//CARD CASUAL DISTRIBUITION
							
							//main card casual
							int maxCards = 40;
							int pos = casualNumbers(maxCards--);
							
							
							mainCard = Deck.getCards().get(pos);
							Deck.removeCard(mainCard);
							
									
						
							//3 cards for player 1 and remove from deck
							
							player_1.getCards().addAll(Arrays.asList(Deck.addCard(casualNumbers(maxCards--)),Deck.addCard(casualNumbers(maxCards--)), Deck.addCard(casualNumbers(maxCards--))));
							
							
							//3 cards for player 2 and remove from deck
							
							
							player_2.getCards().addAll(Arrays.asList(Deck.addCard(casualNumbers(maxCards--)),Deck.addCard(casualNumbers(maxCards--)), Deck.addCard(casualNumbers(maxCards--))));
						
							//STARTING GAME
							
							int card_selection = 0;
							
							int p_points1 = 0;
							int p_points2 = 0;
							
							while(p_points1 < 12 || p_points2 < 12) {
								
								
							
							System.out.println("------------TRUCO GAME-----------------");
							System.out.println("-Points                               -");
							System.out.println("-Player1: " +p_points1+"                        -");
							System.out.println("-Player2: " +p_points2+"                        -");
							System.out.println("main card: "+ mainCard.getName() + mainCard.getSimbol());
							System.out.println("-               --------              -");
							System.out.println("-Cards Player 1:                      -");
							System.out.println(" 1. "+player_1.getCards().get(0).getName()+" "+player_1.getCards().get(0).getSimbol()+ "\n 2. " +
												   player_1.getCards().get(1).getName()+" "+player_1.getCards().get(1).getSimbol()+ "\n 3. " +
												   player_1.getCards().get(2).getName()+" "+player_1.getCards().get(2).getSimbol());
							System.out.println("-                                     -");
							System.out.println("-Cards PLayer 2:                      -");
							System.out.println(" 1. "+player_2.getCards().get(0).getName()+" "+player_2.getCards().get(0).getSimbol()+ "\n 2. " +
												   player_2.getCards().get(1).getName()+" "+player_2.getCards().get(1).getSimbol()+ "\n 3. " +
												   player_2.getCards().get(2).getName()+" "+player_2.getCards().get(2).getSimbol());
							System.out.println("-----------------------------------------");
							
							card_selection = scan.nextInt();
							
							}
							
							
							
							
						}
							
						
						
						
						
					}
					
					
			}
		
		
	
	
	

	public static Integer casualNumbers(int maxCards) {
		Integer casualNumber = ThreadLocalRandom.current().nextInt(0, maxCards);
		return casualNumber;
	}
	
	
}
