package Automation_Project_CardinalHealth;

import CardinalHealth_PageObject.BaseClass_CardinalHealth;
import References.Reusable_Actions;
import Reusable_Library.Reusable_Annotations;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC1_to_TC7 extends Reusable_Annotations {


     @Test(priority = 1)

     public void SupplyChainCenter() throws IOException, BiffException, WriteException, InterruptedException {

          driver.navigate().to("https://www.cardinalhealth.com");


          BaseClass_CardinalHealth.homepage().Hover_Over_ServicesTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_AmbulatorySurgeryCenterTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_MedicalDistributionTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_SupplyChainCenterTab();
          BaseClass_CardinalHealth.homepage().ClickOn_SupplyChainCenter();
          BaseClass_CardinalHealth.supplyChainCenter().GetSupplyChainInfo();

     }

     @Test(priority = 2)

     public void ClickonInfographic() throws IOException, BiffException, WriteException, InterruptedException {

          driver.navigate().to("https://www.cardinalhealth.com");


          BaseClass_CardinalHealth.homepage().Hover_Over_ServicesTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_AmbulatorySurgeryCenterTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_MedicalDistributionTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_SupplyChainCenterTab();
          BaseClass_CardinalHealth.homepage().ClickOn_SupplyChainCenter();

          Reusable_Actions.scrollMethod(driver,"0","500","Scroll");

          BaseClass_CardinalHealth.supplyChainCenter().ClickOn_infographic();

          String actualTitle = driver.getTitle();
          if (actualTitle.equals("cardinal-health-contingency-stock-planning-infographic")) {
               System.out.println("Title matches");
          } else {
               System.out.println("Title doesn't match. Actual title is " + actualTitle);
          }


     }

     @Test(priority = 3)

     public void ClickonWebinarRecap() throws IOException, BiffException, WriteException, InterruptedException {

          driver.navigate().to("https://www.cardinalhealth.com");


          BaseClass_CardinalHealth.homepage().Hover_Over_ServicesTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_AmbulatorySurgeryCenterTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_MedicalDistributionTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_SupplyChainCenterTab();
          BaseClass_CardinalHealth.homepage().ClickOn_SupplyChainCenter();

          Reusable_Actions.scrollMethod(driver,"0","500","Scroll");
          BaseClass_CardinalHealth.supplyChainCenter().ClickOn_WebinarRecap();

          String actualTitle = driver.getTitle();
          if (actualTitle.equals("how-to-manage-a-clinically-integrated-supply-chain-5-takeaways-for-asc-leaders")) {
               System.out.println("Title matches");
          } else {
               System.out.println("Title doesn't match. Actual title is " + actualTitle);
          }

     }

     @Test(priority = 4)

     public void ClickonReadtheArticle() throws IOException, BiffException, WriteException, InterruptedException {

          driver.navigate().to("https://www.cardinalhealth.com");


          BaseClass_CardinalHealth.homepage().Hover_Over_ServicesTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_AmbulatorySurgeryCenterTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_MedicalDistributionTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_SupplyChainCenterTab();
          BaseClass_CardinalHealth.homepage().ClickOn_SupplyChainCenter();

          Reusable_Actions.scrollMethod(driver,"0","500","Scroll");
          BaseClass_CardinalHealth.supplyChainCenter().ClickOn_Article();

          String actualTitle = driver.getTitle();
          if (actualTitle.equals("cardinal-health-four-things-to-ask-your-distributor-about-new-ASCs")) {
               System.out.println("Title matches");
          } else {
               System.out.println("Title doesn't match. Actual title is " + actualTitle);
          }

     }

     @Test(priority = 5)

     public void ClickonReadtheOnePager() throws IOException, BiffException, WriteException, InterruptedException {

          driver.navigate().to("https://www.cardinalhealth.com");


          BaseClass_CardinalHealth.homepage().Hover_Over_ServicesTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_AmbulatorySurgeryCenterTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_MedicalDistributionTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_SupplyChainCenterTab();
          BaseClass_CardinalHealth.homepage().ClickOn_SupplyChainCenter();

          Reusable_Actions.scrollMethod(driver,"0","550","Scroll");
          BaseClass_CardinalHealth.supplyChainCenter().ClickOn_One_Pager();

          String actualTitle = driver.getTitle();
          if (actualTitle.equals("cardinal-health-acute-distribution-supply-chain-excellence")) {
               System.out.println("Title matches");
          } else {
               System.out.println("Title doesn't match. Actual title is " + actualTitle);
          }


     }

     @Test(priority = 6)

     public void ClickonListentoPodcast() throws IOException, BiffException, WriteException, InterruptedException {

          driver.navigate().to("https://www.cardinalhealth.com");


          BaseClass_CardinalHealth.homepage().Hover_Over_ServicesTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_AmbulatorySurgeryCenterTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_MedicalDistributionTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_SupplyChainCenterTab();
          BaseClass_CardinalHealth.homepage().ClickOn_SupplyChainCenter();

          Reusable_Actions.scrollMethod(driver, "0", "550", "Scroll");
          BaseClass_CardinalHealth.supplyChainCenter().ClickOn_Podcast();

          String actualTitle = driver.getTitle();
          if (actualTitle.equals("Helping you achieve supply chain excellence")) {
               System.out.println("Title matches");
          } else {
               System.out.println("Title doesn't match. Actual title is " + actualTitle);
          }

     }

     @Test(priority = 7)

     public void ClickonSessionRecap() throws IOException, BiffException, WriteException, InterruptedException {

          driver.navigate().to("https://www.cardinalhealth.com");


          BaseClass_CardinalHealth.homepage().Hover_Over_ServicesTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_AmbulatorySurgeryCenterTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_MedicalDistributionTab();
          BaseClass_CardinalHealth.homepage().Hover_Over_SupplyChainCenterTab();
          BaseClass_CardinalHealth.homepage().ClickOn_SupplyChainCenter();

          Reusable_Actions.scrollMethod(driver, "0", "550", "Scroll");
          BaseClass_CardinalHealth.supplyChainCenter().ClickOn_SessionRecap();

          String actualTitle = driver.getTitle();
          if (actualTitle.equals("cardinal-health-beckers-next-gen-supply-chain-annual-meeting-FY21")) {
               System.out.println("Title matches");
          } else {
               System.out.println("Title doesn't match. Actual title is " + actualTitle);
          }

     }












     }
