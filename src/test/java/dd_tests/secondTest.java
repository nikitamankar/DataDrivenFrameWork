package dd_tests;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import dd_Util.test.testUtil;


public class secondTest {
	//public static final ExtentReports report=ExtentReports.get(appsTest02.class);
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("secondTest")){
			throw new SkipException("Skipping the testcase as runmode is set to No ");
		
		}
	
	}
	
	@Test
	public void twoTest(){
		System.out.println("Executed");
	}
	
}
