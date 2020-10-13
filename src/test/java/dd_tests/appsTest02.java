package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import dd_Util.test.testUtil;
import dd_core.testCore;

public class appsTest02 extends testCore {
	public static final ExtentReports report=ExtentReports.get(appsTest02.class);
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("appsTest02")){
			throw new SkipException("Skipping the testcase as runmode is set to No ");
		
		}
	
	}
	
	@Test//(priority=2)
	public void testCaseTwo() throws InterruptedException, IOException{
		System.out.println("2nd Testcase is Start");
		app_logs.debug("2nd Testcase is Start");
		 
		 try{
			 report.startTest("testCaseTwo");
		//Click on Apps
		WebElement sub=driver.findElement(By.xpath(object.getProperty("Apps")));
		Actions action=new Actions(driver);
		action.moveToElement(sub).build().perform();
		Thread.sleep(2000L);
		sub.click();
	    app_logs.debug("Click on Google Apps");
	    report.log(LogStatus.INFO, "Click on Google Apps");
	     
	    Thread.sleep(5000L);
	    app_logs.debug("Switch to Frames");
	    System.out.println(driver.findElements(By.tagName("iframe")).size());
	    driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
	    Thread.sleep(5000L);
	     
	    app_logs.debug("To Verify Account");
	    String actualAcc= driver.findElement(By.xpath(object.getProperty("Account"))).getText();	 
	    System.out.println(actualAcc);  
	    String expectedAcc="Account";
		Assert.assertEquals(actualAcc, expectedAcc);
		app_logs.debug("Verified the Account App is Present");
		report.log(LogStatus.INFO, "Verified the Account App is Present");
		
		app_logs.debug("To Verify Search");
	    String actualSea= driver.findElement(By.xpath(object.getProperty("search"))).getText();	 
	    System.out.println(actualSea);  
	    String expectedSea="Search";
		Assert.assertEquals(actualSea, expectedSea);
		app_logs.debug("Verified the Search App is Present");
		report.log(LogStatus.INFO, "Verified the Search App is Present");
		
		app_logs.debug("To Verify Maps");
	    String actualmp= driver.findElement(By.xpath(object.getProperty("map"))).getText();	 
	    System.out.println(actualmp);  
	    String expectedmp="Maps";
		Assert.assertEquals(actualmp, expectedmp);
		app_logs.debug("Verified the Maps App is Present");
		report.log(LogStatus.INFO, "Verified the Maps App is Present");
		
		app_logs.debug("To Verify YouTube");
	    String actualyt= driver.findElement(By.xpath(object.getProperty("youtube"))).getText();	 
	    System.out.println(actualyt);  
	    String expectedyt="YouTube";
		Assert.assertEquals(actualyt, expectedyt);
		app_logs.debug("Verified the YouTube App is Present");
		report.log(LogStatus.INFO, "Verified the YouTube App is Present");
		
		app_logs.debug("To Verify Play");
	    String actualpl= driver.findElement(By.xpath(object.getProperty("play"))).getText();	 
	    System.out.println(actualpl);  
	    String expectedpl="Play";
		Assert.assertEquals(actualpl, expectedpl);
		app_logs.debug("Verified the Play App is Present");
		report.log(LogStatus.INFO, "Verified the Play App is Present");
		
		app_logs.debug("To Verify News");
	    String actualne= driver.findElement(By.xpath(object.getProperty("news"))).getText();	 
	    System.out.println(actualne);  
	    String expectedne="News";
		Assert.assertEquals(actualne, expectedne);
		app_logs.debug("Verified the News App is Present");
		report.log(LogStatus.INFO, "Verified the News App is Present");
		
		app_logs.debug("To Verify Gmail");
	    String actualgm= driver.findElement(By.xpath(object.getProperty("gmail"))).getText();	 
	    System.out.println(actualgm);  
	    String expectedgm="Gmail";
		Assert.assertEquals(actualgm, expectedgm);
		app_logs.debug("Verified the Gmail App is Present");
		report.log(LogStatus.INFO, "Verified the Gmail App is Present");
		
		app_logs.debug("To Verify Meet");
	    String actualmt= driver.findElement(By.xpath(object.getProperty("meet"))).getText();	 
	    System.out.println(actualmt);  
	    String expectedmt="Meet";
		Assert.assertEquals(actualmt, expectedmt);
		app_logs.debug("Verified the Meet App is Present");
		report.log(LogStatus.INFO, "Verified the Meet App is Present");
		
		app_logs.debug("To Verify contacts");
	    String actualcon= driver.findElement(By.xpath(object.getProperty("contacts"))).getText();	 
	    System.out.println(actualcon);  
	    String expectedcon="Contacts";
		Assert.assertEquals(actualcon, expectedcon);
		app_logs.debug("Verified the contacts App is Present");
		report.log(LogStatus.INFO, "Verified the contacts App is Present");
		
		app_logs.debug("To Verify Drive");
	    String actualdr= driver.findElement(By.xpath(object.getProperty("drive"))).getText();	 
	    System.out.println(actualdr);  
	    String expecteddr="Drive";
		Assert.assertEquals(actualdr, expecteddr);
		app_logs.debug("Verified the Drive App is Present");
		report.log(LogStatus.INFO, "Verified the Drive App is Present");
		
		app_logs.debug("To Verify Calendar");
	    String actualcal= driver.findElement(By.xpath(object.getProperty("calendar"))).getText();	 
	    System.out.println(actualcal);  
	    String expectedcal="Calendar";
		Assert.assertEquals(actualcal, expectedcal);
		app_logs.debug("Verified the Calendar App is Present");
		report.log(LogStatus.INFO, "Verified the Calendar App is Present");
		
		app_logs.debug("To Verify Translate");
	    String actualtran= driver.findElement(By.xpath(object.getProperty("translate"))).getText();	 
	    System.out.println(actualtran);  
	    String expectedtran="Translate";
		Assert.assertEquals(actualtran, expectedtran);
		app_logs.debug("Verified the Translate App is Present");
		report.log(LogStatus.INFO, "Verified the Translate App is Present");
		
		app_logs.debug("To Verify photos");
	    String actualph= driver.findElement(By.xpath(object.getProperty("photos"))).getText();	 
	    System.out.println(actualph);  
	    String expectedph="Photos";
		Assert.assertEquals(actualph, expectedph);
		app_logs.debug("Verified the photos App is Present");
		report.log(LogStatus.INFO, "Verified the photos App is Present");
		
		app_logs.debug("To Verify Duo");
	    String actuald= driver.findElement(By.xpath(object.getProperty("duo"))).getText();	 
	    System.out.println(actuald);  
	    String expectedd="Duo";
		Assert.assertEquals(actuald, expectedd);
		app_logs.debug("Verified the Duo App is Present");
		report.log(LogStatus.INFO, "Verified the Duo App is Present");
		
		app_logs.debug("To Verify Shopping");
	    String actualshop= driver.findElement(By.xpath(object.getProperty("shopping"))).getText();	 
	    System.out.println(actualshop);  
	    String expectedshop="Shopping";
		Assert.assertEquals(actualshop, expectedshop);
		app_logs.debug("Verified the Shopping App is Present");
		report.log(LogStatus.INFO, "Verified the Shopping App is Present");
		
		//driver.navigate().refresh();
		
		report.log(LogStatus.PASS, "2nd Testcase is Passed");
	}catch(Throwable t){
		System.out.println("2nd Testcase is Failed");
		 app_logs.debug("2nd Testcase is Failed");
		
	    //For ScreenShot and Extent Reports
		report.log(LogStatus.FAIL, "2nd Testcase is Failed");
		String screenshotPath=testUtil.getScreenShot(driver, "testCaseTwo");
		report.attachScreenshot(screenshotPath);
	    }

	
	      
	  System.out.println("2nd Testcase is Completed");
	  app_logs.debug("2nd Testcase is Completed");
	  report.log(LogStatus.PASS, "2nd Testcase is Completed");
	  
	}
	
/*	@AfterTest
	public void closing(){
	
		report.endTest();
	}*/
	
	
	
}