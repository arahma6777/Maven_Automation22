package CardinalHealth_PageObject;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Reusable_Annotations{



        ExtentTest logger;
        public Homepage (WebDriver driver) {
            PageFactory.initElements(driver,this);
            this.logger = Reusable_Annotations.logger;
        }


        @FindBy(xpath = "//*[@data-title='Services']")
        WebElement ServicesTab;

        @FindBy(xpath = "//*[text()='Ambulatory Surgery Center']")
        WebElement AmbulatorySurgeryCenterTab;

        @FindBy(xpath = "//*[text()='Medical Distribution Solutions']")
        WebElement MedicalDistributionTab;

        @FindBy(xpath = "//*[text()='Supply Chain Center']")
        WebElement SupplyChainCenterTab;

        @FindBy(xpath = "//*[text()='Supply Chain Center']")
        WebElement SupplyChainCenter;


        public void Hover_Over_ServicesTab() {Reusable_Actions_Loggers_POM.mouseHover(driver,ServicesTab,logger,"Services Tab");}
        public void Hover_Over_AmbulatorySurgeryCenterTab() {Reusable_Actions_Loggers_POM.mouseHover(driver,AmbulatorySurgeryCenterTab,logger,"Ambulatory Surgery Center Tab");}
        public void Hover_Over_MedicalDistributionTab() {Reusable_Actions_Loggers_POM.mouseHover(driver,MedicalDistributionTab,logger,"Medical Distribution Tab");}
        public void Hover_Over_SupplyChainCenterTab() {Reusable_Actions_Loggers_POM.mouseHover(driver,SupplyChainCenterTab,logger,"Supply Chain Center Tab");}
        public void ClickOn_SupplyChainCenter() {Reusable_Actions_Loggers_POM.clickMethod(driver,SupplyChainCenter,logger,"Supply Chain Center");}

}
