import org.testng.annotations.*;

public class TC2 {
    
    @BeforeClass
   void Beforeclass(){
        System.out.println("Beforeclass2.");
    }
    @AfterClass
    void AfterClass(){
        System.out.println("AfterClass2.");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("beforeMethod2.");
    }

    @AfterMethod
    void AfterMethod(){
        System.out.println("AfterMethod2");
    }
    @Test
    void test1(){
        System.out.println("This is a test2 ....");
    }

   @Test
    void test2(){
        System.out.println("This is a test2 ....");
    }
}


