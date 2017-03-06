/*
 * linearSearchEngine
 * Edward Callow
 * 1700306
 */

import java.util.Scanner;
 
class linearSearchEngine {
	public static void main(String args[]) {
		int loc, num, search, array[];
	 
		/* Start scanner to take number of entires (line 16) and entry values (line 21)*/
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of entries");
		num = in.nextInt(); 
		array = new int[num];
	 
		System.out.println("Enter " + num + " integers");
		for (loc = 0; loc < num; loc++)
			array[loc] = in.nextInt();
	 
		/*Scanner takes search value*/
		System.out.println("Enter value to find");
		search = in.nextInt();
	 
		for (loc = 0; loc < num; loc++) {
	    /*Searching element is present*/
			if (array[loc] == search) {
				System.out.println("The entry '" + search + "' is present at location " + (loc + 1));
				break;
			}
		}

	   /* Searching element is absent */
	   if (loc == num) {
	      System.out.println(search + " is not present in the list");
	   }
	}
}