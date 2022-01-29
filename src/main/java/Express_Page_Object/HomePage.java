package Express_Page_Object;

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


    @FindBy(xpath = "//*[@href='/womens-clothing?W_HEADER_WOMENSCLOTHING']")
    WebElement WomenTab;

    @FindBy(xpath = "//*[contains(text(),'Dresses')]")
    WebElement Dress;

    @FindBy(xpath = "//*[contains(@class,'close_button-20856-position')]")
    WebElement PopUp;

    public void ClickonWomenTab() {
        Reusable_Actions_Loggers_POM.mouseHover(driver,WomenTab,logger,"Women's Tab");
    }
    public void ClickonDresses() {
        Reusable_Actions_Loggers_POM.clickMethod(driver,Dress,logger,"Dress");
    }
    public void ClickclosePopUp() {
        Reusable_Actions_Loggers_POM.clickMethod(driver,PopUp,logger,"Close PopUp");
    }
}


