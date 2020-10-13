package dd_tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import dd_Util.test.testUtil;
import dd_core.testCore;

public class openCloseTest06 extends testCore{
	public static final ExtentReports report=ExtentReports.get(openCloseTest06.class);
	@BeforeTest
	public void isSkip(){
		if(!testUtil.isExecutable("openCloseTest06")){
			throw new SkipException("Skipping the testcase as runmode is set to No");
			}
		
		
	}
	
@Test//(priority=6)
	public void testCaseSix() throws InterruptedException{
		 report.startTest("testCaseSix");
		 System.out.println("Chrome Browser Launching");
		 app_logs.debug("Chrome Browser Launching"); 
		 report.log(LogStatus.INFO, "Chrome Browser Launching");
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\xcx\\chromedriver_win32\\chromedriver.exe");
		//driver=new ChromeDriver();
		ChromeOptions options = new ChromeOptions(); 
       	options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
        driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		 app_logs.debug("Launch the FaceBook Site"); 
		 report.log(LogStatus.INFO, "Launch the FaceBook Site");
		Thread.sleep(7000L);
		
		driver.close();
		app_logs.debug("Close the Browser"); 
		report.log(LogStatus.INFO, "Close the Browser");
		System.out.println("6th TestCase Completed");
}

}
 