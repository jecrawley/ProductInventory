package crawley.james.ProductInventory;

/**
 * Created by jamescrawley on 9/14/16.
 */
public class Inventory {

    Product product0;
    Product product1;
    Product product2;

    public Inventory (Product product0, Product product1, Product product2) {
        this.product0 = product0;
        this.product1 = product1;
        this.product2 = product2;
    }

    public double getValueOfProduct0 () {

        return product0.getPrice() * product0.getQuantity();

    }

    public double getValueOfProduct1 () {

        return product1.getPrice() * product1.getQuantity();

    }

    public double getValueOfProduct2 () {

        return product2.getPrice() * product2.getQuantity();

    }

    public Product getProduct0 () {

        return product0;

    }

    public Product getProduct1 () {

        return product1;

    }

    public Product getProduct2 () {

        return product2;

    }
}
