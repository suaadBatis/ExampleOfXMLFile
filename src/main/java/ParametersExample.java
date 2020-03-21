import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {

    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void setUp(String browser, String app){

        if (browser.equalsIgnoreCase("chrome"))
        {
            //System.getProperty("user.dir" + "chromedriver");
            System.getProperty("webdriver.chrome.driver","/Users/suaadbatis/Desktop/SUAADTEST/TestNGPro/chromedriver");
            driver = new ChromeDriver();
            driver.get("https://www.google.com/");
        }
        else if(browser.equalsIgnoreCase("firefox")){
            System.getProperty("webdriver.chrome.driver","/Users/suaadbatis/Desktop/SUAADTEST/TestNGPro/chromedriver");
            driver = new FirefoxDriver();
            driver.get("https://www.google.com/");
        }
       /* driver = new SafariDriver();
        driver.get("https://www.google.com/");*/
        driver.get(app);

    }





    @Test(priority =1)
    void homePageTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("Google", title," The title is not matching ");
    }

    @Test(priority = 1)
    void LogoTest(){
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"hplogo\"]"));
        Assert.assertTrue(logo.isDisplayed(), "the logo is not displayed on this  ");
        //Assert.assertFalse(logo.isDisplayed(), "the logo is not displayed on this  ");

    }
    @AfterClass
    void tearDown(){
        driver.quit();
    }



}
