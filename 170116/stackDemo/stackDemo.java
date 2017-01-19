/*
 * stackDemo
 * Edward Callow
 * 170116
 */

import java.util.*;

public class stackDemo {
	public static void main(String[] args) {
		// creating a new stack ('st')
		Stack st = new Stack();

		// populating stack
		st.push("Java");
		st.push("source");
		st.push("code");

		// checking stack
		System.out.println("Is stack empty: " + st.empty());
		//checking top item
		System.out.println("Top object is: " + st.peek());
		// removing top object
		System.out.println("Removed object is: " + st.pop());

		// elements after removal
		System.out.println("Elements after removal: " + st);
	}
}