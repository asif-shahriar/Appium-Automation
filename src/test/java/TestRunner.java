import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestRunner extends AppLaunch {
    public TestCases testCase;

    @Test(priority = 0)
    public void plus() throws MalformedURLException, InterruptedException {
        AppLaunch appLaunch = new AppLaunch();
        testCase = new TestCases(appLaunch.setUp());
        String result = testCase.plusOp();
        Assert.assertEquals(result, "12");
    }

    @Test(priority = 1)
    public void multiply() throws MalformedURLException, InterruptedException {
        AppLaunch appLaunch = new AppLaunch();
        testCase = new TestCases(appLaunch.setUp());
        String result = testCase.mulOp();
        Assert.assertEquals(result, "35");
    }
}
