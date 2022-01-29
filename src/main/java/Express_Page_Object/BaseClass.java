package Express_Page_Object;

import Hulu_Page_Object.CreateAccount;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


    public class BaseClass extends Reusable_Annotations {

        public BaseClass(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }//end of constructor class

        //create static reference for usps home page
        public static Express_Page_Object.HomePage homepage() {
            Express_Page_Object.HomePage homepage = new HomePage(driver);
            return homepage;
        }

        //create static reference for send mail and packages page
        public static List_of_Dresses list_of_dresses() {
            List_of_Dresses list_of_dresses = new List_of_Dresses(driver);
            return list_of_dresses;
        }

        public static Dress_Page dress_page() {
            Dress_Page dress_page = new Dress_Page(driver);
            return dress_page;

        }

        public static Bag_Page bag_page() {
            Bag_Page bag_page = new Bag_Page(driver);
            return bag_page;

        }

        public static CheckOut_Page checkOut_page() {
            CheckOut_Page checkOut_page = new CheckOut_Page(driver);
            return checkOut_page;

        }

    }


