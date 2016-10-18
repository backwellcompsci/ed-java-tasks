/*
 * Consolidation: Problem 4
 * Edward Callow
 * 161018
 */

import java.util.Scanner;
public class Problem4 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Angle 1: ");
		double angle1 = kb.nextDouble();
		System.out.println("Angle 2: ");
		double angle2 = kb.nextDouble();
		System.out.println("Missing angle = " + (180 - (angle1 + angle2)) + "°");
	}
}