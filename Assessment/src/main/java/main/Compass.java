package main;

public class Compass {

	private double dToTreasure;
	private Boolean tNotFound;

	public Compass(int playerXPos, int playerYPos, int treasureXPos, int treasureYPos) {

		super();

		this.dToTreasure = setDistance(playerXPos, playerYPos, treasureXPos, treasureYPos);
		this.tNotFound = true;

	}

	public double setDistance(int playerXPos, int playerYPos, int treasureXPos, int treasureYPos) {

		return this.dToTreasure = Math.sqrt(Math.pow(Math.abs(playerXPos) - Math.abs(treasureXPos), 2)
				+ (Math.pow(Math.abs(playerYPos) - Math.abs(treasureYPos), 2)));
	}

	public Boolean updateValues(int playerXPos, int playerYPos, int treasureXPos, int treasureYPos) {

		this.dToTreasure = setDistance(playerXPos, playerYPos, treasureXPos, treasureYPos);
		if (this.dToTreasure == 0) {
			this.tNotFound = false;
		}

		return tNotFound;
	}

	public Boolean gettFound() {
		return tNotFound;
	}

	public double getdToTreasure() {
		return dToTreasure;
	}
}
