package com.ram.pages.accounts;

import org.openqa.selenium.By;

import com.ram.base.Page;

public class AccountsPage extends Page {

	
	public CreateAccountPage gotoCreateAccounts()
	{
		//driver.findElement(By.xpath("//div[@class='topRightIcons']//link-to/button")).click();
		
		
		click("createaccountlink_XPATH");
		return new CreateAccountPage();
	}
		
	public 	void importAccounts()
	{
		
	}
}
