package dd_tests;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import dd_Util.test.testUtil;
import dd_core.testCore;

public class titleTest03 extends testCore {
	public static final ExtentReports report=ExtentReports.get(titleTest03.class);
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("titleTest03")){
			throw new SkipException("Skipping the testcase as runmode is set to No ");
		}
	
	}
	@Test//(priority=3)
	public void testCaseThree()throws InterruptedException, IOException{
		System.out.println("3rd TestCase is Start");
		 app_logs.debug("3rd TestCase is Start");
		
         try{
         report.startTest("testCaseThree");
		 
//-------------------For Account-------------------------------------------
	    app_logs.debug("Click on Account");
	    report.log(LogStatus.INFO, "Click on Account");
	    driver.findElement(By.xpath(object.getProperty("Account"))).click();
	    app_logs.debug("To verify Account title");
	    driver.get(config.getProperty("accountsite"));
	    String title = driver.getTitle();
	    System.out.println("Title is: " +title);
	    String expectedAcc="Google Account";
		Assert.assertEquals(title, expectedAcc);
		app_logs.debug("Verified the Account title");
		report.log(LogStatus.INFO, "Verified the Account title");
	    System.out.println("done");
	    

		app_logs.debug("To verify Account Logo");
	    String actualAcc= driver.findElement(By.xpath(object.getProperty("AccountL"))).getText();
	    System.out.println(actualAcc);  
	    String expected="Account";
		Assert.assertEquals(actualAcc, expected);
		app_logs.debug("Verified the Account Logo is Present");
		report.log(LogStatus.INFO, "Verified the Account Logo is Present");
		System.out.println("Verified the Account Logo is Present");
		driver.navigate().back();
		app_logs.debug("Back to Current google.co.in site");
		testUtil.appsone();
		app_logs.debug("call the testUtil and Click on Apps");
		
//-----------------------For Search---------------------------------------------------
		app_logs.debug("Click on Search");
	    driver.findElement(By.xpath(object.getProperty("search"))).click();
	    app_logs.debug("To verify Search title");
	    driver.get(config.getProperty("searchsite"));
	    String titleSea = driver.getTitle();
	    System.out.println("Title is: " +titleSea);
	    String expectedSea="Google";
		Assert.assertEquals(titleSea, expectedSea);
		app_logs.debug("Verified the Search title");
		report.log(LogStatus.INFO, "Verified the Search title");
		
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
	      
	      driver.navigate().back();
		  app_logs.debug("Back to Current google.co.in site");
		  testUtil.appsone();
		  app_logs.debug("call the testUtil and Click on Apps");
			
//-------------------------For Maps-------------------------------------------------
	      app_logs.debug("Click on Map");
		  driver.findElement(By.xpath(object.getProperty("map"))).click();
		  app_logs.debug("To verify Map title");
		  driver.get(config.getProperty("mapsite"));
		  String titlemap = driver.getTitle();
		  System.out.println("Title is: " +titlemap);
		  String expectedmap="Google Maps";
		  Assert.assertEquals(titlemap, expectedmap);
		  app_logs.debug("Verified the Map title");
		  report.log(LogStatus.INFO, "Verified the Map title");
			
		  app_logs.debug("To verify Map Search Box");
		  WebElement searchM=driver.findElement(By.xpath(object.getProperty("mapL")));
		  searchM.sendKeys("Nagpur");
		  String actualYbox=searchM.getAttribute("value");
		  System.out.println(actualYbox);
		  String expectedYbox="Nagpur";
		  Assert.assertEquals(actualYbox, expectedYbox);
		  app_logs.debug("Verified the Search Box is Present");
		  report.log(LogStatus.INFO, "Verified the Search Box is Present");
			
		  driver.navigate().back();
		  driver.navigate().back();
		  app_logs.debug("Back to Current google.co.in site");
		  Thread.sleep(5000L);
		  testUtil.appsone();
		  app_logs.debug("call the testUtil and Click on Apps");   
	     
			
//----------------------For YouTube-----------------------------------------------
	      app_logs.debug("Click on YouTube");
		  driver.findElement(By.xpath(object.getProperty("youtube"))).click();
		  app_logs.debug("To verify YouTube title");
		  driver.get(config.getProperty("youtubesite"));
		  String titleyou = driver.getTitle();
		  System.out.println("Title is: " +titleyou);
		  String expectedyou="YouTube";
		  Assert.assertEquals(titleyou, expectedyou);
		  app_logs.debug("Verified the YouTube title");
		  report.log(LogStatus.INFO, "Verified the YouTube title");
			  //Youtube Start
		  app_logs.debug("To verify YouTube Logo");
		  Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("youtubeL"))).isDisplayed(), "true");
		  System.out.println("Verified the Youtube Logo is Present");
		  app_logs.debug("Verified the Youtube Logo is Present");
		  report.log(LogStatus.INFO, "Verified the Youtube Logo is Present");
		   
		  app_logs.debug("To verify Youtube Search Box");
		  WebElement elen= driver.findElement(By.xpath(object.getProperty("ytcenter")));
		  elen.sendKeys("selenium");
		  System.out.println(elen.isDisplayed());
		  Assert.assertTrue(elen.isDisplayed(), "selenium");
		  app_logs.debug("Verified the Youtube Search Box is Present");
		  report.log(LogStatus.INFO, "Verified the Youtube Search Box is Present");
			
		  driver.navigate().back();
		  app_logs.debug("Back to Current google.co.in site");
		  testUtil.appsone();
		  app_logs.debug("call the testUtil and Click on Apps");
			
		  System.out.println("Verified YouTube");     
			
