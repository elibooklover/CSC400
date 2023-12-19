package ct2;

public class BagDemo {
    
	public static void testAddl(ShoppingCart cart) {
    	
        cart.add(new MyType("Apple", 1.50));
        cart.add(new MyType("Banana", 0.75));
        cart.add(new MyType("Orange", 1.25));
    
    }

    public static void main(String[] args) {
    	
        ShoppingCart cart = new ShoppingCart();

    	testAddl(cart);
    	
    	// Display the shopping cart
    	cart.displayBag();
    	
        // See if the shopping cart is full
        System.out.println("Is the shopping cart full? " + cart.isFull() + "\n");
       
        // Test clear function
        cart.clear();
        System.out.println("Cleared the shopping cart! \n");

        // See if the shopping cart is empty
        System.out.println("Is the shopping cart empty? " + cart.isEmpty());

        // Display the shopping cart, and the shopping card should be empty
        cart.displayBag();
    }
}
