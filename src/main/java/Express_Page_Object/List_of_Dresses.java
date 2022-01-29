
package Express_Page_Object;

        import Reusable_Library.Reusable_Actions_Loggers_POM;
        import Reusable_Library.Reusable_Annotations;
        import com.relevantcodes.extentreports.ExtentTest;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

        import java.util.List;

public class List_of_Dresses extends Reusable_Annotations {


    ExtentTest logger;

    public List_of_Dresses(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations.logger;
    }

    @FindBy(xpath = "//*[@class='_2fbIe3xmE78JEQRb26pdpQ']")
    List<WebElement> Dresses;


    public void ClickonDress2() {
        Reusable_Actions_Loggers_POM.multipleClick(driver, Dresses, 1, logger, "Dress Number 2");
    }

}

