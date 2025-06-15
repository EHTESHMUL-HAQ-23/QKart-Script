package qkart;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest() {
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        driver.findElement(By.name("username")).sendKeys("testuser");
        driver.findElement(By.name("password")).sendKeys("Test@123");
        driver.findElement(By.xpath("//button[text()='Login to QKart']")).click();
    }
}