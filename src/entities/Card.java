package entities;

import entities.enums.Simbol;

public class Card {

	private Simbol simbol;
	private String name;
	
	public Card () {
		
	}

	public Card(Simbol simbol, String name) {
		super();
		this.simbol = simbol;
		this.name = name;
	}

	public Simbol getSimbol() {
		return simbol;
	}

	public void setSimbol(Simbol simbol) {
		this.simbol = simbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
