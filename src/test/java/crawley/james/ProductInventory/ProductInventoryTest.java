package crawley.james.ProductInventory;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jamescrawley on 9/15/16.
 */
public class ProductInventoryTest {

    Product product0 = new Product(517, 2.15, "000001");
    Inventory inventory0 = new Inventory(product0);
    Inventory inventory1 = new Inventory();


    @Test
    public void getIdTest() {

        assertEquals("The ID should be \"000001\"", "000001", inventory0.getProduct().getId());

    }

    @Test
    public void getPriceTest () {

        assertEquals("The price should be $2.15", 2.15, inventory0.getProduct().getPrice(), 0);

    }

    @Test
    public void getQuantityTest () {

        assertEquals("The quantity should be 517", 517, inventory0.getProduct().getQuantity());

    }

    @Test
    public void getValueTest () {

        assertEquals("The total value should be $1111.15 ", 1111.55, inventory0.getValueOfProducts(), 0);

    }

    @Test
    public void getNullValuetest () {

        assertEquals("The value should be $0", 0, inventory1.getValueOfProducts(), 0);

    }

    @Test
    public void getNullQuantitytest () {

        assertEquals("The quantity should be 0", 0, inventory1.getProduct().getQuantity(), 0);

    }

    @Test
    public void getNullPricetest () {

        assertEquals("The price should be $0", 0, inventory1.getProduct().getPrice(), 0);

    }

    @Test
    public void getNullIdtest () {

        assertEquals("The ID should be 000000", "000000", inventory1.getProduct().getId());

    }

}
