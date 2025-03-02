/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import javaapplication12.product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ductuan
 */
public class ProductTest {

    @Test
    public void testGetPrice() {
        product product = new product("P001", "Laptop", 1000);
        assertEquals(1000, product.getPrice(), 0.01);
    }

    @Test
    public void testSetPrice() {
        product product = new product("P001", "Laptop", 1000);
        product.setPrice(1200);
        assertEquals(1200, product.getPrice(), 0.01);
    }

    @Test
    public void testApplyDiscount() {
        product product = new product("P001", "Laptop", 1000);
        product.applyDiscount(10);
        assertEquals(900, product.getPrice(), 0.01);
    }
}
