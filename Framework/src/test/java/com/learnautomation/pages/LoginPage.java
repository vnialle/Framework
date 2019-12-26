package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	@FindBy(id="txtUsername") WebElement username;
	
	@FindBy(name="txtPassword") WebElement password;
	
	@FindBy(xpath="//input[@id='btnLogin']") WebElement login;
	
	public void loginToHRM(String usernameApp,String passwordApp) 
	{
		username.sendKeys(usernameApp);
		password.sendKeys(passwordApp);
		login.click();
		
	}
	
	
}
