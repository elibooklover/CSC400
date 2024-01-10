package ct3;

public class Exercise24 {

    public static void main(String[] args) {
        // Test array with one missing number
        int[] test = {4, 1, 5, 6, 3};
        
        // Find the missing number in the test array
        int missing = findMissingNum(test);

        // Print the result
        System.out.println("Missing number: " + missing);
    }

    // Function to find the missing number in an array
    public static int findMissingNum(int[] array) {
        // Length of the array
        int n = array.length;

        // Iterate from 1 to n+1 to find the missing number
        for (int i = 1; i <= n + 1; i++) {
            // Flag to check if the current number is found in the array
            boolean found = false;

            // Iterate through the array to check if the current number exists
            for (int j = 0; j < n; j++) {
                if (array[j] == i) {
                    // If the number is found, set the flag to true and break the loop
                    found = true;
                    break;
                }
            }

            // If the current number is not found in the array, it is the missing number
            if (!found) {
                return i;
            }
        }

        // If no missing number is found, return n+1 as the missing number
        return n + 1;
    }
}
