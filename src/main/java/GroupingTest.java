import org.testng.annotations.Test;

public class GroupingTest {

    @Test(groups = {"Regreastion2"})
    void GroupingTest1() {
        System.out.println("GroupingTest1");
    }

    @Test(groups = {"Regreastion3"})
    void GroupingTest2() {
        System.out.println("GroupingTest2...");
    }

    @Test(groups = {"SuaadGroup"})
    void GroupingTest3() {
        System.out.println("GroupingTest3...");

    }

    @Test(groups = {"SuaadGroup"})
    void GroupingTest4() {
        System.out.println("GroupingTest4...");

    }

    @Test(groups = {"Regreastion"})
    void GroupingTest5() {
        System.out.println("GroupingTest5...");

    }

    @Test(groups = {"Regreastion"})
    void GroupingTest6() {
        System.out.println("GroupingTest6...");

    }
}
