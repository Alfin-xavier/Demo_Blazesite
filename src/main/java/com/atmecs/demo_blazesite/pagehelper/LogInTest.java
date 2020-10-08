package com.atmecs.demo_blazesite.pagehelper;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.atmecs.demo_blazesite.constants.Constants;
import com.atmecs.demo_blazesite.helpers.Helpers;
import com.atmecs.demo_blazesite.utilities.Logging;
import com.atmecs.demo_blazesite.utilities.PropertyReader;

public class LogInTest 
{
	public WebDriver driver;

	Helpers helpers;

	Properties locatorsFile;
	
	Properties datas;
	
	Logging log;

	public LogInTest(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void logInTest(String username, String password) throws InterruptedException, IOException 

	{
		helpers = new Helpers(driver);
		
		log = new Logging();

		locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);

		helpers.clickOperation(locatorsFile.getProperty("login"));
		
		log.debug("Clicking on login linktext");

		driver.findElement(By.xpath(locatorsFile.getProperty("lusername"))).sendKeys(username);
		
		log.info("Providing Username");

		driver.findElement(By.xpath(locatorsFile.getProperty("lpassword"))).sendKeys(password);
		
		log.info("Providing Password");

		helpers.clickOperation(locatorsFile.getProperty("button2"));
		
		log.debug("Clicking on login button");

	}
}