package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import dd_Util.test.testUtil;
import dd_core.testCore;

public class LoginToGmail09 extends testCore {
	public static final ExtentReports report=ExtentReports.get(LoginTest04.class);
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("LoginToGmail09")){
			throw new SkipException("Skipping the testcase as runmode is set to No ");
		}
		
	}
	@Test(dataProvider="getData")//,priority=9)
	public void gmailTest09(String emailID, String password) throws InterruptedException, IOException{
		System.out.println("9th Testcase is Start");
		 app_logs.debug("9th Testcase is Start");
		
		 try{
			 report.startTest("gmailTest09");
				
			 report.log(LogStatus.INFO, "Launch the Gmail site");
			 app_logs.debug("Launch the Gmail site");
		 driver.get(config.getProperty("gmailAccountsite"));
		
		 app_logs.debug("Click Use the another Account");
		 report.log(LogStatus.INFO, "Click Use the another Account");
		 driver.findElement(By.xpath(object.getProperty("useother"))).click();
		
		 Thread.sleep(5000L);
		 app_logs.debug("Enter the Email ID");
			report.log(LogStatus.INFO, "Enter the Email ID");
		 driver.findElement(By.xpath(object.getProperty("email1"))).sendKeys(emailID);
			driver.findElement(By.xpath(object.getProperty("next"))).click();
			 app_logs.debug("Enter the Password");
				report.log(LogStatus.INFO, "Enter the Password");
			driver.findElement(By.name(object.getProperty("pass"))).sendKeys(password);
			Thread.sleep(5000L);
			driver.findElement(By.xpath(object.getProperty("next"))).click();
			Thread.sleep(5000L);
			System.out.println("Gmail Login is Sucessfully");
			app_logs.debug("Gmail Login is Sucessfully");
			report.log(LogStatus.INFO, "Gmail Login is Sucessfully");
			//For Gmail
			app_logs.debug("To verify Gmail Logo");
			Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("gmaill"))).isDisplayed(), "true");
			System.out.println("Verified the Gmail Logo is Present");
		    app_logs.debug("Verified the Gmail Logo is Present");
		    //For Compose
		    app_logs.debug("To verify Gmail compose");
			String actualC=driver.findElement(By.xpath(object.getProperty("gmailC"))).getText();
			System.out.println(actualC);
			String expectedC="Compose";
			Assert.assertEquals(actualC, expectedC);
			System.out.println("Verified the Gmail compose is Present");
		    app_logs.debug("Verified the Gmail compose is Present");

		  //For Starred
		    app_logs.debug("To verify Gmail Starred");
			String actualS=driver.findElement(By.xpath(object.getProperty("gmailS"))).getText();
			System.out.println(actualS);
			String expectedS="Starred";
			Assert.assertEquals(actualS, expectedS);
			System.out.println("Verified the Gmail Starred is Present");
		    app_logs.debug("Verified the Gmail Starred is Present");
		    
		    //For Snoozed
		    app_logs.debug("To verify Gmail Snoozed");
			String actualSn=driver.findElement(By.xpath(object.getProperty("gmailSn"))).getText();
			System.out.println(actualSn);
			String expectedSn="Snoozed";
			Assert.assertEquals(actualSn, expectedSn);
			System.out.println("Verified the Gmail Snoozed is Present");
		    app_logs.debug("Verified the Gmail Snoozed is Present");
		    
		  //For Sent
		    app_logs.debug("To verify Gmail Sent");
			String actualSe=driver.findElement(By.xpath(object.getProperty("gmailSe"))).getText();
			System.out.println(actualSe);
			String expectedSe="Sent";
			Assert.assertEquals(actualSe, expectedSe);
			System.out.println("Verified the Gmail Sent is Present");
		    app_logs.debug("Verified the Gmail Sent is Present");
		    
		    //For Sent
		    app_logs.debug("To verify Gmail Drafts");
			String actualD=driver.findElement(By.xpath(object.getProperty("gmailD"))).getText();
			System.out.println(actualD);
			String expectedD="Drafts";
			Assert.assertEquals(actualD, expectedD);
			System.out.println("Verified the Gmail Drafts is Present");
		    app_logs.debug("Verified the Gmail Drafts is Present");
		    
		  //For Sent
		    app_logs.debug("To verify Gmail More");
			String actualM=driver.findElement(By.xpath(object.getProperty("gmailM"))).getText();
			System.out.println(actualM);
			String expectedM="More";
			Assert.assertEquals(actualM, expectedM);
			System.out.println("Verified the Gmail More is Present");
		    app_logs.debug("Verified the Gmail More is Present");
		    
		    report.log(LogStatus.INFO, "Verified all Keys in Gmail Page");
		    app_logs.debug("Verified all Keys in Gmail Page");
		    
		    report.log(LogStatus.PASS, "9th Testcase is Passed");
	}catch(Throwable t){
		System.out.println("9th Testcase is Failed");
		 app_logs.debug("9th Testcase is Failed");
		
	    //For ScreenShot and Extent Reports
		report.log(LogStatus.FAIL, "9th Testcase is Failed");
		String screenshotPath=testUtil.getScreenShot(driver, "gmailTest09");
		report.attachScreenshot(screenshotPath);
		 
	 }
		 System.out.println("9th TestCase is Completed");
		  app_logs.debug("9th TestCase is Completed");
		  report.log(LogStatus.INFO, "9th TestCase is Completed");
		    
	}
	
	@DataProvider
	public static Object[][] getData(){
		
		return testUtil.getData("LoginTest04");
	}
	
	
	
	

}
