package Day10_to_Day12;

import References.Reusable_Actions;
import Reusable_Library.Reusable_Actions_Loggers;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class AI5 extends Reusable_Annotations {


    @Test(priority = 1)

    public void HuluAccount() throws IOException, BiffException, WriteException, InterruptedException {
        //Step 1: Read the data from the excel sheet you created
        Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/Hulu.xls"));
        //Step 2: Locating the worksheet that you created for the workbook
        Sheet readableSheet = readableFile.getSheet(0);
        //will return the physical rows present on the sheet
        int rowCount = readableSheet.getRows();
        System.out.println("My row count is " + rowCount);

        //Step 3: create a writable file to mimic readable, but you can also write back the results to this file
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/Hulu_Writeable.xls"), readableFile);
        WritableSheet writableSheet = writableFile.getSheet(0);
        //will return the physical rows present on the sheet
        int rowCount3 = writableSheet.getRows();
        System.out.println("My writable row count is " + rowCount3);

        for (int i = 1; i < rowCount3; i++) {

            String email = writableSheet.getCell(0, i).getContents();
            String password = writableSheet.getCell(1, i).getContents();
            String name = writableSheet.getCell(2, i).getContents();
            String birthMonth = writableSheet.getCell(3, i).getContents();
            String birthDay = writableSheet.getCell(4, i).getContents();
            String birthYear = writableSheet.getCell(5, i).getContents();
            String gender = writableSheet.getCell(6, i).getContents();

            driver.navigate().to("https://www.hulu.com");

            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Stream TV and Movies")) {
                System.out.println("Title matches as 'Hulu'");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }


            JavascriptExecutor jsef = (JavascriptExecutor) driver;
            //scroll to the view by pixels
            jsef.executeScript("scroll(0,3300)");

            Reusable_Actions_Loggers.clickMethod(driver, "//*[contains(@class,'plan-card__0_cta')]", logger, "Select HULU plan");

            Thread.sleep(3000);

            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@id='email']", email, logger, "Email");
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@id='password']", password, logger, "Password");
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@id='firstName']", name, logger, "Name");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[contains(@class,'field__month')]", logger, "Month");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='" + birthMonth + "']", logger, "Month");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[contains(@class,'field__day')]", logger, "Day");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='" + birthDay + "']", logger, "Day");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[contains(@class,'field__year')]", logger, "Year");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='" + birthYear + "']", logger, "Year");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[contains(@class,'field gender')]", logger, "Gender");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='" + gender + "']", logger, "Gender");

            Reusable_Actions_Loggers.clickMethod(driver, "//*[@type='submit']", logger, "Continue");


            String result = Reusable_Actions_Loggers.getTextMethod(driver, "//*[@class='ledger__summary']", logger, "Error Message");
            System.out.println(result);

        }
        writableFile.write();
        writableFile.close();

        reports.endTest(logger);

    }

        @Test(priority = 2)

        public void Log_into_Account() throws IOException, BiffException, WriteException, InterruptedException {

            Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/Hulu.xls"));
            //Step 2: Locating the worksheet that you created for the workbook
            Sheet readableSheet = readableFile.getSheet(0);
            //will return the physical rows present on the sheet
            int rowCount = readableSheet.getRows();
            System.out.println("My row count is " + rowCount);

            //Step 3: create a writable file to mimic readable, but you can also write back the results to this file
            WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/Hulu_Writeable.xls"), readableFile);
            WritableSheet writableSheet = writableFile.getSheet(0);
            int rowCount4 = writableSheet.getRows();
            System.out.println("My writable row count is " + rowCount4);

            for (int i = 1; i < rowCount4; i++) {

                String email = writableSheet.getCell(0, i).getContents();
                String password = writableSheet.getCell(1, i).getContents();


                driver.navigate().to("https://www.hulu.com");
                Reusable_Actions_Loggers.clickMethod(driver, "//*[contains(@class,'navigation__login-button')]", logger, "Log In");


                Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@id='email_id']", email, logger, "Email");
                Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@id='password_id']", password, logger, "Password");
                Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='LOG IN']", logger, "Log In");

                Thread.sleep(3000);


            }

        }

}