package com.atmecs.demo_blazesite.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.atmecs.demo_blazesite.basetest.BaseTest;
import com.atmecs.demo_blazesite.constants.Constants;
import com.atmecs.demo_blazesite.pagehelper.ContactUsTest;
import com.atmecs.demo_blazesite.utilities.ReadDataFromExcel;

public class ContactUs extends BaseTest
{
	@DataProvider
	public Object[][] readData()
	{
		Object[][] data = ReadDataFromExcel.readExcelData(Constants.CONTACTUS_DATA,"ContactUS");
		
		return data;
		
	}
	
	@Test(dataProvider = "readData")
	public void contactUs(String mail, String name, String message) throws InterruptedException, IOException
	{
		ContactUsTest contactus = new ContactUsTest(driver);

		contactus.contactUsScript(mail, name, message);
	}
}