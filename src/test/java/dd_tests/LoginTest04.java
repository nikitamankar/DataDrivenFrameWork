package dd_tests;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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

public class LoginTest04 extends testCore {
	public static final ExtentReports report=ExtentReports.get(LoginTest04.class);
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("LoginTest04")){
			throw new SkipException("Skipping the testcase as runmode is set to No ");
		}
	
	}

	@Test(dataProvider="getData")//priority=4)
	public void testCasefour(String emailID, String password) throws InterruptedException, IOException{
	System.out.println("4th TestCase is Start");
	 app_logs.debug("4th TestCase is Start");

   try{
        report.startTest("testCasefour");
        app_logs.debug("Click on SignIn Button");
		report.log(LogStatus.INFO, "Click on SignIn Button");
		//Explicit Wait
        WebDriverWait wait=new WebDriverWait(driver, 10L);//Maximum waiting time is 10 Seconds
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(object.getProperty("Sign")))).click();
	    
	   // driver.findElement(By.xpath(object.getProperty("Sign"))).click();
	   //Login For Account
	    driver.findElement(By.xpath(object.getProperty("email1"))).sendKeys(emailID);
	    app_logs.debug("Type the Email ID");
	    report.log(LogStatus.INFO, "Type the Email ID");
		driver.findElement(By.xpath(object.getProperty("next"))).click();
		app_logs.debug("Click on Next Button");
		report.log(LogStatus.INFO, "Click on Next Button");
		driver.findElement(By.name(object.getProperty("pass"))).sendKeys(password);
		app_logs.debug("Type the Password");
		report.log(LogStatus.INFO, "Type the Password");
		Thread.sleep(5000L);
		driver.findElement(By.xpath(object.getProperty("next"))).click();
		app_logs.debug("Click on Next Button");
		report.log(LogStatus.INFO, "Click on Next Button");
		
		Thread.sleep(5000L);
	
	/*	app_logs.debug("Click on English");
		System.out.println("Click on English");
		report.log(LogStatus.INFO, "Click on English");
		driver.findElement(By.xpath(object.getProperty("Ten"))).click();   */
		
	
		testUtil.appsone();
		app_logs.debug("call the testUtil and Click on App");
	
//---------------------For Account---------------------------------------

System.out.println("Verification for Login Account");
app_logs.debug("Click on Account");
driver.findElement(By.xpath(object.getProperty("Account"))).click();
app_logs.debug("Verification for Login Account");
String actualUrlIn=config.getProperty("accountsite");
 String expectedUrlIn= driver.getCurrentUrl();
 System.out.println(expectedUrlIn);
 Assert.assertNotEquals(actualUrlIn, expectedUrlIn);
 System.out.println("Verified Login Account");
app_logs.debug("Verified Login Account");
report.log(LogStatus.INFO, "Verified Login Account");

driver.navigate().back();
app_logs.debug("Back to Current google.co.in site");
testUtil.appsone();
app_logs.debug("call the testUtil and Click on Apps");

//----------------For Google Search-----------------------------------------
System.out.println("Verification for Login in Google Search");
app_logs.debug("Click on Search");
driver.findElement(By.xpath(object.getProperty("search"))).click();
app_logs.debug("Verification for Login in Google Search");
String actualUrlS=config.getProperty("testsite");
String expectedUrlS= driver.getCurrentUrl();
System.out.println(expectedUrlS);
Assert.assertNotEquals(actualUrlS, expectedUrlS);
System.out.println("Verified Login in Google Search");
app_logs.debug("Verified Login in Google Search");
report.log(LogStatus.INFO, "Verified Login in Google Search");

testUtil.appsone();
app_logs.debug("call the testUtil and Click on Apps");
			 		
//------------------For Google Map-------------------------------
app_logs.debug("Click on Map");
System.out.println("Verification for Login in Map");
driver.findElement(By.xpath(object.getProperty("map"))).click();
String actualUrlM=config.getProperty("mapsite");
String expectedUrlM= driver.getCurrentUrl();
System.out.println(expectedUrlM);
Assert.assertNotEquals(actualUrlM, expectedUrlM);
System.out.println("Verified Login in Map");
app_logs.debug("Verified Login in Map");
report.log(LogStatus.INFO, "Verified Login in Map");

driver.navigate().back();
app_logs.debug("Back to Current google.co.in site");
testUtil.appsone();
app_logs.debug("call the testUtil and Click on Apps");
					 		
//-----------------For Google YouTube-----------------------------------
System.out.println("Verification for Login in YouTube");
 app_logs.debug("Click on YouTube");
driver.findElement(By.xpath(object.getProperty("youtube"))).click();
app_logs.debug("Verification for Login in YouTube");
Assert.assertTrue(driver.findElement(By.id("img")).isDisplayed(), "true"); 
System.out.println("Verified Login in YouTube");
app_logs.debug("Verified Login in YouTube");
report.log(LogStatus.INFO, "Verified Login in YouTube");

driver.navigate().back();
app_logs.debug("Back to Current google.co.in site");
testUtil.appsone();
app_logs.debug("call the testUtil and Click on Apps");
							 		
//----------------For Google Play-------------------------------------
System.out.println("Verification for Login in Google Play");
app_logs.debug("Click on Google Play");
driver.findElement(By.xpath(object.getProperty("play"))).click();
 app_logs.debug("Verification for Login in Google Play");
 Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("InIn"))).isDisplayed(), "true");
