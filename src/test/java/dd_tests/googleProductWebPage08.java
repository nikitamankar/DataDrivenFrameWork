package dd_tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import dd_Util.test.testUtil;
import dd_core.testCore;

public class googleProductWebPage08 extends testCore {
	public static final ExtentReports report=ExtentReports.get(LoginTest04.class);
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("googleProductWebPage08")){
			throw new SkipException("Skipping the testcase as runmode is set to No ");
		}
		
	}
	@Test//(priority=8)
	public void searchappsTest08() throws IOException{
		System.out.println("8th Testcase is Start");
		 app_logs.debug("8th Testcase is Start");
		
		 
		 //((JavascriptExecutor)driver).executeScript("scroll(0,800)");
		 try{
			 report.startTest("searchappsTest08");
	
		 report.log(LogStatus.INFO, "Launch the Google apps/products on Google products webpage");
		 app_logs.debug("Launch the Google apps/products on Google products webpage");
		 driver.get(config.getProperty("productsite"));
		 
		 ((JavascriptExecutor)driver).executeScript("scroll(0,10000)");
		 
		 app_logs.debug("Locate the Google apps/products");
		 WebElement block=driver.findElement(By.xpath(object.getProperty("appsblock")));
		 List<WebElement> apps=block.findElements(By.tagName("a"));
	        for(int i=0;i<apps.size();i++)
	        {
	         app_logs.debug("Validate the Google apps");
	     	   System.out.println(apps.get(i).getText());
	     	   String a=apps.get(i).getText();
	     	   Assert.assertTrue(apps.get(i).isDisplayed(), "true");
	     	   System.out.println("App is Present");
	        }
	        System.out.println("Total appss in block are"+apps.size());
	        report.log(LogStatus.INFO, "Validate all the Apps");
	        System.out.println("8th Testcase is Completed");
			 app_logs.debug("8th Testcase is Completed");
			 
			 driver.navigate().back();
			 
			 report.log(LogStatus.PASS, "8th Testcase is Passed");
	}catch(Throwable t){
		System.out.println("8th Testcase is Failed");
		 app_logs.debug("8th Testcase is Failed");
		
	    //For ScreenShot and Extent Reports
		report.log(LogStatus.FAIL, "8th Testcase is Failed");
		String screenshotPath=testUtil.getScreenShot(driver, "searchappsTest08");
		report.attachScreenshot(screenshotPath);
	 }
		 System.out.println("8th TestCase is Completed");
		  app_logs.debug("8th TestCase is Completed");
		  report.log(LogStatus.INFO, "8th TestCase is Completed");
		 
	}

}
