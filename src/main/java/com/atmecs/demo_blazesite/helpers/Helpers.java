package com.atmecs.demo_blazesite.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers
{
	public WebDriver driver;
	
	public Helpers(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void WaitAndSwitchToAlert()
	{
		Wait<WebDriver> wait = new WebDriverWait(driver, 5);

		wait.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();
	}
	
	public void clickOperation(String xpath)
	{
		 driver.findElement(By.xpath(xpath)).click();
	}
	
	public void textbox(String xpath, String value)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	
	public void switchToAlert()
	{
		driver.switchTo().alert().accept();
	}
	
	
}
