package com.learnautomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	// Screenshot, Alert, Frames, windows, Sunc issues, javascript executer
	
	public static String captureScreenshot(WebDriver driver)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotPath=System.getProperty("user.dir") + "/Screenshots/OrangeHRM_"+getCurrentDateTime()+".png";
		
		try {
			FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "/Screenshots/OrangeHRM_"+getCurrentDateTime()+".png"));
			System.out.println("Screenshot captured.");
		} catch (IOException e) {

			System.out.println("Unable to capture screenshot: "+e.getMessage()); 
			
		}
		return screenshotPath;
	}
	
	public static String getCurrentDateTime()
	{
		DateFormat customFormat=new SimpleDateFormat("MM-dd-yyyy-HH-mm-ss");
		Date currentDate=new Date();
		return customFormat.format(currentDate);
	}
}
