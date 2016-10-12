/*
 * IfLoops
 * Edward Callow
 * 161006
 */

import java.util.Scanner;
public class IfLoops{
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();

		if (num < 3) {
			System.out.println("Number is less than 3");
		}
		else {
			System.out.println("Number is NOT less than 3");
		}
	}
}

