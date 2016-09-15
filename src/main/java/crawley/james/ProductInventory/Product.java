package crawley.james.ProductInventory;

/**
 * Created by jamescrawley on 9/14/16.
 */
public class Product {

    private double price;
    private int quantity;
    private final String id;

    public Product (int quantity, double price, String id) {
        this.price = price;
        this.quantity = quantity;
        this.id = id;

    }

    public void setPrice (double price) {

        this.price = price;

    }

    public double getPrice () {

        return price;
    }

    public void setQuantity (int quantity) {

        this.quantity = quantity;

    }

    public int getQuantity () {

        return quantity;

    }

    public String getId () {

        return id;

    }

}
