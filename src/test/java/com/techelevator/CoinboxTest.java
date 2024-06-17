package com.techelevator;

import com.techelevator.Products.Product;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CoinboxTest {
    private Coinbox coinbox;
    private Inventory inventory;

    @Before
    public void setUp() {
        inventory = new Inventory(); // Assuming Inventory has a default constructor
        coinbox = new Coinbox(inventory);
    }

    @Test
    public void testAddFunds() {
        coinbox.addFunds(100);
        assertEquals(100.0, coinbox.getUserFunds(), 0);

        coinbox.addFunds(50);
        assertEquals(150.0, coinbox.getUserFunds(), 0);
    }
}
