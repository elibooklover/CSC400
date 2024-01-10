package ct4;

import java.util.Stack;

public class PostfixConverter {
	
    public static String convertToPostfix(String infix) {
        // Stack to keep track of operators
        Stack<Character> operatorStack = new Stack<>();
        
        // StringBuilder to store the postfix expression
        StringBuilder postfix = new StringBuilder();
        
        // Variables for iterating through the infix expression
        char nextCharacter;
        int infixLength = infix.length();

        for (int i = 0; i < infixLength; i++) {
            nextCharacter = infix.charAt(i);
            
            switch (nextCharacter) {
                case ' ':
                    // Ignore spaces in the input expression
                    break;
                    
                case '(':
                    // Push open parenthesis onto the operator stack
                    operatorStack.push(nextCharacter);
                    break;
                    
                case ')':
                    // Pop operators from the stack and append to postfix until an open parenthesis is encountered
                    while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                        postfix.append(operatorStack.pop());
                    }
                    // Pop the open parenthesis from the stack
                    operatorStack.pop();
                    break;
                    
                case '+': case '-': case '*': case '/':
                	
                case '^':
                    // Pop operators with higher or equal precedence and append to the postfix expression
                    while (!operatorStack.isEmpty() && precedence(nextCharacter) <= precedence(operatorStack.peek())) {
                        postfix.append(operatorStack.pop());
                    }
                    // Push the '^' operator onto the stack
                    operatorStack.push(nextCharacter);
                    break;
                    
                default:
                    // Append operands directly to the postfix expression
                    postfix.append(nextCharacter);
                    break;
            }
        }

        // Pop any remaining operators from the stack and append to the postfix expression
        while (!operatorStack.isEmpty()) {
            postfix.append(operatorStack.pop());
        }

        // Return the final postfix expression as a string
        return postfix.toString();
    }

    // Determines the precedence of an operator.
    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                // Default case for unknown operators
                return -1;
        }
    }
}
