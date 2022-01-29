package Day10_to_Day12;

import References.Reusable_Actions;
import Reusable_Library.Reusable_Actions_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

public class AI6 {

    //declare the webdriver outside of the annotation methods so it can be called on all the methods
    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;

    @BeforeSuite
    public void SetTheDriver() {
        driver = Reusable_Actions.setDriver();
        //navigate express page
        //set the path of the report once
        reports = new ExtentReports("src/main/java/HTML_Report/Automation_Report2022.html", true);

    }//end of precondition

    @Test(priority = 1)

    public void GoogleSearchDataDriven() throws IOException, BiffException, WriteException, InterruptedException {
        //Step 1: Read the data from the excel sheet you created
        Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/Express3.xls"));
        //Step 2: Locating the worksheet that you created for the workbook
        Sheet readableSheet = readableFile.getSheet(0);
        //will return the physical rows present on the sheet
        int rowCount = readableSheet.getRows();
        System.out.println("My row count is " + rowCount);

        //Step 3: create a writable file to mimic readable, but you can also write back the results to this file
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/Express2_Writeable.xls"), readableFile);
        WritableSheet writableSheet = writableFile.getSheet(0);
        //will return the physical rows present on the sheet
        int rowCount2 = writableSheet.getRows();
        System.out.println("My writable row count is " + rowCount2);

        for (int i = 1; i < rowCount2; i++) {

            String Size = writableSheet.getCell(0, i).getContents();
            String Quantity = writableSheet.getCell(1, i).getContents();
            String FirstName = writableSheet.getCell(2, i).getContents();
            String LastName = writableSheet.getCell(3, i).getContents();
            String email = writableSheet.getCell(4, i).getContents();
            String phonenumber = writableSheet.getCell(5, i).getContents();
            String address = writableSheet.getCell(6, i).getContents();
            String zipcode = writableSheet.getCell(7, i).getContents();
            String city = writableSheet.getCell(8, i).getContents();
            String state = writableSheet.getCell(9, i).getContents();
            String cardnumber = writableSheet.getCell(10, i).getContents();
            String expirationmonth = writableSheet.getCell(11, i).getContents();
            String expirationyear = writableSheet.getCell(12, i).getContents();
            String cvv = writableSheet.getCell(13, i).getContents();


            driver.navigate().to("https://www.express.com");
            //verify the title says 'Men's and Women's Clothing'
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Men's and Women's Clothing")) {
                System.out.println("Title matches as 'Express'");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }

            ExtentTest logger = reports.startTest("Ordering Clothes");
            //navigate to usps
            logger.log(LogStatus.INFO, "Navigate to Express");
            driver.navigate().to("https://www.express.com");
            //hover to the quick tool tab
            Reusable_Actions_Loggers.mouseHover(driver, "//*[@href='/womens-clothing?W_HEADER_WOMENSCLOTHING']", logger, "Woman Tab");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[contains(text(),'Dresses')]", logger, "Dresses");
            Thread.sleep(3000);

            Reusable_Actions.clickMethod(driver, "//*[contains(@class,'close_button-20856-position')]","Close PopUp");

            Thread.sleep(3000);

            //scroll to the window of dresses page
            JavascriptExecutor jsef = (JavascriptExecutor) driver;
            //scroll to the view by pixels
            jsef.executeScript("scroll(0,500)");

            Reusable_Actions_Loggers.multipleClick(driver, "//*[@class='_2fbIe3xmE78JEQRb26pdpQ']", 1, logger, "Dress Number 2");
            Thread.sleep(3000);

            Reusable_Actions_Loggers.clickMethod(driver, "//*[@value='" + Size + "']", logger, "Dress Size");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Add to Bag']", logger, "Add to Cart");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='View Bag']", logger, "View the Bag");

            Reusable_Actions_Loggers.selectMethod(driver, Quantity, "//*[@id='qdd-0-quantity']", logger, "Quantity");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Checkout']", logger, "Checkout");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Checkout as Guest']", logger, "Checkout as Guest");

            Thread.sleep(3000);

            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='firstname']", FirstName, logger, "First Name");
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='lastname']", LastName, logger, "Last Name");
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='email']", email, logger, "Email");
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='confirmEmail']", email, logger, "Confirm Email");
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='phone']", phonenumber, logger, "Phone Number");

            Thread.sleep(3000);

            Reusable_Actions_Loggers.clickMethod(driver, "//*[@type='submit']", logger, "Continue");

            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='shipping.line1']", address, logger, "Address");
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='shipping.postalCode']", zipcode, logger, "Zipcode");
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='shipping.city']", city, logger, "City");
            Reusable_Actions_Loggers.selectMethod(driver, state, "//*[@name='shipping.state']", logger, "State");

            Reusable_Actions_Loggers.clickMethod(driver, "//*[@type='submit']", logger, "Shipping and Billing Address");

            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Continue']", logger, "Shipping Options");

            Thread.sleep(3000);


            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='creditCardNumber']", cardnumber, logger, "Credit Card Number");
            Reusable_Actions_Loggers.selectMethod(driver, expirationmonth, "//*[@name='expMonth']", logger, "Expiration Month");
            Reusable_Actions_Loggers.selectMethod(driver, expirationyear, "//*[@name='expYear']", logger, "Expiration Year");
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='cvv']", cvv, logger, "CVV");


            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Place Order']", logger, "Place Order");

            Thread.sleep(6000);


            String result = Reusable_Actions_Loggers.getTextMethod(driver, "//*[contains(@class,'_3z2au8LN')]", logger, "Error Message");
            System.out.println(result);

            Label label = new Label(14, i, result);
            //I need to write back to the writable sheet
            //Below is the line for code where we tell the program where to write each of the results to
            writableSheet.addCell(label);


            driver.manage().deleteAllCookies();


        }//end of forloop

        writableFile.write();
        writableFile.close();

        reports.endTest(logger);

    }//end of test 1

//@Test(dependsOnMethods = "SearchForAKeyword")//use it when one @test depends on another one
//priority is used when test cases do not have correlation with each other


    @AfterSuite
    public void endtest() {
        driver.quit();
        reports.flush();

    }
}







