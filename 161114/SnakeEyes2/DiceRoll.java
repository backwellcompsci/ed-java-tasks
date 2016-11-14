/*
 * Snake eyes
 * Edward Callow
 * 161114
 */

public class DiceRoll {
	public static void main(String args[]) {
		rollToSnakeEyes();
	}
	
	public static void rollToSnakeEyes() {
		int rollsToSnakeEyes = 0;
		rollsToSnakeEyes = rollToTarget(2);
		
		System.out.println("It took " + rollsToSnakeEyes + " attempts to roll snake eyes, bad luck.");
		
	}
	
	public static int rollToTarget(int target) {
		int rolls = 0;
		
		if (!(target >= 2 && target <= 12)) {
			throw new IllegalArgumentException("Impossible target " + target);
		}
		
		int die1 = 0;
		int die2 = 0;
		
		while ((die1 + die2) != target) {
			die1 = rollDie();
			die2 = rollDie();
			rolls += 1;
		}
		
		return(rolls);
	}
	
	public static int rollDie() {
		int die = (int) (Math.random() * 6) + 1;
		return(die);
	}
}