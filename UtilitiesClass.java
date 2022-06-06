package com.Base;

import java.util.Random;

import com.FacebookPage.FacebookSignUpPage;

public class UtilitiesClass extends FacebookSignUpPage {
	
	public static String getFirstname() {
		
		String strFnameArray[] = {"Rahul","Amol","Kiran","Shreyas","Ramesh","Sachin","Santosh"};
		
		String strFirstName = strFnameArray[new Random().nextInt(strFnameArray.length)];
		
		return strFirstName;
	}
	
	public static String getSurname() {
		
		String strLnameArray[] = {"Patil","Deshmukh","Shelar","Kapoor","Thakare","Pawar"};
		
		String strSurname = strLnameArray[new Random().nextInt(strLnameArray.length)];
		
		return strSurname;
	}
	
	public static String getMobileNumber(int intLength) {

		String allowChars="0123456789";
		String randomString="";

		for(int intIndex=0; intIndex<intLength;intIndex++) {
			
			int intNum= (int) Math.floor(Math.random()*allowChars.length());
			randomString+=allowChars.substring(intNum, intNum+1);
		}
		
		String strStartDigit[] = {"99","98","97","96","95","94","93","92","91","90"};
		
		String strRandomDigit = strStartDigit[new Random().nextInt(strStartDigit.length)];
		
		return strRandomDigit+randomString;
		
		
	}
	
	public static String getDay() {
		
		String strRandomDate = "";
		int intRandom = (int) (Math.random()*30);
				
		if(intRandom == 0) {
			intRandom = (int) (Math.random()*30);
		}
		
		strRandomDate = String.valueOf(intRandom).trim();
		
		
		return strRandomDate;
	}
	
	public static String getMonth() {
		
		String strMonth[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		
		String strRandomMonth = strMonth[new Random().nextInt(strMonth.length)];
		
		return strRandomMonth;
	}
	
	public static String getYear() {
		
		String strYear[] = {"1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998"};
		
		String strRandomYear = strYear[new Random().nextInt(strYear.length)];
		
		return strRandomYear;
	}
	
	public static String getGender() {
		
		String strGender;
		
		if(Math.random() > 0.5) {
			strGender = "MALE";
		}else {
			strGender = "FEMALE";
		}
		
		return strGender;
				
	}

}
