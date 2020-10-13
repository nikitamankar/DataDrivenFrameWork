package dd_tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import dd_Util.test.testUtil;
import dd_core.testCore;

public class LanguageTest5 extends testCore {
	public static final ExtentReports report=ExtentReports.get(LanguageTest5.class);
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("LanguageTest5")){
			throw new SkipException("Skipping the testcase as runmode is set to No ");
		}
	
	}

	@Test//(priority=5)
	public void testCasefive() throws InterruptedException, IOException{
		System.out.println("5th TestCase is Start");
		 app_logs.debug("5th TestCase is Start");
		
		 try{
	     report.startTest("testCasefive");
		 System.out.println("One");
		 app_logs.debug("Click on Language Hindi"); 
		 report.log(LogStatus.INFO, "Click on Language Hindi");
		driver.findElement(By.xpath(object.getProperty("hindi"))).click();
		app_logs.debug("Verification the Sign In Button");
		Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("SignIn"))).isDisplayed(), "true");
		app_logs.debug("Verification the Sign In Button is Present");
		app_logs.debug("Verification the GoogleSearch Button is Present");
		String actualgoogle=driver.findElement(By.xpath(object.getProperty("googleCheck"))).getAttribute("value");
	    System.out.println(actualgoogle);
	    String expectedgoogle="Google Search";
	    Assert.assertEquals(actualgoogle, expectedgoogle);
	    Thread.sleep(3000);
	    app_logs.debug("Verified the GoogleSearch Button is Present");
	    app_logs.debug("Verification the I'm Feeling Lucky Button is Present");
	    Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("Lucky2"))).isDisplayed(), "true");
	    app_logs.debug("Verified the I'm Feeling Lucky Button is Present");
	    report.log(LogStatus.INFO, "Verified all Button in Hindi Language");
	    
//-----------------------2-------------------------------------------------------------
	   System.out.println("Two");
	   app_logs.debug("Click on Language বাংলা"); 
	   report.log(LogStatus.INFO, "Click on Language বাংলা");
	  driver.findElement(By.xpath(object.getProperty("second"))).click();
	app_logs.debug("Verification the Sign In Button");
    Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("SignIn"))).isDisplayed(), "true");
	app_logs.debug("Verification the Sign In Button is Present");
	app_logs.debug("Verification the GoogleSearch Button is Present");
	String actualgoogle1=driver.findElement(By.xpath(object.getProperty("googleCheck"))).getAttribute("value");
    System.out.println(actualgoogle1);
   String expectedgoogle1="Google Search";
	Assert.assertEquals(actualgoogle1, expectedgoogle1);
    Thread.sleep(3000);
	app_logs.debug("Verified the GoogleSearch Button is Present");
	app_logs.debug("Verification the I'm Feeling Lucky Button is Present");
	Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("Lucky2"))).isDisplayed(), "true");
	app_logs.debug("Verified the I'm Feeling Lucky Button is Present");
	report.log(LogStatus.INFO, "Verified all Button in বাংলা Language");
//--------------------------------------3----------------------------------------------
	System.out.println("Three");
	app_logs.debug("Click on Language తెలుగు"); 
	report.log(LogStatus.INFO, "Click on Language తెలుగు");
	  driver.findElement(By.xpath(object.getProperty("third"))).click();
	app_logs.debug("Verification the Sign In Button");
	Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("SignIn"))).isDisplayed(), "true");
	app_logs.debug("Verification the Sign In Button is Present");
	app_logs.debug("Verification the GoogleSearch Button is Present");
	String actualgoogle2=driver.findElement(By.xpath(object.getProperty("googleCheck"))).getAttribute("value");
   System.out.println(actualgoogle2);
  String expectedgoogle2="Google Search";
	Assert.assertEquals(actualgoogle2, expectedgoogle2);
   Thread.sleep(3000);
	app_logs.debug("Verified the GoogleSearch Button is Present");
	app_logs.debug("Verification the I'm Feeling Lucky Button is Present");
	Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("Lucky2"))).isDisplayed(), "true");
	app_logs.debug("Verified the I'm Feeling Lucky Button is Present");
	report.log(LogStatus.INFO, "Verified all Button in తెలుగు Language");
