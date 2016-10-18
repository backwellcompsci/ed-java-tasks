/*
 * Consolidation: Problem 3
 * Edward Callow
 * 161018
 */

public class Problem3 {
	public static void main(String[] args) {
		int currentNumber = 0;
		int counter = 10;
		while (counter >= 0) {
			System.out.println(currentNumber);
			currentNumber = currentNumber + 1;
			counter = counter - 1;
		}
	}
}