//------------------------For Play------------------------------------------- 
	//For Play title
		  
		app_logs.debug("Click on Play");
		  driver.findElement(By.xpath(object.getProperty("play"))).click();
		  //For play logo
		  app_logs.debug("To verify Play Logo");
		  Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("playL"))).isDisplayed(), "true");
		  app_logs.debug("Verified the Play Logo is Present");
		  report.log(LogStatus.INFO, "Verified the Play Logo is Present");
		  //For play Search
		  app_logs.debug("To verify Play Search");
		  WebElement actualS= driver.findElement(By.name(object.getProperty("playCenter")));
		  actualS.sendKeys("selenium");
		  Assert.assertTrue(actualS.isDisplayed(), "selenium");
		  app_logs.debug("Verified the Play Search is Present");
		  report.log(LogStatus.INFO, "Verified the Play Search is Present");
		  //For Title
		  app_logs.debug("To verify Play title");
		  driver.get(config.getProperty("playsite"));
		  String titlepl = driver.getTitle();
		  System.out.println("Title is: " +titlepl);
		  String expectedpl="Google Play";
		  Assert.assertEquals(titlepl, expectedpl);
		  app_logs.debug("Verified the Play title");
		  report.log(LogStatus.INFO, "Verified the Play title");
		  System.out.println("Verified Play");	
				
		  driver.navigate().back();
		  app_logs.debug("Back to Current google.co.in site");
		  testUtil.appsone();
		  app_logs.debug("call the testUtil and Click on Apps");    
		 
//---------------------For News---------------------------------------------
		  app_logs.debug("Click on News");
		  driver.findElement(By.xpath(object.getProperty("news"))).click();
           //For News logo
		  app_logs.debug("To verify News Logo");
		  Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("newsL"))).isDisplayed(), "true");
		  app_logs.debug("Verified the News Logo is Present");
		  report.log(LogStatus.INFO, "Verified the News Logo is Present");
		  //For News Top Stories
		  Thread.sleep(5000L);
		  app_logs.debug("To verify Top Stories Button");
		  Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("newsSto"))).isDisplayed(), "true");
		  app_logs.debug("Verified Top Stories Button is Present");
		  report.log(LogStatus.INFO, "Verified Top Stories Button is Present");
		  //For Title
		  app_logs.debug("To verify News title");
		  driver.get(config.getProperty("newssite"));
		  String titlens = driver.getTitle();
		  System.out.println("Title is: " +titlens);
		  String expectedns="Google News";
		  Assert.assertEquals(titlens, expectedns);
		  app_logs.debug("Verified the News title");
		  report.log(LogStatus.INFO, "Verified the News title");
		  driver.navigate().back();
		  app_logs.debug("Back to Current google.co.in site");
		  testUtil.appsone();
		  app_logs.debug("call the testUtil and Click on Apps");   
//----------------------------For Gmail---------------------------------------------------------
		 app_logs.debug("Click on Gmail");
		 driver.get(config.getProperty("gmailsite"));
		 app_logs.debug("To verify Gmail title");
		 String titlegm = driver.getTitle();
		 System.out.println("Title is: " +titlegm);
		 String expectedgm="Gmail - Email from Google";
	     Assert.assertEquals(titlegm, expectedgm);
	     app_logs.debug("Verified the Gmail title");
		 report.log(LogStatus.INFO, "Verified the Gmail title");
		    
	     //Gmail Start
		app_logs.debug("To verify Gmail Logo");
		Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("gmailL"))).isDisplayed(), "true");
	    app_logs.debug("Verified the Gmail Logo is Present");
		report.log(LogStatus.INFO, "Verified the Gmail Logo is Present");
		   
		//Gmail SignIn
		app_logs.debug("To verify Gmail SignIn Button");
		Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("gSignIn"))).isDisplayed(), "true");
		app_logs.debug("Verified Gmail SignIn Button is Present");
		report.log(LogStatus.INFO, "Verified Gmail SignIn Button is Present");
		 
		//Gmail Create an account
		app_logs.debug("To verify Gmail Create an account Button");
		Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("gAccount"))).isDisplayed(), "true");
	    app_logs.debug("Verified Gmail Create an account Button is Present");
		report.log(LogStatus.INFO, "Verified Gmail Create an account Button is Present");
		    
		driver.navigate().back();
	    app_logs.debug("Back to Current google.co.in site");
		testUtil.appsone();
		app_logs.debug("call the testUtil and Click on Apps");     
		 
