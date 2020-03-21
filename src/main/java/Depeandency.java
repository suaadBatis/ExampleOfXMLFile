import org.testng.Assert;
import org.testng.annotations.Test;

public class Depeandency {
    @Test
    void startCar(){
        System.out.println("startCar");
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("car driving ");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar(){
        System.out.println("car stopped  ");
    }

    @Test(dependsOnMethods = {"stopCar","startCar"}, alwaysRun = true)
    void ParkCar(){
        System.out.println("ParkCar");
    }
}
