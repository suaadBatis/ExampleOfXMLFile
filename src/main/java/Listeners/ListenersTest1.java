package Listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(CustomeListeners.class)// here connect your class with the listener class...
public class ListenersTest1 {

    @Test
    void Test1(){
        System.out.println(("This is Test1.. .. .."));
        Assert.assertEquals("A","A");
    }
    @Test
    void Test2(){
        System.out.println(("This is Test2.. .. .. "));
        Assert.assertEquals("B","A");
    }
    @Test
    void Test3(){
        System.out.println(("This is Test3.. .. .."));
        throw new SkipException("Suaad Skipping Exception .. .. ..");
    }
}
