package com.ram.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ram.base.Page;

public class LoginPage  extends Page{

	
	public ZohoAppPage doLogin(String username,String pwd) throws InterruptedException
	{
		type("Username_XPATH",username);
		//driver.findElement(By.xpath("//span[text()='Next']")).click();
		click("nextbutton_XPATH");
		type("Pwd_XPATH",pwd);
		click("Signbtn_XPATH");
	//	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//form[@id='login']//button[@id='nextbtn']/span")).click();	
		
		return new ZohoAppPage();
	}
	
}
