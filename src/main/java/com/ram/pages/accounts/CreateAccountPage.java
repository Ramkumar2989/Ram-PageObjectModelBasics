package com.ram.pages.accounts;

import org.openqa.selenium.By;

import com.ram.base.Page;

public class CreateAccountPage extends Page {
	
	public void CreateAccount(String accountName)
	{
		//driver.findElement(By.cssSelector("#Crm_Accounts_ACCOUNTNAME")).sendKeys(accountName);
		type("accountname_CSS", accountName);
	}

	

}
