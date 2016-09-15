package crawley.james.ProductInventory;

/**
 * Created by jamescrawley on 9/14/16.
 */
public class Inventory {

    Product[] products;


    public Inventory (Product[] products) {
        this.products = products;
    }

    public double getValueOfProducts (int index) {

        return products[index].getPrice() * products[index].getQuantity();

    }


    public Product getProduct (int index) {

        return products[index];

    }


}
