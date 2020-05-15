	package com.ram.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.ram.pages.Homepage;
import com.ram.pages.LoginPage;
import com.ram.pages.ZohoAppPage;
import com.ram.utilities.Utilities;

public class LoginTest extends BaseTest {

	@Test (dataProviderClass=Utilities.class,dataProvider="dp")
	public void loginTest(Hashtable<String,String> data) throws InterruptedException
	{
	
	Homepage home=new Homepage();
	LoginPage lp=home.goToLogin(); 
	lp.doLogin(data.get("username"),(data.get("pwd")));

}
	
	
}
