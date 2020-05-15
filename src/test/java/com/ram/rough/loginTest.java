package com.ram.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ram.base.Page;
import com.ram.pages.Homepage;
import com.ram.pages.LoginPage;
import com.ram.pages.ZohoAppPage;
import com.ram.pages.CRM.CRMHomePage;
import com.ram.pages.accounts.AccountsPage;
import com.ram.pages.accounts.CreateAccountPage;

public class loginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	    
		Homepage home=new Homepage();
		LoginPage lp=home.goToLogin(); 
		ZohoAppPage ZP=lp.doLogin("m.ramkumar89@gmail.com", "pom@2020");
		//ZohoAppPage zp= new ZohoAppPage();
		CRMHomePage CP=ZP.goToCRM();
		AccountsPage AP=Page.menu.goToAccouts();
	//	AccountsPage AP= new AccountsPage();
		CreateAccountPage CAP=	AP.gotoCreateAccounts();
		//CreateAccountPage CAP = new CreateAccountPage();
		CAP.CreateAccount("Ram");
		

		//zp.goToChat();
		
		

	}

}
