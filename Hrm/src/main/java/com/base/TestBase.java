package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
    public static Properties prop;
	public static WebDriver driver;
	
	public TestBase()
	{
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("D:\\S2\\Hrm\\src\\main\\java\\com\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		 catch (IOException e)
		{
			e.printStackTrace();
		}		
	}
	
	public static void browserInitialisation(String browserName)
	{
		
		if(browserName.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ATHARVA\\Downloads\\chromedriver3.exe");
			driver=new ChromeDriver();
		}
		
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.","C:\\Users\\ATHARVA\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
		}		
		
		driver.get(prop.getProperty("url"));
	}
}
