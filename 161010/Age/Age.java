/*
 * Methods and iteration: Conditional statements
 * Edward Callow
 * 161010
 */

 import java.util.Scanner;
 public class Age {
 	public static void main(String[] args) {
 		Scanner kb = new Scanner(System.in);
 		System.out.println("Enter your age");
 		int inputAge = kb.nextInt();
 		if (inputAge <= 1) {
 			System.out.println("Baby");
		}
		else if (inputAge < 13) {
			System.out.println("Child");
		}
		else if (inputAge < 18) {
			System.out.println("Teenager");
		}
		else if (inputAge > 17) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Unknown");
 		}

 	}
 }