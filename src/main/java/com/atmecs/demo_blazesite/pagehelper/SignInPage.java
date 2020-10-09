package com.atmecs.demo_blazesite.pagehelper;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.atmecs.demo_blazesite.constants.Constants;
import com.atmecs.demo_blazesite.helpers.Helpers;
import com.atmecs.demo_blazesite.utilities.Logging;
import com.atmecs.demo_blazesite.utilities.PropertyReader;

public class SignInPage 
{
	public WebDriver driver;

	Helpers helpers;

	Properties locatorsFile;
	
	Properties datas;
	
	Logging log;

	public SignInPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	public void signUpTest(String username, String password) throws InterruptedException, IOException
	 
	{
		helpers = new Helpers(driver);
		
		log = new Logging();

		locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);

		helpers.clickOperation(locatorsFile.getProperty("signin"));
		
		log.debug("Clicking on Signin linktext");

		driver.findElement(By.xpath(locatorsFile.getProperty("signinusername"))).sendKeys(username);
		
		log.info("Providing Username");

		driver.findElement(By.xpath(locatorsFile.getProperty("signinpassword"))).sendKeys(password);
		
		log.info("Providing Username");

		helpers.clickOperation(locatorsFile.getProperty("button1"));
		
		log.debug("Clicking on the Signin button");

		helpers.WaitAndSwitchToAlert();
		
		log.info("Switching to alert window");
			 
	  }
	  
}