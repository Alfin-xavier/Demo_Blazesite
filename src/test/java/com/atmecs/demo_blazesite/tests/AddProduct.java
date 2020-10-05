package com.atmecs.demo_blazesite.tests;

import org.testng.annotations.Test;

import com.atmecs.demo_blazesite.basetest.BaseTest;
import com.atmecs.demo_blazesite.pagehelper.AddProductToCartTest;

public class AddProduct extends BaseTest
{
	@Test
	public void addProduct() throws InterruptedException
	{
		AddProductToCartTest addproduct = new AddProductToCartTest(driver);
		
		addproduct.selectAndAddToCartProduct();
	}
}