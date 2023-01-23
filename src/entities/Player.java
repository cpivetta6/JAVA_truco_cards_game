package entities;

import java.util.ArrayList;
import java.util.List;

public class Player  {

	
	private String name;
	private Integer points;
	
	private  List<Card> cards = new ArrayList<Card>();
	
	
	public Player() {
		
	}

	public Player(String name, Integer points) {
		super();
		this.name = name;
		this.points = points;
	}
	

	

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}
	
	
	
}