//------------------------4--------------------------------------------------------
	System.out.println("Four");
	app_logs.debug("Click on Language मराठी"); 
	report.log(LogStatus.INFO, "Click on Language मराठी");
	  driver.findElement(By.xpath(object.getProperty("fourth"))).click();
	app_logs.debug("Verification the Sign In Button");
	Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("SignIn"))).isDisplayed(), "true");
	app_logs.debug("Verification the Sign In Button is Present");
	app_logs.debug("Verification the GoogleSearch Button is Present");
	String actualgoogle3=driver.findElement(By.xpath(object.getProperty("googleCheck"))).getAttribute("value");
 System.out.println(actualgoogle3);
String expectedgoogle3="Google Search";
	Assert.assertEquals(actualgoogle3, expectedgoogle3);
 Thread.sleep(3000);
	app_logs.debug("Verified the GoogleSearch Button is Present");
	app_logs.debug("Verification the I'm Feeling Lucky Button is Present");
	Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("Lucky2"))).isDisplayed(), "true");
	app_logs.debug("Verified the I'm Feeling Lucky Button is Present");
	report.log(LogStatus.INFO, "Verified all Button in मराठी Language");
//------------------------5--------------------------------------------------------
	System.out.println("Five");
	app_logs.debug("Click on Language தமிழ்"); 
	report.log(LogStatus.INFO, "Verified all Button in தமிழ் Language");
	driver.findElement(By.xpath(object.getProperty("five"))).click();
	app_logs.debug("Verification the Sign In Button");
	Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("SignIn"))).isDisplayed(), "true");
	app_logs.debug("Verification the Sign In Button is Present");
	app_logs.debug("Verification the GoogleSearch Button is Present");
	String actualgoogle4=driver.findElement(By.xpath(object.getProperty("googleCheck"))).getAttribute("value");
	System.out.println(actualgoogle4);
	String expectedgoogle4="Google Search";
	Assert.assertEquals(actualgoogle4, expectedgoogle4);
	Thread.sleep(3000);
	app_logs.debug("Verified the GoogleSearch Button is Present");
	app_logs.debug("Verification the I'm Feeling Lucky Button is Present");
	Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("Lucky2"))).isDisplayed(), "true");
	app_logs.debug("Verified the I'm Feeling Lucky Button is Present");
	report.log(LogStatus.INFO, "Verified all Button in தமிழ் Language");
//------------------------6------------------------------------------------------
	System.out.println("Six");
	app_logs.debug("Click on Language ગુજરાતી"); 
	report.log(LogStatus.INFO, "Verified all Button in ગુજરાતી Language");
 driver.findElement(By.xpath(object.getProperty("six"))).click();
