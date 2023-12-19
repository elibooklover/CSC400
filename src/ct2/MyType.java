package ct2;

public class MyType {

    private String name;
    private double price;

    public MyType(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // Name getter
    public String getName() {
        return name;
    }
    
    // Name setter
    public void setName(String name) {
        this.name = name;
    }
    
    // Price getter
    public double getPrice() {
        return price;
    }
    
    // Price setter
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item: " + name + ", Price: $" + price;
    }
}
