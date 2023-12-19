package ct2;
import java.util.Arrays;

public class ShoppingCart implements BagInterfaceMyType {

    private MyType[] myBag;
    private int numberofProducts;
    private final int DEFAULT_CAPACITY = 10;

    public ShoppingCart() {
        this.myBag = new MyType[DEFAULT_CAPACITY];
        this.numberofProducts = 0;
    }

    @Override
    public void add(MyType item) {
        if (isFull()) {
            System.out.println("Bag is full!");
            return;
        }
        myBag[numberofProducts] = item;
        numberofProducts++;
    }

    @Override
    public MyType[] toArray() {
        return Arrays.copyOf(myBag, numberofProducts);
    }

    @Override
    public boolean isFull() {
        return numberofProducts == myBag.length;
    }

    public void clear() {
        numberofProducts = 0;
        for (int i = 0; i < myBag.length; i++) {
            myBag[i] = null;
        }
    }

    public boolean isEmpty() {
        return numberofProducts == 0;
    }

    public int size() {
        return numberofProducts;
    }
    
    public void displayBag() {
        if (isEmpty()) {
            System.out.println("Shopping Cart is empty.");
            return;
        }
        System.out.println("Shopping Cart:");
        for (int i = 0; i < numberofProducts; i++) {
            System.out.println(myBag[i]);
        }
    }
}
