package qkart;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {
    @Test
    public void checkout() {
        driver.findElement(By.xpath("//button[contains(text(),'Cart')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();
        boolean orderSuccess = driver.getPageSource().contains("Order placed successfully");
        assert orderSuccess : "Order was not placed!";
    }
}