package com.atmecs.demo_blazesite.utilities;

import org.testng.annotations.DataProvider;
import com.atmecs.demo_blazesite.constants.Constants;

public class DataProviderClass 
{
	@DataProvider(name = "contact_us")
	public Object[][] readContactData()
	{
		Object[][] data = ReadDataFromExcel.readExcelData(Constants.CONTACTUS_DATA,"ContactUS");
		
		return data;
		
	}
	
	@DataProvider(name = "login")
	public Object[][] readLoginData()
	{
		Object[][] data = ReadDataFromExcel.readExcelData(Constants.LOGIN_DATA,"Login");
		
		return data;
		
	}

}
