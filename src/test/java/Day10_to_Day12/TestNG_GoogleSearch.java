package Day10_to_Day12;

import References.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestNG_GoogleSearch {

    /*
    Precondition - set the driver and navigate to Google website
    Test 1 - search for Google keyword and hit submit
    Test 2 - Capture search result and only print out the search number
    Post condition - Quit your driver
 */

    //declare the webdriver outside of the annotation methods so it can be called on all the methods
    WebDriver driver;

    @BeforeSuite
    public void SetTheDriver(){
        driver = Reusable_Actions.setDriver();
        //navigate google page
        driver.navigate().to("https://www.google.com");
    }//end of precondition

    @Test(priority = 1)
    public void SearchForAKeyword(){
        //verify the title says 'Google'
        String actualTitle = driver.getTitle();
        if(actualTitle.equals("Google")){
            System.out.println("Title matches as 'Google'");
        } else {
            System.out.println("Title doesn't match. Actual title is " + actualTitle);
        }

        //search for a keyword
        Reusable_Actions.sendKeysMethod(driver,"//*[@name='q']","Cars","Google Search");
        //submit
        Reusable_Actions.submitMethod(driver,"//*[@name='btnK']","Submit Button");

    }//end of test 1

//@Test(dependsOnMethods = "SearchForAKeyword")//use it when one @test depends on another one
//priority is used when test cases do not have correlation with each other


    @Test(priority = 2)
    public void CaptureSearchNumber(){
        String result = Reusable_Actions.getTextMethod(driver,"//*[@id='result-stats']","Search Result");
        String[] arrayResult = result.split(" ");
        System.out.println("My search number for cars is " + arrayResult[1]);
    }//end of test 2

    @AfterSuite
    public void quitSession(){
        driver.quit();
    }//end of aftersuite

    @BeforeMethod
    public void beforeTest(){
        System.out.println("This executes before each test");
    }

    @AfterMethod
    public void afterTest(){
        System.out.println("This executes after each test");
    }

}
