package ct5;

public class RecursiveArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int firstIndex = 3;
        int lastIndex = 7;
        // Call the recursive method to display the result
        displayArrayBackward(array, firstIndex, lastIndex);
    }

    // Recursive method to display a portion of the array backward
    public static void displayArrayBackward(int[] arr, int first, int last) {
        if (first <= last && first >= 0 && last < arr.length) {
            // Display the current element (last entry in the portion first)
            System.out.print(arr[last] + " ");
            // Make a recursive call with the reduced portion
            displayArrayBackward(arr, first, last - 1);
        }
    }
}
