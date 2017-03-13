/*
 * oddOrEvenTester
 * Edward Callow
 * 1700309
 */

import java.util.Scanner;

class oddOrEvenTester {
	public static void main(String[] args) {
		int x;
		System.out.println("Enter an integer to check if it is odd or even. ");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		int modValue = x % 2;
		if (modValue == 0) {
			System.out.println("The entered integer is even.");
		}
		else {
			System.out.println("The entered integer is odd.");
		}
	}
}