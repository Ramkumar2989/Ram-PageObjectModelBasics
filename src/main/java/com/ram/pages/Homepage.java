package com.ram.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ram.base.Page;

public class Homepage extends Page {
	


	
public void goToSupport()
	
	{
	driver.findElement(By.xpath("//div[@class='zh-user-account']//a[3]")).click();
	}
	
	public void goToSignup()
	
	{
		driver.findElement(By.xpath("//div[@class='zh-user-account']//a[5]")).click();
	}
	

	public LoginPage goToLogin()
	
	{
		click("loginlink_XPATH");
		return new LoginPage();
	}
	
public void goToZogoEdu()
	
	{
	}
	
public void goToLearMore()

{
}

		public void validateFooterLinks()
		{
		}
		
}
