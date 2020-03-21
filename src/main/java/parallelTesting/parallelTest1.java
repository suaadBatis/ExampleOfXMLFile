package parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class parallelTest1 {
    WebDriver driver;

    @Test
    void logoTest() throws InterruptedException {
        System.getProperty("webdriver.chrome.driver", "/Users/suaadbatis/Desktop/SUAADTEST/TestNGPro/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"hplogo\"]"));
        Assert.assertTrue(logo.isDisplayed(), "the logo is not displayed on this  ");
        Thread.sleep(5000);
    }


    @Test
    void homePageTitle() throws InterruptedException {
        System.getProperty("webdriver.chrome.driver", "/Users/suaadbatis/Desktop/SUAADTEST/TestNGPro/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.getTitle();
        Assert.assertEquals(driver.getTitle(), "Google");
        Thread.sleep(5000);
    }

    @AfterMethod
    void tearDown() {
        driver.quit();
    }
}
