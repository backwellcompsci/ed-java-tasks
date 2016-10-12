/* 
 * Datatypes, strings and scanners: TimesTable
 * Edward Callow
 * 161003
 */

import java.util.Scanner;

public class TimesTable{
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 10 (both included)");
		Integer number = kb.nextInt();

		System.out.println(number + " x 0 = " + number*0);
		System.out.println(number + " x 1 = " + number*1);
		System.out.println(number + " x 2 = " + number*2);
		System.out.println(number + " x 3 = " + number*3);
		System.out.println(number + " x 4 = " + number*4);
		System.out.println(number + " x 5 = " + number*5);
		System.out.println(number + " x 6 = " + number*6);
		System.out.println(number + " x 7 = " + number*7);
		System.out.println(number + " x 8 = " + number*8);
		System.out.println(number + " x 9 = " + number*9);
		System.out.println(number + " x 10 = " + number*10);
	}
}