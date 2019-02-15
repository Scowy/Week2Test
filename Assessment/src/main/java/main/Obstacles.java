package main;

/* Not implemented in the game, is a class is for expanding on the first release */

public class Obstacles {

	private int xPos;
	private int yPos;
	private int r;
	private int r2;
	private Boolean poscheck;

	public Obstacles(int treasureXPos, int treasureYPos) {

		super();
		
		poscheck = false;
		
		setxPos();
		setyPos();
		
		if(treasureXPos == getxPos() && treasureYPos == getyPos()) {
			
		}

		this.xPos = getxPos();
		this.yPos = getyPos();
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos() {
		r = 0;
		r2 = (int) (Math.random() * 10);

		if (r2 < 5) {
			r = Math.negateExact((int) (Math.random() * 10));
		} else {
			r = (int) (Math.random() * 10);
		}

		if (r < 3) {
			r += 9;
		}

		this.xPos = r;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos() {
		r = 0;
		r2 = (int) (Math.random() * 10);

		if (r2 < 5) {
			r = Math.negateExact((int) (Math.random() * 10));
		} else {
			r = (int) (Math.random() * 10);
		}

		if (r < 3) {
			r += 9;
		}

		this.yPos = r;
	}

}
