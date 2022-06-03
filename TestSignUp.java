package com.Test;

import com.Base.UtilitiesClass;
import com.FacebookPage.FacebookSignUpPage;

public class TestSignUp extends UtilitiesClass{

	public static void main(String[] args) {
		
		FacebookSignUpPage objFacebookSignUp = new FacebookSignUpPage();
		
				
		objFacebookSignUp.initializeBrowser();
		objFacebookSignUp.openFacebookURL();
		
		objFacebookSignUp.setFirstName(getFirstname());
		objFacebookSignUp.setLastName(getSurname());
		objFacebookSignUp.setMobile(getMobileNumber(8));
		//objFacebookSignUp.setConfirmMobile(getMobileNumber(8));
		objFacebookSignUp.setPassword();
		objFacebookSignUp.setDay(getDay());
		objFacebookSignUp.setMonth(getMonth());
		objFacebookSignUp.setYear(getYear());
		objFacebookSignUp.setGender(getGender());
		
		//objFacebookSignUp.clickOnTermsLink();
		
		//objFacebookSignUp.closeBrowser();
				

	}

}
