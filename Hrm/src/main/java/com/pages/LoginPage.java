package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase {

@FindBy(id="txtUsername")
WebElement usernameid;

@FindBy(id="txtPassword")
WebElement passwordid;

@FindBy(id="btnLogin")
WebElement loginid;

public LoginPage()
{
	PageFactory.initElements(driver,this);
	
}

public HomePage enterLogin(String username,String password)
{
	usernameid.sendKeys(username);
	passwordid.sendKeys(password);
	loginid.click();
	
	return new HomePage();
	
}







	
	

}
