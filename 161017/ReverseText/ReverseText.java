/*
 * Strings: Reversing text challenge
 * Edward Callow
 * 161017
 */

import java.util.Scanner;
public class ReverseText {
	public static String reverse(String text) {
		String output = "";
		for (char character: text.toCharArray()) {
			output = character + output;
		}
		return output;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Type in your text: ");
		String text = kb.nextLine();
		System.out.println("In reverse order: " + reverse(text));
	}
}