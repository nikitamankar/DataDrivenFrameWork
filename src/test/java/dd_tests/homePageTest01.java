package dd_tests;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import dd_Util.test.testUtil;

import dd_core.testCore;

public class homePageTest01 extends testCore {
	public static final ExtentReports report=ExtentReports.get(homePageTest01.class);

	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("homePageTest01")){
			throw new SkipException("Skipping the testcase as runmode is set to No ");
		
		}
	
	}
	
	@BeforeMethod
	public void setExtent()
	{
	   report.init(System.getProperty("user.dir")+"\\report.html", true);
	}
	
	@Test//(priority=1)
	public void testCaseOne() throws Exception{
		System.out.println("1st Testcase is Start");
		 app_logs.debug("1st Testcase is Start");
	
		 try{
			 report.startTest("testCaseOne");
			//For Sign In Button
		 String actual= driver.findElement(By.xpath(object.getProperty("SignIn"))).getText();
		 System.out.println(actual);
	     String expected="Sign in";
	     Assert.assertEquals(actual, expected);
	   	 app_logs.debug("Verified the Sign In Button is Present");
	   	 report.log(LogStatus.INFO, "Verified the Sign In Button is Present");
	   	
	     Thread.sleep(5000);
	       
	       //For Search Box
	     WebElement search=driver.findElement(By.name(object.getProperty("SearchBox")));
	     search.sendKeys("Selenium");
	     String actualbox=search.getAttribute("value");
	     System.out.println(actualbox);
	     String expectedbox="Selenium";
	     Assert.assertEquals(actualbox, expectedbox);
	     app_logs.debug("Verified the Search Box is Present");
	     report.log(LogStatus.INFO, "Verified the Search Box is Present");
	      
	     //For Google checked
	     String actualgoogle=driver.findElement(By.xpath(object.getProperty("googleCheck"))).getAttribute("value");
	     System.out.println(actualgoogle);
	     String expectedgoogle="Google Search";
	     Assert.assertEquals(actualgoogle, expectedgoogle);
	     Thread.sleep(3000);
	     app_logs.debug("Verified the GoogleSearch Button is Present");
	     report.log(LogStatus.INFO, "Verified the GoogleSearch Button is Present");
	       
	     //For I'm Feeling Lucky checked
	      String actualLucky=driver.findElement(By.xpath(object.getProperty("Lucky"))).getAttribute("value");
	      System.out.println(actualLucky);
	      String expectedLucky="I'm Feeling Lucky";
	      Assert.assertEquals(actualLucky, expectedLucky);
	      app_logs.debug("Verified the I'm Feeling Lucky  Button is Present");
	      report.log(LogStatus.INFO, "Verified the I'm Feeling Lucky  Button is Present");
	      report.log(LogStatus.PASS, "1st Testcase is Passed");
	      
	    }catch(Throwable t){
			 System.out.println("1st Testcase is Failed");
			 app_logs.debug("1st Testcase is Failed");
			
		    //For ScreenShot and Extent Reports
			report.log(LogStatus.FAIL, "1st Testcase is Failed");
			String screenshotPath=testUtil.getScreenShot(driver, "testCaseOne");
			report.attachScreenshot(screenshotPath);
			
		
			 	 
		
		}
	
		System.out.println("1st Testcase is Completed");
	 	app_logs.debug("1st Testcase is Comlpeted");
	 	report.log(LogStatus.PASS, "1st Testcase is Completed");   
	}
	
	 @AfterTest
		public void closing(){
		
			report.endTest();
		}
	
	

}
