package Hulu_Page_Object;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Reusable_Annotations {

    ExtentTest logger;
    public HomePage (WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }


    @FindBy(xpath = "//*[@aria-label='Get Hulu plan']")
    WebElement selectButton;

    @FindBy(xpath = "//*[text()='Log In']")
    WebElement LogIn;

    @FindBy(xpath = "//*[@name='email']")
    WebElement email;

    @FindBy(xpath = "//*[@name='password']")
    WebElement password;

    public void clickOnSelect() {
        Reusable_Actions_Loggers_POM.clickMethod(driver,selectButton,logger,"Select");
    }
    public void Log_In_Account() {
        Reusable_Actions_Loggers_POM.clickMethod(driver,LogIn,logger,"Log In");
    }
    public void WriteEmail(String Email) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,email,""+Email+"",logger,"Enter Email");
    }
    public void WritePassword(String Password) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,password,""+Password+"",logger,"Enter Password");
    }
}
