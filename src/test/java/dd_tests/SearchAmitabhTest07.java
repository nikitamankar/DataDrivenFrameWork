package dd_tests;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import dd_Util.test.testUtil;
import dd_core.testCore;

public class SearchAmitabhTest07 extends testCore {
	public static final ExtentReports report=ExtentReports.get(LoginTest04.class);
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("SearchAmitabhTest07")){
			throw new SkipException("Skipping the testcase as runmode is set to No ");
		}
	
	}
	@Test//(priority=7)
	public void searchTest07() throws IOException{
		System.out.println("7th Testcase is Start");
		 app_logs.debug("7th Testcase is Start");
		
		 try{
			 report.startTest("searchTest07");

			// driver.get(config.getProperty("testsite"));
			 System.out.println("Search for Amitabh Bachchan"); 
		 app_logs.debug("Search for Amitabh Bachchan");
		 report.log(LogStatus.INFO, "Search for Amitabh Bachchan");
		driver.findElement(By.name(object.getProperty("SearchBox"))).sendKeys("Amitabh Bachchan");
		driver.findElement(By.name(object.getProperty("SearchBox"))).sendKeys(Keys.ENTER);
		app_logs.debug("Click on Amitabh Bachchan");
		//driver.findElement(By.xpath(object.getProperty("bachchan"))).click();
		System.out.println("Validation for Amitabh Bachchan ");
		app_logs.debug("Validation of Amitabh Bachchan - Wikipedia on page");
		String actual= driver.findElement(By.xpath(object.getProperty("bachchan1"))).getText();
		System.out.println(actual);
	    String expected="Amitabh Bachchan - Wikipedia";
	    Assert.assertEquals(actual, expected);
	    
	    report.log(LogStatus.INFO, "Scroll the site");
	    ((JavascriptExecutor)driver).executeScript("scroll(0,1800)");
	    
	  /*  app_logs.debug("Validation of Amitabh Bachchan (@SrBachchan) · Twitter on page");
	    String actual1= driver.findElement(By.xpath(object.getProperty("bachchan2"))).getText();
		System.out.println(actual1);
	    String expected1="Amitabh Bachchan on Twitter";
	    Assert.assertEquals(actual1, expected1);  */
	    
	    app_logs.debug("Validation of Amitabh Bachchan - IMDb on page");
	    String actual2= driver.findElement(By.xpath(object.getProperty("bachchan3"))).getText();
		System.out.println(actual2);
	    String expected2="Amitabh Bachchan - IMDb";
	    Assert.assertEquals(actual2, expected2);
	    
	    app_logs.debug("Validation of Amitabh Bachchan - Home | Facebook");
	    String actual3= driver.findElement(By.xpath(object.getProperty("bachchan4"))).getText();
		System.out.println(actual3);
	    String expected3="Amitabh Bachchan - Home | Facebook";
	    Assert.assertEquals(actual3, expected3);
	    System.out.println("Validate  Amitabh Bachchan ");
	    app_logs.debug("Validate  Amitabh Bachchan ");
	    report.log(LogStatus.INFO, "Validate  Amitabh Bachchan ");
	   
	    driver.navigate().back();
//-----------------------------Abdul Kalam-------------------	    
	    app_logs.debug("Search for Abdul Kalam");
	    report.log(LogStatus.INFO, "Search for Abdul Kalam");
		driver.findElement(By.name(object.getProperty("SearchBox"))).sendKeys("Abdul Kalam");
		driver.findElement(By.name(object.getProperty("SearchBox"))).sendKeys(Keys.ENTER);
		app_logs.debug("Click on Abdul Kalam");
		//driver.findElement(By.xpath(object.getProperty("kalam"))).click();
		System.out.println("Validation for Abdul Kalam ");
		app_logs.debug("Validate A. P. J. Abdul Kalam - Wikipedia on page");
		String actualk= driver.findElement(By.xpath(object.getProperty("kalam1"))).getText();
		System.out.println(actualk);
	    String expectedk="A. P. J. Abdul Kalam - Wikipedia";
	    Assert.assertEquals(actualk, expectedk);
	    
	  /*  app_logs.debug("Validate Images for abdul kalam on page");
	    String actualk1= driver.findElement(By.xpath(object.getProperty("kalam2"))).getText();
		System.out.println(actualk1);
	    String expectedk1="Images for abdul kalam";
	    Assert.assertEquals(actualk1, expectedk1);   */
	    
	    report.log(LogStatus.INFO, "Scroll a site");
	    ((JavascriptExecutor)driver).executeScript("scroll(0,1800)");
	    
	    app_logs.debug("Validate Dr.APJ.Abdulkalam Official Website | Dr.Kalam Speeches | Dr ... on page");
	    String actualk2= driver.findElement(By.xpath(object.getProperty("kalam3"))).getText();
		System.out.println(actualk2);
	    String expectedk2="Dr.APJ.Abdulkalam Official Website | Dr.Kalam Speeches | Dr ...";
	    Assert.assertEquals(actualk2, expectedk2);
	    
	    app_logs.debug("Validate A.P.J. Abdul Kalam | Biography & Facts | Britannica on page");
	    String actualk3= driver.findElement(By.xpath(object.getProperty("kalam4"))).getText();
		System.out.println(actualk3);
	    String expectedk3="A.P.J. Abdul Kalam | Biography & Facts | Britannica";
	    Assert.assertEquals(actualk3, expectedk3);
	    System.out.println("Validate  Abdul Kalam on page ");
	    app_logs.debug("Validate  Abdul Kalam on page ");
	    report.log(LogStatus.INFO, "Validate  Abdul Kalam on page");
	    
	    System.out.println("7th Testcase is Completed");
	    driver.navigate().back();
	    
	    report.log(LogStatus.PASS, "7th Testcase is Passed");
	}catch(Throwable t){
		System.out.println("7th Testcase is Failed");
		 app_logs.debug("7th Testcase is Failed");
		
	    //For ScreenShot and Extent Reports
		report.log(LogStatus.FAIL, "7th Testcase is Failed");
		String screenshotPath=testUtil.getScreenShot(driver, "searchTest07");
		report.attachScreenshot(screenshotPath);
		 }
		 System.out.println("7th TestCase is Completed");
		  app_logs.debug("7th TestCase is Completed");
		  report.log(LogStatus.INFO, "7th TestCase is Completed");
	}
	

}
