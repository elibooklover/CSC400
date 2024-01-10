package ct4;

public class PostfixConverterTest {

    // Main method to run the test cases.
    public static void main(String[] args) {
    	System.out.println("-----Postfix Converter Test-----\n");
    	testConversion("7*(2+3)", "723+*");
    	testConversion("(a+b)*(c-d)", "ab+cd-*");
    	testConversion("x^(y+z)/w", "xyz+^w/");
    	testConversion("1+2*3-4/5", "123*+45/-");
    }

    // Helper method to test the conversion of an infix expression to postfix.
    private static void testConversion(String infix, String expectedPostfix) {
    	
        // Call the conversion method
        String result = PostfixConverter.convertToPostfix(infix);

        // Output the results of the test
        System.out.println("Infix: " + infix);
        System.out.println("Expected Postfix: " + expectedPostfix);
        System.out.println("Actual Postfix: " + result);
        System.out.println("Test Result: " + (expectedPostfix.equals(result) ? "Passed" : "Failed"));
        System.out.println();
    }
}
