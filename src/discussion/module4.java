package discussion;
import java.util.Stack;

public class module4 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push three elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        // Show the top element of the stack
        System.out.println("Top element: " + stack.peek());

        // Pop two elements from the stack
        stack.pop();
        stack.pop();

        // Show the top element of the stack
        System.out.println("Top element: " + stack.peek());
    }

}
