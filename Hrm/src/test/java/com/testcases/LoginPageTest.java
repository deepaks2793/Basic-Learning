package com.testcases;

import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPageTest()
	{
		super();
	}
	
	@Test
	public void verifyLoginFunctionality()
	{
		browserInitialisation(prop.getProperty("browsername"));
		LoginPage loginpage=new LoginPage();
		loginpage.enterLogin(prop.getProperty("username"),prop.getProperty("password"));
		System.out.println("Test123");
	
	}
	

}
