import org.junit.After;
import org.testng.annotations.*;

public class TC1 {

    @BeforeClass
   void Beforeclass(){
        System.out.println("Beforeclass.");
    }
    @AfterClass
    void AfterClass(){
        System.out.println("AfterClass.");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("beforeMethod.,,,,,,");
    }

    @AfterMethod
    void AfterMethod(){
        System.out.println("AfterMethod");
    }
    @Test
    void test1(){
        System.out.println("This is a test ...////.");
    }

   @Test
    void test2(){
        System.out.println("This is a test ....");
    }
}


