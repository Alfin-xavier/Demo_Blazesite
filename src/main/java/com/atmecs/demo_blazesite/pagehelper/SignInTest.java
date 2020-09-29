package com.atmecs.demo_blazesite.pagehelper;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.atmecs.demo_blazesite.constants.Constants;
import com.atmecs.demo_blazesite.helpers.Helpers;
import com.atmecs.demo_blazesite.utilities.PropertyReader;

public class SignInTest 
{
	public WebDriver driver;

	Helpers helpers;

	Properties locatorsFile;
	
	Properties datas;

	public SignInTest(WebDriver driver) 
	{
		this.driver = driver;
	}
	public void signUpTest(String username, String password) throws InterruptedException, IOException
	 
	{
		helpers = new Helpers(driver);

		locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);

		datas = PropertyReader.readProperties(Constants.DATAS);

		helpers.clickOperation(locatorsFile.getProperty("signin"));

		driver.findElement(By.xpath(locatorsFile.getProperty("signinusername"))).sendKeys(username);

		driver.findElement(By.xpath(locatorsFile.getProperty("signinpassword"))).sendKeys(password);

		helpers.clickOperation(locatorsFile.getProperty("button1"));

		helpers.WaitAndSwitchToAlert();
			 
	  }
	  
}
