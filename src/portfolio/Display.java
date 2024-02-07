package portfolio;

import java.util.LinkedList;
import java.util.Queue;

class Display {
	// Queue to hold orders
    Queue<Order> orderQueue = new LinkedList<>();
    // Array to store orders sorted by name
    Order[] sortedByName;
    // Array to store orders sorted by order number
    Order[] sortedByNumber;

    public void updateDisplay() {
    	// Convert queue to array (sortedByName)
        sortedByName = orderQueue.toArray(new Order[0]);
        // Convert queue to array (sortedByNumber)
        sortedByNumber = orderQueue.toArray(new Order[0]);

        // Sort by name (descending order)
        quickSort(sortedByName, 0, sortedByName.length - 1, true);

        // Sort by order number (descending order)
        quickSort(sortedByNumber, 0, sortedByNumber.length - 1, false);
    }
    
    // Implement the quicksort algorithm for sorting orders
    private void quickSort(Order[] arr, int low, int high, boolean sortByLastName) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high, sortByLastName);
            
            // Recursively sort the sub-arrays
            quickSort(arr, low, pivotIndex - 1, sortByLastName);
            quickSort(arr, pivotIndex + 1, high, sortByLastName);
        }
    }
    
    // Partition step of the quicksort algorithm
    private int partition(Order[] arr, int low, int high, boolean sortByLastName) {
        Order pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
        	// Compare elements based on the specified sorting criteria
            if ((sortByLastName && arr[j].lastName.compareToIgnoreCase(pivot.lastName) >= 0) ||
                (!sortByLastName && arr[j].orderNumber >= pivot.orderNumber)) {
                i++;
                // Swap elements
                Order temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap the pivot element to its correct position
        Order temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        // Return the index of the pivot element
        return i + 1;
    }
    // Display orders sorted by last name and order number
    public void displayOrders() {
        System.out.println("\nOrder List by Last Name:");
        displayOrderList(sortedByName);

        System.out.println("\nOrder List by Order Number:");
        displayOrderList(sortedByNumber);
    }
    // Display the list of orders
    private void displayOrderList(Order[] orderList) {
        for (Order order : orderList) {
        	// Display each order with relevant information
            System.out.println(order.lastName + " - Order #" + order.orderNumber + " - Total: $" + order.orderTotal);
        }
    }
}

