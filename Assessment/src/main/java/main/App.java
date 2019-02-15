package main;

public class App {

	public static void main(String[] args) {

		Boolean keepPlaying = true;

		GameHandler gm = new GameHandler();
		while (keepPlaying == true) {
			keepPlaying = gm.playGame();
		}

	}

}
