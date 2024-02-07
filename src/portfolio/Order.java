package portfolio;

class Order {
	// Attributes of an order: last name, order number, and order total
    String lastName;
    int orderNumber;
    double orderTotal;
    
    // Constructor to initialize an Order with provided values
    public Order(String lastName, int orderNumber, double orderTotal) {
        this.lastName = lastName;
        this.orderNumber = orderNumber;
        this.orderTotal = orderTotal;
    }
}
