/*
 * Datatypes, strings and scanners: NumberOperations
 * Edward Callow
 * 161003
 */

import java.util.Scanner;

public class NumberOperations{
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double number = kb.nextInt();
		System.out.println(number * 2);
		System.out.println(number / 2);
		System.out.println(number * number);
		System.out.println(number + (number/2));
	}
}