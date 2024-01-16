package ct5;

public class FactorialTest {

    public static void main(String[] args) {
        // Test the first recursive method
        testFactorialRecursion1();

        // Test the second recursive method
        testFactorialRecursion2();
    }

    // Method to test the first recursive method
    private static void testFactorialRecursion1() {
        // Print a label for the test
        System.out.println("factorialRecursion1 Test");
        
        // Input value for the test
        int input1 = 7;
        // Call the first recursive method and store the result
        int result1 = Factorial.factorialRecursion1(input1);
        // Display the test result
        System.out.println("Factorial of " + input1 + " is: " + result1);
        System.out.println(); // Add a newline for clarity
    }

    // Method to test the second recursive method
    private static void testFactorialRecursion2() {
        // Print a label for the test
        System.out.println("factorialRecursion2 Test");
        
        // Input value for the test
        int input2 = 7;
        // Call the second recursive method and store the result
        int result2 = Factorial.factorialRecursion2(input2);
        // Display the test result
        System.out.println("Factorial of " + input2 + " is: " + result2);
        System.out.println(); // Add a newline for clarity
    }
}