System.out.println("Verified Login in Google Play");
app_logs.debug("Verified Login in Google Play");
report.log(LogStatus.INFO, "Verified Login in Google Play");

driver.navigate().back();
app_logs.debug("Back to Current google.co.in site");
testUtil.appsone();
app_logs.debug("call the testUtil and Click on Apps");
									 
//---------------For Google News------------------------------------
System.out.println("Verification for Login in Google News");
 app_logs.debug("Click on Google News");
 driver.findElement(By.xpath(object.getProperty("news"))).click();
 app_logs.debug("Verification for Login in Google News");
 Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("InIn"))).isDisplayed(), "true"); 
 System.out.println("Verified Login in Google News");
 app_logs.debug("Verified Login in Google News");
 report.log(LogStatus.INFO, "Verified Login in Google News");

 driver.navigate().back();
app_logs.debug("Back to Current google.co.in site");
testUtil.appsone();
app_logs.debug("call the testUtil and Click on Apps");
											 		
 //----------------For Google Gmail----------------------------------
 System.out.println("Verification for Login in Google Gmail");
  app_logs.debug("Click on Google Gmail");
 driver.findElement(By.xpath(object.getProperty("gmail"))).click();
 app_logs.debug("Verification for Login in Google Gmail");
  String actualUrlG=config.getProperty("gmailsite");
 String expectedUrlG= driver.getCurrentUrl();
  System.out.println(expectedUrlG);
  Assert.assertNotEquals(actualUrlG, expectedUrlG); 
  System.out.println("Verified Login in Google Gmail");
  app_logs.debug("Verified Login in Google Gmail");
  report.log(LogStatus.INFO, "Verified Login in Google Gmail");
 
  driver.navigate().back();
  app_logs.debug("Back to Current google.co.in site");
  testUtil.appsone();
  app_logs.debug("call the testUtil and Click on Apps");
													 		
 //---------------------For Google Drive---------------------------------
  System.out.println("Verification for Login in Google Drive");
  app_logs.debug("Click on Google Drive");
  driver.findElement(By.xpath(object.getProperty("drive"))).click();
  app_logs.debug("Verification for Login in Google Drive");
  String actualUrlD=config.getProperty("drivesite");
  String expectedUrlD= driver.getCurrentUrl();
  System.out.println(expectedUrlD);
  Assert.assertNotEquals(actualUrlD, expectedUrlD);  
   System.out.println("Verified Login in Google Drive");
   app_logs.debug("Verified Login in Google Drive");
   report.log(LogStatus.INFO, "Verified Login in Google Drive");
  
   driver.navigate().back();
   app_logs.debug("Back to Current google.co.in site");
   testUtil.appsone();
   app_logs.debug("call the testUtil and Click on Apps");
															 	
//--------------------For Google Translate--------------------------------
   System.out.println("Verification for Login in Google Translate");
   app_logs.debug("Click on Google Translate");
   driver.findElement(By.xpath(object.getProperty("translate"))).click();
   app_logs.debug("Verification for Login in Google Translate");
   Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("InIn"))).isDisplayed(), "true"); 
	System.out.println("Verified Login in Google Translate");
	app_logs.debug("Verified Login in Google Translate");
	report.log(LogStatus.INFO, "Verified Login in Google Translate");
   
	driver.navigate().back();
    app_logs.debug("Back to Current google.co.in site");
	testUtil.appsone();
	app_logs.debug("call the testUtil and Click on Apps");  
																	 		
//-----------------For Google Photos----------------------------------------
	System.out.println("Verification for Login in Google Photos");
	app_logs.debug("Click on Google Photos");
	driver.findElement(By.xpath(object.getProperty("photos"))).click();
	app_logs.debug("Verification for Login in Google Photos");
	String actualUrlPh=config.getProperty("photosite");
	String expectedUrlPh= driver.getCurrentUrl();
	System.out.println(expectedUrlPh);
	Assert.assertNotEquals(actualUrlPh, expectedUrlPh);
    System.out.println("Verified Login in Google Photos");
	app_logs.debug("Verified Login in Google Photos");
	report.log(LogStatus.INFO, "Verified Login in Google Photos");
	
	driver.navigate().back();
	app_logs.debug("Back to Current google.co.in site");
	
//---------------------For SignOut---------------------------------
	app_logs.debug("Click on Login Key");																		 		
	driver.findElement(By.xpath(object.getProperty("AccountIn"))).click();	
	app_logs.debug("Click on SignOut ");
	report.log(LogStatus.INFO, "Click on SignOut");
	System.out.println("Click on SignOut");
	driver.findElement(By.xpath(object.getProperty("AccountOut"))).click();
	
	report.log(LogStatus.PASS, "4th Testcase is Passed");
	}catch(Throwable t){
		System.out.println("4th Testcase is Failed");
		 app_logs.debug("4th Testcase is Failed");
		
	    //For ScreenShot and Extent Reports
		report.log(LogStatus.FAIL, "4th Testcase is Failed");
		String screenshotPath=testUtil.getScreenShot(driver, "testCaseOne");
		report.attachScreenshot(screenshotPath);
		 
	 }
   System.out.println("4th TestCase is Completed");
	app_logs.debug("4th TestCase is Completed");
	report.log(LogStatus.INFO, "4th TestCase is Completed");	

	}
	@DataProvider
	public static Object[][] getData(){
		
		return testUtil.getData("LoginTest04");
	}
	

}
