package com.atmecs.demo_blazesite.tests;

import java.io.IOException;
import org.testng.annotations.Test;
import com.atmecs.demo_blazesite.basetest.BaseTest;
import com.atmecs.demo_blazesite.pagehelper.SignInPage;
import com.atmecs.demo_blazesite.utilities.DataProviderClass;

public class SignInTest extends BaseTest
{
	
	@Test(dataProvider  = "login",dataProviderClass= DataProviderClass.class )
	public void signIn(String username, String password) throws InterruptedException, IOException
	{
		SignInPage signin = new SignInPage(driver);
		
		signin.signUpTest(username, password);
	}
}