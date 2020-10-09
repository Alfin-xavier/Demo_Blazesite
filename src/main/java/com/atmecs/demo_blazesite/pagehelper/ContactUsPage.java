package com.atmecs.demo_blazesite.pagehelper;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.atmecs.demo_blazesite.constants.Constants;
import com.atmecs.demo_blazesite.helpers.Helpers;
import com.atmecs.demo_blazesite.utilities.Logging;
import com.atmecs.demo_blazesite.utilities.PropertyReader;
import com.atmecs.demo_blazesite.utilities.ReadDataFromExcel;

public class ContactUsPage
{
	public WebDriver driver;

	Helpers helpers;

	Properties locatorsFile;
	
	//Object[][] datas;
	
	Logging log;

	public ContactUsPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void contactUsScript(String mail, String name, String message) throws InterruptedException, IOException 
	{
		helpers = new Helpers(driver);
		
		log = new Logging();

		locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);
		
		//datas = ReadDataFromExcel.readExcelData(Constants.CONTACTUS_DATA, "ContactUS");

		helpers.clickOperation(locatorsFile.getProperty("contactUs"));
		
		log.debug("Clicking contactUs linktext");
		
		driver.findElement(By.xpath(locatorsFile.getProperty("recipientMail"))).sendKeys(mail);
		
		log.info("Providing Mail_Id");
		
		driver.findElement(By.xpath(locatorsFile.getProperty("recipientName"))).sendKeys(name);
		
		log.info("Providing Username");
		
		driver.findElement(By.xpath(locatorsFile.getProperty("message"))).sendKeys(message);
		
		log.info("Providing Message");
		
		helpers.clickOperation(locatorsFile.getProperty("button3"));
		
		log.debug("Clicking on the button");
		 
		helpers.switchToAlert();
		
		log.info("Switching to alert window");
		 
		
	}
	
}