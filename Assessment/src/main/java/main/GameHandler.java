package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GameHandler {

	private Boolean keepPlaying;

	public Boolean playGame() {

		keepPlaying = true;
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.##");

		Player p = new Player();
		Treasure t = new Treasure();
		Compass c = new Compass(p.getxPos(), p.getyPos(), t.getxPos(), t.getyPos());

		System.out.println(
				"You have awoken in a dreary place. \nYou cannot see anything worth noting other than a note and a small watch at your feet. \nAfter picking them up you read the letter, the letter reads... \n \n'Hidden in the mists of Sindr Swamp lies a treasure only few can find!' \n \nLooking at the watch you notice it isn't normal, it reads a single number. "
						+ df.format(c.getdToTreasure())
						+ "km \nAfter taking a few paces you notice it changes when you move. \nTry walking around (North = N, South = S, East = E and West = W) \n");

		while (keepPlaying == true) {
			System.out.println(df.format(c.getdToTreasure()) + "km");
			String move = sc.nextLine();
			movement(move, p, t, c);
		}

		System.out.println(
				"You have found a small rusted box. \nYou open it and inside you find the treasure \n \nIt is the secret to 7-balling someone at QA. \nYou clutch at them with a smile and skip towards the sun. \nThe End. \n \nWould you like to play again? (Y/N)");
		String endGame = sc.nextLine();

		if ("Y".equals(endGame.toUpperCase())) {
			return true;
		}

		return false;
	}

	public void movement(String direction, Player p, Treasure t, Compass c) {

		System.out.println(p.playerMove(direction));
		c.updateValues(p.getxPos(), p.getyPos(), t.getxPos(), t.getyPos());
		keepPlaying = c.gettFound();
	}
}
