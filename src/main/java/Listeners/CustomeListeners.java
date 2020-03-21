package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomeListeners implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("This method invoked  ..... ..... ..... ..... " +result.getName());
    }

}
