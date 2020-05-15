package com.ram.testcases;

import org.testng.annotations.AfterSuite;

import com.ram.base.Page;

public class BaseTest {

	@AfterSuite
		public void teardown()
		{
			Page.quit();
		}
}
