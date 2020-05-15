package com.ram.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ram.pages.accounts.AccountsPage;

public class TopMenu {
	
	/*
	*
	*
	*/
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver)
	{
		this.driver=driver;
	}
	
	

	public void goTOHome()
	{
		
	}

	public void goToFeeds()
	{
		
	}
	public void goToLeads()
	{
		
	}
	public AccountsPage goToAccouts()
	{
		//driver.findElement(By.xpath("//div[@data-value='Accounts']")).click();
		Page.click("accountstab_XPATH");
		return new AccountsPage();
	}
	public void goToContacts()
	{
		
	}
	public void Signout()
	{
		
	}
	
}
