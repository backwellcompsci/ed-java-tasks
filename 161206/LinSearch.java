/*
 * Linear search
 * Edward Calllow
 * 161206
 */


public class LinSearch {
	public static void main(String[] args) {
    	int searchTerm = 21;
    	int[] arrayThingy = {1, 69, 42 ,36, 24};
        boolean found = false;
        int position = 0;

        while (found == false && position <= (listLength - 1)) {
        	if (arrayThingy[position] == searchTerm) {
        		found = true;
        	}
        	else {
        		position ++;
        	}
        }

    if (found == true) {
    	System.out.println("")