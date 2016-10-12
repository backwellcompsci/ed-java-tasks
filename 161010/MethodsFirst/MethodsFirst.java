/*
 * Methods and iteration: MethodsFirst
 * Edward Callow
 * 161010
 */

public class MethodsFirst {
	public static void main(String[] args) {
		int a = 10;
		int b = 6;


		int c = addition(a,b);
		int d = subtraction(a,b);
		System.out.println(a + " + " + b + " = " + c);
		System.out.println(a + " - " + b + " = " + d);
	}

	public static int addition(int num1, int num2) {
		int answer = num1 + num2;
		return answer;
	}

	public static int subtraction(int num1, int num2) {
		int answer = num1 - num2;
		return answer;
	}
}