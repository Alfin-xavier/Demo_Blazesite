package com.atmecs.demo_blazesite.tests;

import java.io.IOException;
import org.testng.annotations.Test;
import com.atmecs.demo_blazesite.basetest.BaseTest;
import com.atmecs.demo_blazesite.pagehelper.LogInPage;
import com.atmecs.demo_blazesite.utilities.DataProviderClass;

public class LoginTest extends BaseTest
{

	@Test(dataProvider  = "login",dataProviderClass= DataProviderClass.class )
	public void logIn(String username, String password) 
	{
		LogInPage login = new LogInPage(driver);
		
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