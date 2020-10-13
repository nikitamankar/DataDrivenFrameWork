package dd_Util.test;




import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;


import dd_core.testCore;







public class testUtil extends testCore  {

	public static String mailscreenshotpath;
public static ExcelReader excel=new ExcelReader(System.getProperty("user.dir")+("\\src\\test\\java\\dd_properties\\dataAss-1.xlsx"));
    
    public static boolean isExecutable(String tcid){
		
		String sheetName="testSuite";
		int rows=excel.getRowCount(sheetName);
		System.out.println(rows);
		for(int rownum=2;rownum<=rows;rownum++)
		{
			if(excel.getCellData(sheetName, "tcid", rownum).equals(tcid)){
				if(excel.getCellData(sheetName, "runmode", rownum).equals("Y")){
					return true;
				}else{
					return false;
					}
			}
		}
		return false;
	}
    @DataProvider
	public static Object[][] getData(String sheetName){
		//String sheetName="LoginTest";
		int rows=excel.getRowCount(sheetName);
		int cols=excel.getColumnCount(sheetName);
		System.out.println("rows=  "+ rows + "    cols   "+cols);
	
	 Object[][] data=new Object[rows-1][cols];
	 for(int rowNum=2;rowNum<=rows;rowNum++)
	 {
		 for(int colNum=0;colNum<cols;colNum++)
		 {
			 data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
		 }
	 }
	 
	 return data;
	}

	
    
	//public static WebDriver driver;
	
	public static void appsone() throws InterruptedException{
		WebElement sub=driver.findElement(By.xpath(object.getProperty("Apps")));
		Actions action=new Actions(driver);
		action.moveToElement(sub).build().perform();
		Thread.sleep(2000L);
		sub.click();
	     app_logs.debug("Click on Google Apps");
	     
	   
	   app_logs.debug("Switch to Frames");
	   System.out.println(driver.findElements(By.tagName("iframe")).size());
	   driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		
	}
	
/*
	
	//ScreenShot For Extent Report
	public static String getScreenShot(WebDriver driver,String screenshotName) throws IOException{
		String dateName = new SimpleDateFormat("yyyyMMddmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destination =System.getProperty("user.dir")+"\\screenshotExtent\\"+screenshotName+".jpeg"; 
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		
	
		return destination;
		
	}   */
	
//ScreenShot For Extent Report
  public static String getScreenShot(WebDriver driver,String screenshotName) throws IOException{
	  Calendar cal = new GregorianCalendar();
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int sec = cal.get(Calendar.SECOND);
		int min = cal.get(Calendar.MINUTE);
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.HOUR_OF_DAY);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destination =System.getProperty("user.dir")+"\\screenshot\\"+screenshotName+"_"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec+".jpeg"; 
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		
	
		return destination;
  }
	/*
//For Word File
	public static void Screenword(String methodName) throws Exception{
		 try {

	            XWPFDocument docx = new XWPFDocument();
	           FileOutputStream out = new FileOutputStream(new File(System.getProperty("user.dir")+"\\doc1.docx"));
	          XWPFParagraph paragraph= docx.createParagraph();
	          XWPFRun run=paragraph.createRun();
	          run.setText("This is Apache POI Word Document");
	            docx.write(out);
	            out.close();
	            

	        } catch (Exception e) {
	            System.out.println(e);
	        }
	        System.out.println("document created");
	    }
    
	
 public static void captureScreenShot(XWPFDocument docx, XWPFRun run, FileOutputStream out) throws Exception {

	        String screenshot_name = System.currentTimeMillis() + ".jpeg";
	        BufferedImage image = new Robot()
	                .createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	        File file = new File("d:\\xyz\\" + screenshot_name);
	        ImageIO.write(image, "jpeg", file);
	        InputStream pic = new FileInputStream("d:\\xyz\\" + screenshot_name);
	        run.addBreak();
	        run.addPicture(pic, XWPFDocument.PICTURE_TYPE_JPEG, screenshot_name, Units.toEMU(350), Units.toEMU(350));
	        pic.close();
	        file.delete();
	    }  
	    */

  /*  try {
    	
    	mailscreenshotpath = methodName+"_"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec+".jpeg";
    	
    	FileUtils.copyFile(scrFile, new File("C:\\11_Jan_2020Batch\\TestNG_ListenersOnFailure\\Screenshot "+mailscreenshotpath));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	}

	*/
//	
//	// make zip of reports
		public static void zip(String filepath){
		 	try
		 	{
		 		File inFolder=new File(filepath);
		 		File outFolder=new File("Reports.zip");
		 		ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(outFolder)));
		 		BufferedInputStream in = null;
		 		byte[] data  = new byte[1000];
		 		String files[] = inFolder.list();
		 		for (int i=0; i<files.length; i++)
		 		{
		 			in = new BufferedInputStream(new FileInputStream
		 			(inFolder.getPath() + "/" + files[i]), 1000);  
		 			out.putNextEntry(new ZipEntry(files[i])); 
		 			int count;
		 			while((count = in.read(data,0,1000)) != -1)
		 			{
		 				out.write(data, 0, count);
		 			}
		 			out.closeEntry();
	  }
	  out.flush();
	  out.close();
		 	
	}
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  } 
	 }	
	



} 

