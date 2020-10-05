package com.atmecs.demo_blazesite.tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.demo_blazesite.basetest.BaseTest;
import com.atmecs.demo_blazesite.constants.Constants;
import com.atmecs.demo_blazesite.pagehelper.LogInTest;
import com.atmecs.demo_blazesite.utilities.ReadDataFromExcel;

public class Login extends BaseTest
{
	@DataProvider
	public Object[][] readData()
	{
		Object[][] data = ReadDataFromExcel.readExcelData(Constants.LOGIN_DATA,"Login");
		
		return data;
	}
	
	public static Logger log = LogManager.getLogger(Login.class.getName());
	@Test(dataProvider = "readData")
	public void logIn(String username, String password) 
	{
		LogInTest login = new LogInTest(driver);
		log.fatal("You need to cond\figure log4j");
		log.error(password);
		try 
		{
			login.logInTest(username, password);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}