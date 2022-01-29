package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {

    public static void main(String[] args) {

        //set the property of the chromedriver we are using
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver();

        //simply open the google web site
        driver.navigate().to("https://google.com");

        //maximize my browser
        driver.manage().window().fullscreen(); //for mac
        //driver.manage().window().maximize(); //for windows

        //close it
        //driver.close()

    }//end of main
}//end of java class

