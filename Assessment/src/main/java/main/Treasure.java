package main;

public class Treasure {

	private int xPos;
	private int yPos;
	private int r;
	private int r2;

	public Treasure() {

		super();

		setxPos();
		setyPos();

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
