package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import dd_Util.test.testUtil;
import dd_core.testCore;

public class emailsTest10 extends testCore {
	public static final ExtentReports report=ExtentReports.get(emailsTest10.class);
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("emailsTest10")){
			throw new SkipException("Skipping the testcase as runmode is set to No ");
		}
		
	}
	@Test//(priority=10)
	public void totalEmailTest() throws InterruptedException, IOException{
		System.out.println("10th Testcase is Start");
		 app_logs.debug("10th Testcase is Start");
		 
		 try{
			 report.startTest("totalEmailTest");
			 report.log(LogStatus.INFO, "To verify Gmail Total Emails");
		 app_logs.debug("To verify Gmail Total Emails");
		 Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("totalEmails"))).isDisplayed(), "true");
			
			System.out.println("Verified the Gmail Total Emails");
		    app_logs.debug("Verified the Gmail Total Emails");
		    
		    app_logs.debug("To verify Gmail older");
		    Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("emailolder"))).isDisplayed(), "true");
		
		
			System.out.println("Verified the Gmail older");
		    app_logs.debug("Verified the Gmail older");
		    
		    report.log(LogStatus.PASS, "10th Testcase is Passed");
	}catch(Throwable t){
		System.out.println("10th Testcase is Failed");
		 app_logs.debug("10th Testcase is Failed");
		
	    //For ScreenShot and Extent Reports
		report.log(LogStatus.FAIL, "10th Testcase is Failed");
		String screenshotPath=testUtil.getScreenShot(driver, "totalEmailTest");
		report.attachScreenshot(screenshotPath);
		 
	 }
		 System.out.println("10th TestCase is Completed");
		  app_logs.debug("10th TestCase is Completed");
		  report.log(LogStatus.INFO, "10th TestCase is Completed");
	}
	
   @AfterTest
	public void closing(){
	
		report.endTest();
	}
}