app_logs.debug("Verification the Sign In Button");
Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("SignIn"))).isDisplayed(), "true");
app_logs.debug("Verification the Sign In Button is Present");
app_logs.debug("Verification the GoogleSearch Button is Present");
String actualgoogle5=driver.findElement(By.xpath(object.getProperty("googleCheck"))).getAttribute("value");
System.out.println(actualgoogle5);
String expectedgoogle5="Google Search";
Assert.assertEquals(actualgoogle5, expectedgoogle5);
Thread.sleep(3000);
app_logs.debug("Verified the GoogleSearch Button is Present");
app_logs.debug("Verification the I'm Feeling Lucky Button is Present");
Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("Lucky2"))).isDisplayed(), "true");
app_logs.debug("Verified the I'm Feeling Lucky Button is Present");
report.log(LogStatus.INFO, "Verified all Button in ગુજરાતી Language");
//------------------------7------------------------------------------------------
System.out.println("Seven");
app_logs.debug("Click on Language ಕನ್ನಡ");
report.log(LogStatus.INFO, "Verified all Button in ಕನ್ನಡ Language");
driver.findElement(By.xpath(object.getProperty("Seven"))).click();
app_logs.debug("Verification the Sign In Button");
Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("SignIn"))).isDisplayed(), "true");
app_logs.debug("Verification the Sign In Button is Present");
app_logs.debug("Verification the GoogleSearch Button is Present");
String actualgoogle6=driver.findElement(By.xpath(object.getProperty("googleCheck"))).getAttribute("value");
System.out.println(actualgoogle6);
String expectedgoogle6="Google Search";
Assert.assertEquals(actualgoogle6, expectedgoogle6);
Thread.sleep(3000);
app_logs.debug("Verified the GoogleSearch Button is Present");
app_logs.debug("Verification the I'm Feeling Lucky Button is Present");
Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("Lucky2"))).isDisplayed(), "true");
app_logs.debug("Verified the I'm Feeling Lucky Button is Present");
report.log(LogStatus.INFO, "Verified all Button in ಕನ್ನಡ Language");
//------------------------8------------------------------------------------------
System.out.println("Eight");
app_logs.debug("Click on Language മലയാളം");
report.log(LogStatus.INFO, "Verified all Button in മലയാളം Language");
driver.findElement(By.xpath(object.getProperty("eight"))).click();
app_logs.debug("Verification the Sign In Button");
Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("SignIn"))).isDisplayed(), "true");
app_logs.debug("Verification the Sign In Button is Present");
app_logs.debug("Verification the GoogleSearch Button is Present");
String actualgoogle7=driver.findElement(By.xpath(object.getProperty("googleCheck"))).getAttribute("value");
System.out.println(actualgoogle7);
String expectedgoogle7="Google Search";
Assert.assertEquals(actualgoogle7, expectedgoogle7);
Thread.sleep(3000);
app_logs.debug("Verified the GoogleSearch Button is Present");
app_logs.debug("Verification the I'm Feeling Lucky Button is Present");
Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("Lucky2"))).isDisplayed(), "true");
app_logs.debug("Verified the I'm Feeling Lucky Button is Present");
report.log(LogStatus.INFO, "Verified all Button in മലയാളം Language");
//------------------------9------------------------------------------------------
System.out.println("Nine");
app_logs.debug("Click on Language ਪੰਜਾਬੀ"); 
report.log(LogStatus.INFO, "Click on Language ਪੰਜਾਬੀ");
driver.findElement(By.xpath(object.getProperty("nine"))).click();
app_logs.debug("Verification the Sign In Button");
Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("SignIn"))).isDisplayed(), "true");
app_logs.debug("Verification the Sign In Button is Present");
app_logs.debug("Verification the GoogleSearch Button is Present");
String actualgoogle8=driver.findElement(By.xpath(object.getProperty("googleCheck"))).getAttribute("value");
System.out.println(actualgoogle8);
String expectedgoogle8="Google Search";
Assert.assertEquals(actualgoogle8, expectedgoogle8);
Thread.sleep(3000);
app_logs.debug("Verified the GoogleSearch Button is Present");
app_logs.debug("Verification the I'm Feeling Lucky Button is Present");
Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("Lucky2"))).isDisplayed(), "true");
app_logs.debug("Verified the I'm Feeling Lucky Button is Present");
report.log(LogStatus.INFO, "Verified all Button in ਪੰਜਾਬੀ Language");    

app_logs.debug("Click on English");
report.log(LogStatus.INFO, "Click on English");
driver.findElement(By.xpath(object.getProperty("Ten"))).click();

report.log(LogStatus.PASS, "5th Testcase is Passed");
	}catch(Throwable t){
		System.out.println("5th Testcase is Failed");
		 app_logs.debug("5th Testcase is Failed");
		
	    //For ScreenShot and Extent Reports
		report.log(LogStatus.FAIL, "5th Testcase is Failed");
		String screenshotPath=testUtil.getScreenShot(driver, "testCasefive");
		report.attachScreenshot(screenshotPath);
		}
  System.out.println("5th TestCase is Completed");
  app_logs.debug("5th TestCase is Completed");
  report.log(LogStatus.INFO, "5th TestCase is Completed");
	}
}
