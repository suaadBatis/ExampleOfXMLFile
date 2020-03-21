import jdk.internal.jline.internal.TestAccessible;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class FirstTestCase {
    /*1- setup Open
    2- login
    3- close website
    */
    @Test(priority = 1)
    void setup() {
        System.out.println("Opening Browser");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("This is Login methods");

    }

    @Test(priority = 3)
    void teardown() {
        System.out.println("Closing Browser");

    }

}
