package CardinalHealth_PageObject;

import Express_Page_Object.HomePage;
import Reusable_Library.Reusable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass_CardinalHealth extends Reusable_Annotations {


    public BaseClass_CardinalHealth(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }//end of constructor class

    //create static reference for usps home page
    public static CardinalHealth_PageObject.Homepage homepage() {
        CardinalHealth_PageObject.Homepage homepage = new Homepage(driver);
        return homepage;
    }


    public static CardinalHealth_PageObject.SupplyChainCenter supplyChainCenter() {
        CardinalHealth_PageObject.SupplyChainCenter supplyChainCenter = new SupplyChainCenter(driver);
        return supplyChainCenter;
    }
}
