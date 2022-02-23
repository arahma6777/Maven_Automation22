package CardinalHealth_PageObject;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupplyChainCenter extends Reusable_Annotations {

    ExtentTest logger;

    public SupplyChainCenter(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations.logger;
    }


    @FindBy(xpath = "//*[text()='Download the infographic']")
    WebElement infographic;

    @FindBy(xpath = "//*[text()='Read the webinar recap']")
    WebElement WebinarRecap;

    @FindBy(xpath = "//*[text()='Read the article']")
    WebElement Article;

    @FindBy(xpath = "//*[text()='Download the one-pager']")
    WebElement One_Pager;

    @FindBy(xpath = "//*[text()='Listen to the podcast']")
    WebElement Podcast;

    @FindBy(xpath = "//*[text()='View the session recap']")
    WebElement SessionRecap;

    @FindBy(xpath = "//*[contains(@class,'video-banner-heading')]")
    WebElement SupplyChainCenterLettering;


    public void ClickOn_infographic() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, infographic, logger, "Infographic");
    }

    public void ClickOn_WebinarRecap() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, WebinarRecap, logger, "Webinar Recap");
    }

    public void ClickOn_Article() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, Article, logger, "Article");
    }

    public void ClickOn_One_Pager() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, One_Pager, logger, "One-Pager");
    }

    public void ClickOn_Podcast() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, Podcast, logger, "Podcast");
    }

    public void ClickOn_SessionRecap() {
        Reusable_Actions_Loggers_POM.clickMethod(driver,SessionRecap , logger, "Session Recap");
    }


    public String[] GetSupplyChainInfo() {
        String result = Reusable_Actions_Loggers_POM.getTextMethod(driver, SupplyChainCenterLettering, logger, "SCC Lettering");
        System.out.println("Obtained: " + result);
        return new String[]{result};
    }

}
