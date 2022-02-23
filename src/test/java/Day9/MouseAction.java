package Day9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class MouseAction {

    public static void main(String[] args) throws InterruptedException {

        //call the webdrivermanager
        WebDriverManager.chromedriver().setup();
        //call chromeoptions
        ChromeOptions options = new ChromeOptions();
        //set incognito and maximize the driver
        options.addArguments("start-maximized");
        //options.addArguments("incognito");
        //set my webdriver
        WebDriver driver = new ChromeDriver(options);

        //navigate to UHC
        driver.navigate().to("https://www.uhc.com");
        Thread.sleep(2500);
        //click on find a doctor
        driver.findElement(By.xpath("//*[text()='Find a doctor']")).click();
        Thread.sleep(2500);
        //click on select your plan dropdown and choose medicare as value
        driver.findElement(By.xpath("//*[contains(text(),'Select your plan to sign in')]")).click();
        driver.findElement(By.xpath("//*[text()='Medicare plan']")).click();

        //to switch to new tab use arraylist
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(2500);

        //click on dismiss
        driver.findElement(By.xpath("//*[@id='alert-sticky__dismiss-button']")).click();
        Thread.sleep(1000);
        //click on Sign In
        driver.findElement(By.xpath("//*[text()='Sign In']")).click();

//Declare mouse actions
        Actions mouseAction = new Actions(driver);

        //Hover over Send tab to open up the drop down list
        try{
            WebElement sendTab = driver.findElement(By.xpath("//*[text()='Send']"));
            mouseAction.moveToElement(sendTab).perform();
        } catch (Exception e) {
            System.out.println("Unable to hover to Send tab " + e);
        }//end of try-catch

        Thread.sleep(2000);

        //Click on Look Up ZIP Code
        try{
            WebElement zipCodeLookup = driver.findElement(By.xpath("//*[text()='Look Up a ZIP Code']"));
            mouseAction.moveToElement(zipCodeLookup).click().perform();
        } catch (Exception e) {
            System.out.println("Unable to click on Look up a ZIP code " + e);
        }//end of try-catch
    }//end of main
}
