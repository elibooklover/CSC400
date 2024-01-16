package discussion;

public class module5 {

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Fibonacci of " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive method to calculate Fibonacci numbers
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            // Recursive call to calculate the sum of the two preceding Fibonacci numbers
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
