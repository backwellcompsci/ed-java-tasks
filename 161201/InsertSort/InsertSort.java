/*
 * InsertionSort
 * Edward Callow
 * 161201
 */

import java.math.*;

public class InsertionSort {
    public static void main (String [] args) {
        int A []= new int [10];
        populateA(A);
        System.out.println("Beofre sorting");
        printA(A);
        
        int key; // which element we are trying to insert
        int i;
        
        for (int j =1;j<A.length;j++) { // see if elements are in order
            key=A[j]; // second element to sort
            i= j-1;

            while((i > -1) &&  (A[i]> key)) { //-1 array is out of bound
                A[i+1]= A[i]; // but key will not always be greater than key
                i= i-1; // updating value to i , keep moving to left
        	}

        	A[i+1]= key; // place for new key
    	}

    	System.out.println("After sorting");
    	printA(A);
    }

    public static void printA (int [] B) {
        for( int i=0; i<B.length;i++) {
            System.out.print(B[i] + " ");
        }
    }

    public static int [] populateA(int [] B) {
        for (int i=0; i<B.length; i++) {
            B[i]= (int)(Math.random()*100);
        }

        return B;
    }
}