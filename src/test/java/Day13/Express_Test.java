package Day13;

import Express_Page_Object.BaseClass;
import Reusable_Library.Reusable_Actions_Loggers;
import Reusable_Library.Reusable_Annotations;
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
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Express_Test extends Reusable_Annotations {

    @Test

    public void Order_Dress2() throws IOException, BiffException, WriteException, InterruptedException {

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

            BaseClass.homepage().ClickonWomenTab();
            BaseClass.homepage().ClickclosePopUp();
            BaseClass.homepage().ClickonDresses();

            JavascriptExecutor jsef = (JavascriptExecutor) driver;
            //scroll to the view by pixels
            jsef.executeScript("scroll(0,500)");

            BaseClass.homepage().ClickclosePopUp();


            BaseClass.list_of_dresses().ClickonDress2();
            BaseClass.dress_page().ClickonSize("" + Size + "");
            BaseClass.dress_page().ClickonAddtoBag();
            BaseClass.dress_page().ViewBag();
            BaseClass.bag_page().ChooseQuanitiy("" + Quantity + "");
            BaseClass.bag_page().ClickCheck();
            BaseClass.bag_page().ClickCheckOutasGuest();
            BaseClass.checkOut_page().addfirstname(FirstName);
            BaseClass.checkOut_page().addlastname(LastName);
            BaseClass.checkOut_page().addemail(email);
            BaseClass.checkOut_page().confirmemail(email);
            BaseClass.checkOut_page().addphonenumber(phonenumber);
            BaseClass.checkOut_page().clickOnContinue();
            BaseClass.checkOut_page().addshippingaddress(address);
            BaseClass.checkOut_page().addzipcode(zipcode);
            BaseClass.checkOut_page().addcity(city);
            BaseClass.checkOut_page().addstate(state);
            BaseClass.checkOut_page().clickOnShippingandBillingAdress();
            BaseClass.checkOut_page().clickOnShippingOptions();
            BaseClass.checkOut_page().addcardnumber(cardnumber);
            BaseClass.checkOut_page().expirationmonth(expirationmonth);
            BaseClass.checkOut_page().expirationyear(expirationyear);
            BaseClass.checkOut_page().addcvv(cvv);
            BaseClass.checkOut_page().placeorder();

            String result = Reusable_Actions_Loggers.getTextMethod(driver, "//*[contains(@class,'_3z2au8LN')]", logger, "Error Message");
            System.out.println(result);

            Label label = new Label(14, i, result);
            //I need to write back to the writable sheet
            //Below is the line for code where we tell the program where to write each of the results to
            writableSheet.addCell(label);


            driver.manage().deleteAllCookies();


        }


    }
}
