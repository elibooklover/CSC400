package ct6;

public class SortDetectorTest {
	
	public static void main(String[] args) {
        int[] sortedArray = {1, 3, 4, 5, 10};
        int[] unsortedArray = {11, 3, 7, 4, 20};
        
        // Output should be true
        System.out.println("Is sortedArray sorted? " + SortDetector.isSorted(sortedArray));
        // Output should be false
        System.out.println("Is unsortedArray sorted? " + SortDetector.isSorted(unsortedArray));
	}
}