//-------------------------For Drive-----------------------------------------
		//Drive title
		 driver.get(config.getProperty("drivesite"));
		 app_logs.debug("To verify Drive title");
		 String titledr = driver.getTitle();
		 System.out.println("Title is: " +titledr);
		 String expecteddr="Cloud Storage for Work and Home - Google Drive";
		 Assert.assertEquals(titledr, expecteddr);
		 app_logs.debug("Verified the Drive title");
		 report.log(LogStatus.INFO, "Verified the Drive title");
		    
		//Drive Logo
		app_logs.debug("To verify Drive Logo");
		Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("driveL"))).isDisplayed(), "true");
		app_logs.debug("Verified the Drive Logo is Present");
		report.log(LogStatus.INFO, "Verified the Drive Logo is Present");
		
		//Drive Go to drive Button   
		app_logs.debug("To verify Drive Go to drive Button");
		Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("drivego"))).isDisplayed(), "true");
		app_logs.debug("Verified Drive Go to drive Button is Present");
		report.log(LogStatus.INFO, "Verified Drive Go to drive Button is Present");
		
		//Drive Try Drive for your team Button
		 app_logs.debug("To verify Drive Try Drive for your team Button");
		 Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("driveTry"))).isDisplayed(), "true");
		 app_logs.debug("Verified Drive Try Drive for your team Button is Present");
		 report.log(LogStatus.INFO, "Verified Drive Try Drive for your team Button is Present");
		    
		 driver.navigate().back();
	     app_logs.debug("Back to Current google.co.in site");
	     testUtil.appsone();
		 app_logs.debug("call the testUtil and Click on Apps");   
		 
//------------------------For Translate---------------------------------------------
		 app_logs.debug("Click on Translate");
		 driver.findElement(By.xpath(object.getProperty("translate"))).click();
		 driver.get(config.getProperty("transsite"));
		 app_logs.debug("To verify Translate title");
		 String titlet = driver.getTitle();
		 System.out.println("Title is: " +titlet);
		 String expectedt="Google Translate";
		 Assert.assertEquals(titlet, expectedt);
		 app_logs.debug("Verified the Translate title");
		 report.log(LogStatus.INFO, "Verified the Translate title");
		    
	     //Translate Logo
		 app_logs.debug("To verify Translate Logo");
		 Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("TransL"))).isDisplayed(), "true");
	     app_logs.debug("Verified the Translate Logo is Present");
		 report.log(LogStatus.INFO, "Verified the Translate Logo is Present");
		     
		 driver.navigate().back();
		 app_logs.debug("Back to Current google.co.in site");
		 testUtil.appsone();
		 app_logs.debug("call the testUtil and Click on Apps");    
		 
//-------------------------For Photos-------------------------------------
		 app_logs.debug("Click on Photos");
		 driver.findElement(By.xpath(object.getProperty("photos"))).click();
		 driver.get(config.getProperty("photosite"));
		 app_logs.debug("To verify Photos title");
		 String titlep = driver.getTitle();
		 System.out.println("Title is: " +titlep);
		 String expectedp="Google Photos";
	     Assert.assertEquals(titlep, expectedp);
	     app_logs.debug("Verified the Photos title");
		 report.log(LogStatus.INFO, "Verified the Photos title");
		    
		 //Photos Logo
		 app_logs.debug("To verify Photos Logo");
		 Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("photosL"))).isDisplayed(), "true");
		 app_logs.debug("Verified the Photos Logo is Present");
		 report.log(LogStatus.INFO, "Verified the Photos Logo is Present");
		  
		 //Photos Go to Google Photos
		 app_logs.debug("To verify Go to Google Photos Button");
		 Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("photosGo"))).isDisplayed(), "true");
	     app_logs.debug("Verified the Go to Google Photos Button is Present");
		 report.log(LogStatus.INFO, "Verified the Go to Google Photos Button is Present");
		   
		 driver.navigate().back();
		 app_logs.debug("Back to Current google.co.in site");
		 report.log(LogStatus.INFO, "Back to Current google.co.in site");
		 report.log(LogStatus.PASS, "3rd Testcase is Passed");
	}catch(Throwable t){
		System.out.println("3rd Testcase is Failed");
		 app_logs.debug("3rd Testcase is Failed");
		
	    //For ScreenShot and Extent Reports
		report.log(LogStatus.FAIL, "3rd Testcase is Failed");
		String screenshotPath=testUtil.getScreenShot(driver, "testCaseThree");
		report.attachScreenshot(screenshotPath);
		 
	 }
			
			
		System.out.println("3rd TestCase is Completed");
		app_logs.debug("Test is Comlpeted");
		report.log(LogStatus.INFO, "3rd TestCase is Completed");
		
			
	}
	

}
