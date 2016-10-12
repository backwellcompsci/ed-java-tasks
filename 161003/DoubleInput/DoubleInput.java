/* 
 * Datatypes, strings and scanners: DoubleInput
 * Edward Callow
 * 161003
 */

import java.util.Scanner;

public class DoubleInput{
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double number = kb.nextDouble();

		System.out.println("Enter an integer: " + number);
		System.out.println("2 * " + number + "= " + number*2);
	}
}