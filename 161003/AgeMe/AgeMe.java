/*
 * Datatypes, strings and scanners: AgeMe
 * Edward Callow
 * 161003
 */

import java.util.Scanner;

public class AgeMe{
	public static void main(String[] args) {
		System.out.println("How old are you?");
		Scanner kb = new Scanner(System.in);
		Integer age = kb.nextInt();
		Integer ten = 10;
		Integer newAge = age + ten;
		System.out.println("In 10 years you will be " + newAge + " years old!");
	}
}