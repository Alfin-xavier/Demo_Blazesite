package com.atmecs.demo_blazesite.tests;

import java.io.IOException;
import org.testng.annotations.Test;
import com.atmecs.demo_blazesite.basetest.BaseTest;
import com.atmecs.demo_blazesite.pagehelper.ContactUsPage;
import com.atmecs.demo_blazesite.utilities.DataProviderClass;

public class ContactUsTest extends BaseTest
{
	
	@Test(dataProvider = "contact_us",dataProviderClass= DataProviderClass.class)
	public void contactUs(String mail, String name, String message)
	{
		ContactUsPage contactus = new ContactUsPage(driver);

		try 
		{
			contactus.contactUsScript(mail, name, message);
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