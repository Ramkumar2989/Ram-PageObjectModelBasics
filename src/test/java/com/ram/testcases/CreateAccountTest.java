package com.ram.testcases;

import java.util.Hashtable;



import org.testng.annotations.Test;

import com.ram.base.Page;
import com.ram.pages.ZohoAppPage;
import com.ram.pages.accounts.AccountsPage;
import com.ram.pages.accounts.CreateAccountPage;
import com.ram.utilities.Utilities;

public class CreateAccountTest {
	
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	
	public void createAccountTest(Hashtable<String,String> data)
	{
		ZohoAppPage zp= new ZohoAppPage();
		
		zp.goToCRM();
		AccountsPage AP=Page.menu.goToAccouts();
	//	AccountsPage AP= new AccountsPage();
		CreateAccountPage CAP=	AP.gotoCreateAccounts();
		//CreateAccountPage CAP = new CreateAccountPage();
		CAP.CreateAccount(data.get("accountname"));
		
	}

}
