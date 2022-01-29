package Hulu_Page_Object;

import Reusable_Library.Reusable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass extends Reusable_Annotations {

    public BaseClass(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }//end of constructor class

    //create static reference for usps home page
    public static HomePage homepage() {
        HomePage homepage = new HomePage(driver);
        return homepage;
    }

    //create static reference for send mail and packages page
    public static CreateAccount createAccount() {
        CreateAccount createAccount = new CreateAccount(driver);
        return createAccount;
    }

}



