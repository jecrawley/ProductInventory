package crawley.james.ProductInventory;

/**
 * Created by jamescrawley on 9/14/16.
 */
public class ProductInventory {

    public static void main (String[] args) {

        Product product0 = new Product(517, 2.15, "000001");
        Product product1 = new Product(425, 1.75, "000002");
        Product product2 = new Product(605, 1.55, "000003");
        Product [] productArray = {product0, product1, product2};
        Inventory inventory = new Inventory(productArray);

        System.out.println("Product 0 id: " + inventory.getProduct(0).getId() +
                "\n Product 0 price: $" + inventory.getProduct(0).getPrice() +
                "\nProduct 0 quantity: " + inventory.getProduct(0).getQuantity() +
                "\nProduct 0 total value: $" + inventory.getValueOfProducts(0) + "\n");
        System.out.println("Product 1 id: " + inventory.getProduct(1).getId() +
                "\n Product 1 price: $" + inventory.getProduct(1).getPrice() +
                "\nProduct 1 quantity: " + inventory.getProduct(1).getQuantity() +
                "\nProduct 1 total value: $" + inventory.getValueOfProducts(1) + "\n");
        System.out.println("Product 2 id: " + inventory.getProduct(2).getId() +
                "\n Product 2 price: $" + inventory.getProduct(2).getPrice() +
                "\nProduct 2 quantity: " + inventory.getProduct(2).getQuantity() +
                "\nProduct 2 total value: $" + inventory.getValueOfProducts(2) + "\n");
    }
}
