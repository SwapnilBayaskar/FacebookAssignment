package com.FacebookPage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Base.BaseClass;

public class FacebookSignUpPage extends BaseClass{
	
	
	public void setFirstName(String strFirst){
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys(strFirst);
	}
	
	public void setLastName(String strLast){
		
		WebElement LastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		LastName.sendKeys(strLast);
		
	}
	
	public void setMobile(String strMobile) {
		
		WebElement Mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Mobile.sendKeys(strMobile);
	}
	
	public void setConfirmMobile(String strConfirmMobile) {
		
		WebElement ConfirmMobile = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		ConfirmMobile.sendKeys(strConfirmMobile);
	}
	
	public void setPassword() {
		
		WebElement Password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		Password.sendKeys("Admin123");
	}
	
	public void setDay(String strDay) {
		
		WebElement DayDropdown = driver.findElement(By.xpath("//select[@id='day']"));		
		Select drpDate = new Select(DayDropdown);
		drpDate.selectByVisibleText(strDay);
	}
	
	public void setMonth(String strMonth) {
		
		WebElement MonthDropdown = driver.findElement(By.xpath("//select[@id='month']"));		
		Select drpMonth = new Select(MonthDropdown);
		drpMonth.selectByVisibleText(strMonth);
	}
	
	public void setYear(String strYear) {
		
		WebElement YearDropdown = driver.findElement(By.xpath("//select[@id='year']"));		
		Select drpYear = new Select(YearDropdown);
		drpYear.selectByVisibleText(strYear);
	}
	
	public void setGender(String strGender) {
		
		if(strGender=="MALE") {
			WebElement GenderMale = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
			GenderMale.click();
		}else {
			WebElement Genderfemale = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
			Genderfemale.click();
		}
	}
	
	public void clickOnTermsLink() {
		
		WebElement Terms = driver.findElement(By.xpath("//a[@id='terms-link']"));
		Terms.click();
		
		verifyTitleOfThePage("Facebook");
		
		//driver.switchTo().activeElement().sendKeys(Keys.CONTROL, Keys.NUMPAD2);
								
	}
	
	public void clickOnDataPolicy() {
		
		WebElement DataPolicy = driver.findElement(By.xpath("//a[@id='privacy-link']"));
		DataPolicy.click();
		
		verifyTitleOfThePage("Facebook");
	}
	
	public void clickOnCookiePolicy() {
		
		WebElement CookiePolicy = driver.findElement(By.xpath("//a[@id='cookie-use-link']"));
		CookiePolicy.click();
		
		verifyTitleOfThePage("Cookie Policy");
	}
		
	
}
