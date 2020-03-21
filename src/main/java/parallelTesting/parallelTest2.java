package parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class parallelTest2 {
    WebDriver driver;

    @Test
    void logInTest() throws InterruptedException {
        System.getProperty("webdriver.chrome.driver", "/Users/suaadbatis/Desktop/SUAADTEST/TestNGPro/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("suaadBatis");
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
        Thread.sleep(5000);
    }
    @AfterMethod
    void tearDown() {
        driver.quit();
    }
}
