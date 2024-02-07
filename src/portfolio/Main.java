package portfolio;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	// Create an instance of the Display class
        Display display = new Display();
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
        	// Display Menu
            System.out.println("--------Menu--------");
            System.out.println("1. Add Order");
            System.out.println("2. Remove Order");
            System.out.println("3. Display Order List");
            System.out.println("4. Exit");
            // Get user's menu choice
            int choice = getUserChoice(scanner); 
            
            switch (choice) {
                case 1:
                	// Call method to add an order
                    addOrder(display, scanner);
                    break;
                case 2:
                	// Call method to remove an order
                    removeOrder(display);
                    break;
                case 3:
                	// Display the list of orders
                    display.displayOrders();
                    break;
                case 4:
                	// Exit the program
                    System.out.println("Closing the program...");
                    System.exit(0);
                    break;
                default:
                	// Inform the user of an invalid choice
                    System.out.println("Invalid input.");
            }
        }
    }
    
    // Method to get user's menu choice
    private static int getUserChoice(Scanner scanner) {
        System.out.print("Enter option number: ");
        return scanner.nextInt(); // Return the user's choice
    }
    
    // Method to add a new order
    private static void addOrder(Display display, Scanner scanner) {
        System.out.print("Enter customer last name: ");
        String lastName = scanner.next();
        
        System.out.print("Enter order number: ");
        int orderNumber = scanner.nextInt();
        
        System.out.print("Enter order total: $");
        double orderTotal = scanner.nextDouble();
        
        Order newOrder = new Order(lastName, orderNumber, orderTotal);
        // Add the new order to the queue
        display.orderQueue.offer(newOrder);
        // Update the display after adding an order
        display.updateDisplay();

        System.out.println("Order was added successfully!");
    }
    
    // Method to remove an order
    private static void removeOrder(Display display) {
        if (!display.orderQueue.isEmpty()) {
        	// Remove the front order from the queue
            Order removedOrder = display.orderQueue.poll();
            // Update the display after removing an order
            display.updateDisplay();
            System.out.println("Order was removed: " + removedOrder.lastName);
        } else {
        	// Inform the user that the queue is empty
            System.out.println("Order queue is already empty.");
        }
    }
}
