package Express_Page_Object;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Reusable_Library.Reusable_Actions_Loggers_POM.getScreenShot;

public class Dress_Page extends Reusable_Annotations {

    ExtentTest logger;

    public Dress_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations.logger;
    }



    @FindBy(xpath = "//*[text()='Add to Bag']")
    WebElement AddtoBag;

    @FindBy(xpath = "//*[text()='View Bag']")
    WebElement ViewBag;


    public void ClickonSize(String Size) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        System.out.println("Clicking on element Size");
        logger.log(LogStatus.INFO, "Clicking on element Size");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@value='"+Size+"']"))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on Size " + e);
            logger.log(LogStatus.FAIL, "Unable to click on Size. Error " + e);
            getScreenShot(driver, "size", logger);
        }
    }

    public void ClickonAddtoBag(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,AddtoBag,logger,"Add to Bag");
            }
    public void ViewBag(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,ViewBag,logger,"View Bag");
    }
}

