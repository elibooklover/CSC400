package ct6;

public class SortDetector {
	// Check if an array is sorted in ascending order
	public static boolean isSorted(int[] numArray) {
		int n = numArray.length;
		
        // Traverse the array and check if each element is less than or equal to the next one
        for (int i = 0; i < n - 1; i++) {
        	if (numArray[i] > numArray[i + 1]) {
        		return false; // Array is not sorted
        	}
        }
        return true; // Array is sorted
    }
}
