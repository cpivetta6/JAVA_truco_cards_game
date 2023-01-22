package entities.enums;

public enum Simbol {

	HEART(1), SPADES(2), DIAMOND(3), CLUBS(4);
	
	
	private Integer power;

	private Simbol(Integer power) {
		this.power = power;
	}

	public Integer getPower() {
		return power;
	}

	
}
	
