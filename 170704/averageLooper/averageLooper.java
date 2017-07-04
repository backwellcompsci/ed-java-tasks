/*
 * averageLooper
 * Edward Callow
 * 170704
 */

import java.io.*;
import java.util.*;

public class averageLooper {

	public static void main(String[] args) {

		double runningTotal = 0.0;
		int runNumber = 0;
		boolean run = true;
		double average = 0.0;

		while(run = true) {

			Scanner numInput = new Scanner (System.in);
			System.out.println("Enter a number: ");
			double newNumber = numInput.nextDouble();

			runningTotal = runningTotal + newNumber;
			runNumber = runNumber + 1;

			Scanner continueInput = new Scanner (System.in);
			System.out.println("Enter `1` to add an additional number, `2` to calculate the average or `3` to exit: ");
			double continueResponse = continueInput.nextDouble();

			if (continueResponse == 2) {
				average = runningTotal / runNumber;
				System.out.println("The average is " + average);
				System.exit(0);
			}

			else if (continueResponse == 3) {
				System.exit(0);
			}

			else {
				
			}
		}
	}
}