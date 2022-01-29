package Express_Page_Object;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut_Page extends Reusable_Annotations {

    ExtentTest logger;

    public CheckOut_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations.logger;


    }

    @FindBy(xpath = "//*[@name='firstname']")
    WebElement firstname;

    @FindBy(xpath = "//*[@name='lastname']")
    WebElement lastname;

    @FindBy(xpath = "//*[@name='email']")
    WebElement Email;

    @FindBy(xpath = "//*[@name='confirmEmail']")
    WebElement confirmemail;

    @FindBy(xpath = "//*[@name='phone']")
    WebElement phone;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement Continue;

    @FindBy(xpath = "//*[@name='shipping.line1']")
    WebElement Address;

    @FindBy(xpath = "//*[@name='shipping.postalCode']")
    WebElement Zipcode;

    @FindBy(xpath = "//*[@name='shipping.city']")
    WebElement City;

    @FindBy(xpath = "//*[@name='shipping.state']")
    WebElement State;

    @FindBy(xpath = "//*[text()='Continue']")
    WebElement shippingoptions;

    @FindBy(xpath = "//*[@name='creditCardNumber']")
    WebElement Cardnumber;

    @FindBy(xpath = "//*[@name='expMonth']")
    WebElement expmonth;

    @FindBy(xpath = "//*[@name='expYear']")
    WebElement expyear;

    @FindBy(xpath = "//*[@name='cvv']")
    WebElement CVV;

    @FindBy(xpath = "//*[text()='Place Order']")
    WebElement placeorder;

    public void addfirstname(String FirstName){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,firstname,FirstName,logger,"First Name");
    }
    public void addlastname(String LastName){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,lastname,LastName,logger,"Last Name");
    }
    public void addemail(String email){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Email,email,logger,"E-mail");
    }
    public void confirmemail(String email){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,confirmemail,email,logger,"Confirm Email");
    }
    public void addphonenumber(String phonenumber){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,phone,phonenumber,logger,"First Name");
    }

    public void clickOnContinue(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Continue,logger,"Continue");

    }
    public void addshippingaddress(String address){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Address,address,logger,"Shipping Address");
    }
    public void addzipcode(String zipcode){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Zipcode,zipcode,logger,"Zip Code");
    }
    public void addcity(String city){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,City,city,logger,"City");
    }
    public void addstate(String state){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,State,state,logger,"State");
}
    public void clickOnShippingandBillingAdress() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, Continue, logger, "Shipping and Billing Address");
    }
    public void clickOnShippingOptions() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, shippingoptions, logger, "Shipping Options");
    }
    public void addcardnumber(String cardnumber) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, Cardnumber, cardnumber, logger, "Card Number");
    }
    public void expirationmonth(String expirationmonth) throws InterruptedException {
    Reusable_Actions_Loggers_POM.selectMethod(driver,expirationmonth,expmonth,logger,"Expiration Month");
    }
    public void expirationyear(String expirationyear) throws InterruptedException {
        Reusable_Actions_Loggers_POM.selectMethod(driver,expirationyear,expyear,logger,"Expiration Year");
    }
    public void addcvv(String cvv) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,CVV,cvv,logger,"CVV");
    }
    public void placeorder(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,placeorder,logger,"Place Order");
    }


}




