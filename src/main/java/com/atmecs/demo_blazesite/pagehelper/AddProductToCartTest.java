package com.atmecs.demo_blazesite.pagehelper;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.demo_blazesite.constants.Constants;
import com.atmecs.demo_blazesite.helpers.Helpers;
import com.atmecs.demo_blazesite.utilities.Logging;
import com.atmecs.demo_blazesite.utilities.PropertyReader;

public class AddProductToCartTest
{
	public WebDriver driver;

	Helpers helpers;

	Properties locatorsFile;
	
	Logging log;
	
	public AddProductToCartTest(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void selectAndAddToCartProduct() throws InterruptedException 
	{ 
		helpers = new Helpers(driver);

		log = new Logging();
		
		locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);

		helpers.clickOperation(locatorsFile.getProperty("selectProduct1"));
		
		log.info("Selecting the Product");

		helpers.clickOperation(locatorsFile.getProperty("addProduct1"));
		
		log.info("Adding Product to Cart");

		helpers.WaitAndSwitchToAlert();
		
		log.debug("Switching to alert window");

		helpers.clickOperation(locatorsFile.getProperty("clickCart"));
		
		log.info("Clicking Cart linktext to view products");
		 
	}
	
}