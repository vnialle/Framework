package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;

public class LoginTestHRM extends BaseClass {  

	@Test(priority = 1)
	public void loginToApp()
	{
		logger=report.createTest("Login to HRM");
		
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Starting Application");
		
		loginpage.loginToHRM(excel.getStringData("Login", 0, 0), excel.getStringData(0, 0, 1));
		
		logger.pass("Login success");
	}
//	@Test(priority = 2)
//	public void loginToApp1()
//	{
//		logger=report.createTest("Logout");
//				
//		logger.fail("Logout failed");
//	}
}
