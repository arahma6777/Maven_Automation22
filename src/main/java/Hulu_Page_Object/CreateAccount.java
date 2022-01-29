package Hulu_Page_Object;

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

public class CreateAccount extends Reusable_Annotations {

    ExtentTest logger;
    public CreateAccount (WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;

    }

    @FindBy(xpath = "//*[@id='email']")
    WebElement EmailField;

    @FindBy(xpath = "//*[@id='password']")
    WebElement PasswordField;

    @FindBy(xpath = "//*[@id='firstName']")
    WebElement FirstNameField;

    @FindBy(xpath = "//*[text()='Month']")
    WebElement MonthField;


    @FindBy(xpath = "//*[@aria-controls='birthdayDay-menu']")
    WebElement DayField;


    @FindBy(xpath = "//*[@aria-controls='birthdayYear-menu']")
    WebElement YearField;


    @FindBy(xpath = "//*[@aria-controls='gender-menu']")
    WebElement GenderField;


    @FindBy(xpath = "//*[text()='CONTINUE']")
    WebElement ContinueButton;

    public void CreateEmail(String email) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,EmailField,email,logger,"Email");
    }

    public void CreatePassword(String password) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,PasswordField,password,logger,"Password");
    }

    public void Addname(String name) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, FirstNameField, name, logger, "Name");
    }

    public void Month(){
            Reusable_Actions_Loggers_POM.clickMethod(driver,MonthField,logger, "Month");
        }

    public void BirthMonth(String birthMonth){
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Clicking on element Month");
        logger.log(LogStatus.INFO,"Clicking on element Month");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='"+birthMonth+"']"))).click();
        }catch (Exception e){
            System.out.println("Unable to click on birthMonth "+e);
            logger.log(LogStatus.FAIL,"Unable to click on birthMonth. Error "+e);
            getScreenShot(driver,"size",logger);
        }
        }

    public void Day(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,DayField, logger, "Day");
    }

    public void birthDay(String birthDay) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        System.out.println("Clicking on element Day");
        logger.log(LogStatus.INFO, "Clicking on element Day");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" + birthDay + "']"))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on birthDay " + e);
            logger.log(LogStatus.FAIL, "Unable to click on birthMonth. Error " + e);
            getScreenShot(driver, "size", logger);
        }
    }

    public void Year(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,YearField, logger, "Year");
    }

    public void birthYear(String birthYear){
            WebDriverWait wait = new WebDriverWait(driver, 15);
            System.out.println("Clicking on element Year");
            logger.log(LogStatus.INFO, "Clicking on element Year");
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" + birthYear + "']"))).click();
            } catch (Exception e) {
                System.out.println("Unable to click on birthYear " + e);
                logger.log(LogStatus.FAIL, "Unable to click on birthMonth. Error " + e);
                getScreenShot(driver, "size", logger);
            }
        }

    public void GENDER(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,GenderField, logger, "Gender");
    }

    public void GendeR(String gender) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        System.out.println("Clicking on element Gender");
        logger.log(LogStatus.INFO, "Clicking on element Gender");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" + gender + "']"))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on gender " + e);
            logger.log(LogStatus.FAIL, "Unable to click on gender. Error " + e);
            getScreenShot(driver, "size", logger);
        }
    }

    public void pressContinue(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,ContinueButton,logger, "Continue");
    }


}











