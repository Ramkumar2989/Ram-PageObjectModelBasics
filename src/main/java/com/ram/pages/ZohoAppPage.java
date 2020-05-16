package com.ram.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ram.base.Page;
import com.ram.pages.CRM.CRMHomePage;

public class ZohoAppPage extends Page {
	
		

	public void goToChat()
	{
		
		
		driver.findElement(By.xpath("//*[@id='zl-myapps']//div[text()='Cliq']")).click();
	}

	public CRMHomePage goToCRM() 
	
	{
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//*[@id='zl-myapps']//div[text()='CRM']")).click();
		click("CRMlink_XPATH");
		return new CRMHomePage ();
		
		//WebElement crm=driver.findElement(By.xpath("//*[@id='zl-myapps']/div[1]/div[6]/div/a/div"));
		//JavascriptExecutor js =  (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", crm);
	}
	
	public void goToCampaigns()
	{
		driver.findElement(By.xpath("//*[@id='zl-myapps']//div[text()='Campaigns']")).click();
	}
	}

