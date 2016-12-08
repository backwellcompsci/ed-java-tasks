
public class InsertionSort {
    public static void main(String[] args) {
        int []numbers= {10,5,3,7,2};
        
        sort(numbers);
        printArray(numbers);
    }
    public static int[] sort(int[] A){
        for(int i=1;i<A.length; i++){
            int key =A[i];                      // key is set to the value of index 1 of the array (5)
            int j = i-1;                        // j is set to the value of index 0 (1 - 1) of the array (10)
            
            while(j>=0 && A[j]>key) {           // while j is greater than 0 and greater than key
                A[j+1] = A[j];                  // A[J+1] is set to the value of A[j]
                j--;                            // takes 1 from j
            }
            A[j+1]= key;                        // A[J+1] is set to the value of key
        }
    
    return A;}

    public static void printArray(int[]A){      // define 
        for(int i=0; i<A.length; i++){
        System.out.println(A[i]);
    }

}
}