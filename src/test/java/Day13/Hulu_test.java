package Day13;

import Day8.ArrayLIst;
import Hulu_Page_Object.BaseClass;
import Reusable_Library.Reusable_Annotations;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import  org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

public class Hulu_test extends Reusable_Annotations {

    @Test(priority = 1)


    public void Creating_an_Account() throws IOException, BiffException, WriteException, InterruptedException {


        ArrayList<String> email = new ArrayList<>();
        email.add("arahmannn54@gmail.com");
        email.add("arahffeew43@gmail.com");

        ArrayList<String> name = new ArrayList<>();
        name.add("Sam Smith");
        name.add("Kasin Walit");

        ArrayList<String> password = new ArrayList<>();
        password.add("assggege54");
        password.add("dfdsajsjj564");

        ArrayList<String> birthMonth = new ArrayList<>();
        birthMonth.add("October");
        birthMonth.add("November");

        ArrayList<Integer> birthDay = new ArrayList<>();
        birthDay.add(24);
        birthDay.add(25);

        ArrayList<Integer> birthYear = new ArrayList<>();
        birthYear.add(1994);
        birthYear.add(1995);

        ArrayList<String> gender = new ArrayList<>();
        gender.add("Male");
        gender.add("Male");

        for (int i = 0; i < email.size(); i++) {

            driver.navigate().to("http://www.hulu.com");
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Stream TV and Movies")) {
                System.out.println("Title matches as 'Hulu'");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }

            JavascriptExecutor jsef = (JavascriptExecutor) driver;
            //scroll to the view by pixels
            jsef.executeScript("scroll(0,3300)");

            BaseClass.homepage().clickOnSelect();
            BaseClass.createAccount().CreateEmail( ""+ email.get(i) + "");
            BaseClass.createAccount().CreatePassword("" + password.get(i) + "");
            BaseClass.createAccount().Addname("" + name.get(i) + "");
            BaseClass.createAccount().Month();
            BaseClass.createAccount().BirthMonth("" + birthMonth.get(i) + "");
            BaseClass.createAccount().Day();
            BaseClass.createAccount().birthDay("" + birthDay.get(i) + "");
            BaseClass.createAccount().Year();
            BaseClass.createAccount().birthYear("" + birthYear.get(i) + "");
            BaseClass.createAccount().GENDER();
            BaseClass.createAccount().GendeR("" + gender.get(i) + "");
            BaseClass.createAccount().pressContinue();

            driver.manage().deleteAllCookies();


        }
    }

    @Test(priority = 2)

    public void Log_into_Account() throws IOException, BiffException, WriteException, InterruptedException {

        ArrayList<String> Email = new ArrayList<>();
        Email.add("arahmannn54@gmail.com");
        Email.add("arahffeew43@gmail.com");

        ArrayList<String> Password = new ArrayList<>();
        Password.add("assggege54");
        Password.add("dfdsajsjj564");

        for (int i = 0; i < Email.size(); i++) {

            driver.navigate().to("http://www.hulu.com");
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Stream TV and Movies")) {
                System.out.println("Title matches as 'Hulu'");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }

            BaseClass.homepage().clickOnSelect();
            BaseClass.homepage().Log_In_Account();
            BaseClass.homepage().WriteEmail(""+Email.get(i)+"");
            BaseClass.homepage().WritePassword(""+Password.get(i)+"");
            BaseClass.homepage().Log_In_Account();

            driver.manage().deleteAllCookies();


        }


    }

}
