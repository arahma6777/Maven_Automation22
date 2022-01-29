package ActionItems;

import References.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class AI5 {

    WebDriver driver;


    @BeforeSuite
    public void SetTheDriver(){
        driver = Reusable_Actions.setDriver();
    }

    @Test(priority = 1)
    public void MakeAccount() throws InterruptedException {

        ArrayList<String> email = new ArrayList<>();
        email.add("johnsnow15@gmail.com");
        email.add("jadesmith1343@gmail.com");

        ArrayList<String > password = new ArrayList<>();
        password.add("growuppp45");
        password.add("ohyeahhhh345");

        ArrayList<String > name = new ArrayList<>();
        name.add("Kanye West");
        name.add("Jonah Hill");

        ArrayList<String > birthmonth = new ArrayList<>();
        birthmonth.add("May");
        birthmonth.add("February");

        ArrayList<String > birthday = new ArrayList<>();
        birthday.add("15");
        birthday.add("6");

        ArrayList<String > birthyear = new ArrayList<>();
        birthyear.add("1995");
        birthyear.add("1999");

        ArrayList<String > gender = new ArrayList<>();
        gender.add("Male");
        gender.add("Male");

        for(int i = 0; i < email.size(); i++){

            driver.navigate().to("https://www.hulu.com/welcome");

            String titlePage = driver.getTitle();
            if (titlePage.equals("Stream TV and Movies Live and Online | Hulu")) {
                System.out.println("Title matches");
            } else{
                System.out.println("Title does not match");
            }


        }

    }




}


