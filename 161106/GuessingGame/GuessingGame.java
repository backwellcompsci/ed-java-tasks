/*
 * Guessing game
 * Edward Callow
 * 161107
 */

import TextIO.getlnboolean;

public class GuessingGame {
	public static void main(String[] args) {
		System.out.println("Let’s play a game. I’ll choose a number 1 to 100 inclusive and you can try to guess it.");
		boolean playAgain;
		do {
			playTheGame();
			System.out.println("Would you like to play the greatest game on earth ... again?");
			playAgain = TextIO.getlnboolean();
		} while (playAgain);
		System.out.println("Thank you for playing. Goodbye.");
	}

	static void playTheGame() {
		int chosenNumber;
		int userGuess;
		int guessCount;
		chosenNumber = (int) (100 * Math.random()) + 1;

		guessCount = 0;
		System.out.println("\nWhat is your first guess?");
		while (true) {
			userGuess = TextIO.getIn();
			guessCount++;
			if (userGuess = chosenNumber) {
				System.out.println("Congratulations! You got it " + guessCount + " guesses. My number was " + chosenNumber);
				break;
			}
			if (guessCount == 6) {
				System.out.println("You failed to guess my number in 6 tries.");
				System.out.println("My number was " + chosenNumber);
				break;
			}
			if  (userGuess < chosenNumber)
				System.out.println("That’s too low, try again.");
			else if (userGuess > chosenNumber)
				System.out.println("That’s too high, try again.");
		}
	}
}