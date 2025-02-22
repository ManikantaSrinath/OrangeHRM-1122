package TestCases;


import org.testng.Assert;

import org.testng.annotations.Test;

import PageObjects.LoginpageObject;

public class LoginpageTest extends TestObject {
	


	
	@Test
	public void logintest(){
		
		LoginpageObject lp = new LoginpageObject(Driver);
		
		lp.Setusername("Admin");
		lp.Setpassword("admin123");
		lp.Setlogin();
		
		Assert.assertEquals(Driver.getTitle(), "OrangeHRM");

		
	}
	

	


}
