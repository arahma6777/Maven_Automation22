package Day9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Implicit {

    public static void main(String[] args) {

        //setup chrome driver
        WebDriverManager.chromedriver().setup();
        //declare and define the chrome options
        ChromeOptions options = new ChromeOptions();
        //declare all the arguments you need
        //to maximize my driver
        options.addArguments("start-maximized");
        //set as incognito mode
        options.addArguments("incognito");
        //set as headless(running the driver on background)
        //options.addArguments("headless");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver(options);

        //Declare and define your global implicit wait for all web elements
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //the line of code above allows us to not have to put a wait time for each element action (thread.sleep),
        //instead we just have to put this code once at the start and the code will wait UP TO the allotted time,
        //if an element is found before the limited time, it will load at that point, technically a faster method
        //in running it too.

        //navigate to usps
        driver.navigate().to("https://www.ups.com/us/en/Home.page");

        //Thread.sleep(15000);

        //click on Track
        driver.findElement(By.xpath("//*[text()='Tracking']")).click();

        //click on track a package
        driver.findElement(By.xpath("//*[text()='Track a Package']")).click();

    }//end of main
}
