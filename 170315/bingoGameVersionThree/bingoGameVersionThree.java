import java.util.*;
import java.io.*;

public class bingoGameVersionThree {
	// Setup game
	public static void main(String args[]) {
		int[][] g = generateTwoDimensionArray(10, 10);
		printGrid(g);
	}
	
	public static int[][] generateTwoDimensionArray(int width, int height) {
		int[][] array = new int[width][height];
		int wi = 0;
		int he = 0;
		while (wi < 10) {
			while (he < 10) {
				array[wi][he] = (int) (Math.random() * 50);
				he ++;
			}
			he = 0;
			wi ++;
		}
		return(array);
	}
	
	public static void printGrid(int grid[][]) {
		for (int[] row : grid) {
			String reformatted = Arrays.toString(row);
			reformatted = reformatted.replace("[", "");
			reformatted = reformatted.replace("]", "");
		    System.out.println(reformatted);
		}
		
	}
}