/*
 * Datatypes, strings and scanners: GreetMe
 * Edward Callow
 * 161003
 */

import java.util.Scanner;

public class GreetMe{
	public static void main(String[] args) {
		System.out.println("What is your name?");
		Scanner kb = new Scanner(System.in);
		String name = kb.nextString();
		
		System.out.println("Hello " + name + "! How are you?");
	}
}