package qkart;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {
    @Test
    public void addToCart() throws InterruptedException {
        driver.findElement(By.name("search")).sendKeys("iphone");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
    }
}