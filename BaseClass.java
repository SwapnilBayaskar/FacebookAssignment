package com.Base;

import java.util.Iterator;
import java.util.Set;

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
	
	public void verifyTitleOfThePage(String strTitle) {
		
		String strParentWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		
		Iterator<String> iterator = allWindow.iterator();
		
		while(iterator.hasNext()) {
			String strChildWindow = iterator.next();
			
			
			if (!strParentWindow.equals(strChildWindow)) {
				driver.switchTo().window(strChildWindow);
				String strChildTitle = driver.getTitle();
				
				System.out.println("Title of the Child Window page is : "+strChildTitle);
				
				if (strChildTitle.equals(strTitle)) {
					System.out.println("It is giving correct Title");
				
				}else {
					System.out.println("Wrong title");
				}
			}
			
						
		}
		driver.close();
		
		driver.switchTo().window(strParentWindow);
		//String strParentTitle = driver.getTitle();
		//System.out.println("Title of the Parent Window page is : "+strParentTitle);
	}
}
