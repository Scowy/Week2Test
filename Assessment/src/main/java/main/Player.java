package main;

public class Player {

	private int xPos;
	private int yPos;

	public Player() {

		super();

		this.xPos = 0;
		this.yPos = 0;
	}

	public String playerMove(String direction) {

		switch (direction.toUpperCase()) {
		case "N":
			return moveNorth();
		case "S":
			return moveSouth();
		case "W":
			return moveWest();
		case "E":
			return moveEast();
		default:
			return "That is not a direction";
		}

	}

	public String moveNorth() {
		this.yPos += 1;
		return "You walked North";
	}

	public String moveSouth() {
		this.yPos -= 1;
		return "You walked South";
	}

	public String moveEast() {
		this.xPos += 1;
		return "You walked East";
	}

	public String moveWest() {
		this.xPos -= 1;
		return "You walked West";
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

}
