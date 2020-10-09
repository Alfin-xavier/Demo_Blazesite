package com.atmecs.demo_blazesite.tests;

import org.testng.annotations.Test;

import com.atmecs.demo_blazesite.basetest.BaseTest;
import com.atmecs.demo_blazesite.pagehelper.AddProductToCartPage;

public class AddProductTest extends BaseTest
{
	@Test
	public void addProduct() throws InterruptedException
	{
		AddProductToCartPage addproduct = new AddProductToCartPage(driver);
		
		addproduct.selectAndAddToCartProduct();
	}
}