package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	
	public void initializeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe"); //Setting the chromedriver path
		driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		
	}
	
	public void openFacebookURL() {
		
		driver.navigate().to("https://www.facebook.com/signup");
	}
	
	public void closeBrowser() {
		
		driver.close();
	}
}
