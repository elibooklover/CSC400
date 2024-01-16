package ct5;

public class Factorial {
	
	// First recursive method
	public static int factorialRecursion1(int n) {
		if (n == 0) { // Base case is 0
			return 1;
		} else {
			return n * factorialRecursion1(n - 1); // Recursive call until the base case is reached
		}
	}
	
	// Second recursive method
	public static int factorialRecursion2(int n) {
		// More concise version of the first method, but the base case is less than 1.
		return (n <= 1) ? 1 : n * factorialRecursion2(n - 1);
	}

}
