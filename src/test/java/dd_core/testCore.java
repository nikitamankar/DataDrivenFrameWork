package dd_core;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;


import dd_Util.test.ExcelReader;
import dd_Util.test.TestConfig;
import dd_Util.test.monitoringMail;
import dd_Util.test.testUtil;


public class testCore {
	public static Properties config = new Properties();
	public static Properties object = new Properties();
	public static ExcelReader excel = null;
    public static WebDriver driver=null;
    public static FileInputStream fis;
    public static Logger app_logs=Logger.getLogger("devpinoyLogger");
   
    
     
    
    @BeforeSuite
    public void init() throws IOException {
    	if(driver==null){
    		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\dd_properties\\config.properties");
    		config.load(fis);
    		app_logs.debug("Load the Config Properties file");
    		
    		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\dd_properties\\object.properties");
    		object.load(fis);
    		app_logs.debug("Load the Object Properties file");
    		
    excel=new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\java\\dd_properties\\dataAss-1.xlsx");
       	 app_logs.debug("Loading Excel  file");
    		
       	 if(config.get("browser").equals("chrome"))
    		{
    			app_logs.debug("Chrome Browser Launching");
    			System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\xcx\\chromedriver_win32\\chromedriver.exe");
    			 //driver=new ChromeDriver();
    			 ChromeOptions options = new ChromeOptions(); 
    	       		options.addArguments("--disable-notifications");
    	           	options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
    	       
    	           	Map<String, Object> prefs = new HashMap<String, Object>();
    	           	prefs.put("credentials_enable_service", false);
    	           	prefs.put("profile.password_manager_enabled", false);

    	           	options.setExperimentalOption("prefs", prefs);
    	           	 driver = new ChromeDriver(options); 
    	           	 
    	     
    		}else if(config.getProperty("browser").equals("firefox"))
       	 {
    			app_logs.debug("FireFox Browser Launching");
       		 System.setProperty("webdriver.gecko.driver","C:\\SeleniumDrivers\\geckodriver-v0.26.0-win32\\geckodriver.exe");
    		 driver=new FirefoxDriver();
    		 
       	} else if(config.getProperty("browser").equals("ie"))
       	{
       		app_logs.debug("IE Browser Launching");
       	     System.setProperty("webdriver.ie.driver","C:\\SeleniumDrivers\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
       	      driver=new InternetExplorerDriver();
       	}
    		
    		driver.manage().timeouts().implicitlyWait(180L, TimeUnit.SECONDS);
    		driver.manage().timeouts().pageLoadTimeout(80L, TimeUnit.SECONDS);
    		driver.get(config.getProperty("testsite"));
    		app_logs.debug("Launch the Google.co.in site");
       	
   		driver.manage().window().maximize();
       }
    	
    } 	
  @AfterSuite
   public void QuitDriver() throws Exception{
    app_logs.debug("driver is Closed");
    			
    if(driver!=null)
    		testUtil.zip(System.getProperty("user.dir")+"\\screenshot");
           // testUtil.Screenword(System.getProperty("user.dir")+"\\screenshot");
    

	monitoringMail mail=new monitoringMail();
	try{
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
	} catch(AddressException e){
		e.printStackTrace();
		
	} catch (MessagingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	app_logs.debug("Mail Sent");
    
    driver.close();
    	   
    	}
    	
    
}
