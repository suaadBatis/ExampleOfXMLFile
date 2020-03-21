import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertExample {
    WebDriver driver;
    @BeforeClass
    void setUp(){

        System.getProperty("webdriver.chrome.driver","/Users/suaadbatis/Desktop/SUAADTEST/TestNGPro/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

    }
    @Test(priority = 1)
    void LogoTest(){
       WebElement logo = driver.findElement(By.xpath("//*[@id=\"hplogo\"]"));
        Assert.assertTrue(logo.isDisplayed(), "the logo is not displayed on this  ");
        //Assert.assertFalse(logo.isDisplayed(), "the logo is not displayed on this  ");

    }
    @Test(priority = 2)
    void homePageTitle(){
       String title = driver.getTitle();
       Assert.assertEquals("Google", title," The title is not matching ");
    }
    @AfterClass
    void tearDown(){
        driver.quit();
    }

}
