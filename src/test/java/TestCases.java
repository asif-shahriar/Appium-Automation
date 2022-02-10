import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TestCases {
    AndroidDriver driver;

    @FindBy(id = "com.google.android.calculator:id/digit_7")
    WebElement btnSeven;
    @FindBy(id = "com.google.android.calculator:id/digit_5")
    WebElement btnfive;
    @FindBy(id = "com.google.android.calculator:id/op_add")
    WebElement btnPlus;
    @FindBy(id = "com.google.android.calculator:id/op_mul")
    WebElement btnMultiply;
    @FindBy(id = "com.google.android.calculator:id/result")
    WebElement result;


    public TestCases(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String plusOp() {
        btnfive.click();
        btnPlus.click();
        btnSeven.click();
        System.out.println(result.getText());
        return result.getText();
    }

    public String mulOp() {
        btnfive.click();
        btnMultiply.click();
        btnSeven.click();
        System.out.println(result.getText());
        return result.getText();
    }
}
