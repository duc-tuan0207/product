
package javaapplication12;

public class product {
    private String productId;
    private String name;
    private double price;

    public product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }


    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String getName() { return name; }
    public void applyDiscount(double percent) { this.price *= (1 - percent / 100); }
}

