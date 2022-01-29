package Express_Page_Object;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bag_Page extends Reusable_Annotations {

    ExtentTest logger;

    public Bag_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations.logger;


}

   @FindBy(xpath = "//*[@id='qdd-0-quantity']")
    WebElement Quantity;

    @FindBy(xpath = "//*[text()='Checkout']")
    WebElement Checkout;

    @FindBy(xpath = "//*[text()='Checkout as Guest']")
    WebElement CheckoutAsGuest;

    public void ChooseQuanitiy(String quantity){
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Quantity ");
        logger.log(LogStatus.INFO,"Quantity");
        WebElement startList = wait.until(ExpectedConditions.visibilityOf((Quantity)));
        Select sDropDown = new Select(startList);
        try {

            sDropDown.selectByVisibleText(quantity);
        } catch (Exception e){
            System.out.println("Unable to select Error: " +e);
            logger.log(LogStatus.FAIL,"Unable to select  Error:" + e);
        }

        }


    public void ClickCheck() {
        Reusable_Actions_Loggers_POM.clickMethod(driver,Checkout,logger,"CheckOut");
    }
    public void ClickCheckOutasGuest(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,CheckoutAsGuest,logger,"Check Out as Guest");
    }
}

