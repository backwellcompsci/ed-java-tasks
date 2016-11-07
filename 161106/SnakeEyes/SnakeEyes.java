/*
 * Snake eyes
 * Edward Callow
 * 161107
 */

public class SnakeEyes {
	public static void main(String[] args) {
		int dieOne, dieTwo;
		int rollCounter = 0;
		do {
			dieOne = (int) (Math.random()*6) + 1;
			dieTwo = (int) (Math.random()*6) + 1;
			rollCounter++;
		} while (dieOne != 1 || dieTwo != 1 );

		System.out.println("There odds of rolling snake eyes are 1 in 36.");
		System.out.println("It took " + rollCounter + " attempts to roll snake eyes, bad luck.");
	}
}