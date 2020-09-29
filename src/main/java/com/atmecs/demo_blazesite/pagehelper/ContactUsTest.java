package com.atmecs.demo_blazesite.pagehelper;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.atmecs.demo_blazesite.constants.Constants;
import com.atmecs.demo_blazesite.helpers.Helpers;
import com.atmecs.demo_blazesite.utilities.PropertyReader;

public class ContactUsTest
{
	public WebDriver driver;

	Helpers helpers;

	Properties locatorsFile;
	
	Properties datas;

	public ContactUsTest(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void contactUsScript(String mail, String name, String message) throws InterruptedException, IOException 
	{
		helpers = new Helpers(driver);

		locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);

		datas = PropertyReader.readProperties(Constants.DATAS);
		
		helpers.clickOperation(locatorsFile.getProperty("contactUs"));
		
		driver.findElement(By.xpath(locatorsFile.getProperty("recipientMail"))).sendKeys(mail);
		
		driver.findElement(By.xpath(locatorsFile.getProperty("recipientName"))).sendKeys(name);
		
		driver.findElement(By.xpath(locatorsFile.getProperty("message"))).sendKeys(message);
		
		helpers.clickOperation(locatorsFile.getProperty("button3"));
		 
		helpers.switchToAlert();
		 
		
	}
	
}
