package TestCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginpageObject;

public class InvalidLoginTest extends TestObject {
	
	

	
	@Test
	public void Invalidelogin() {
       LoginpageObject lp = new LoginpageObject(Driver);
		
		lp.Setusername("Admin");
		lp.Setpassword("admin1234"); 
		lp.Setlogin();
	
		
      String message = lp.GetconfirmMSG();
      if(message.contains("Invalid credentials")) {
    	  Assert.assertTrue(true);
      }
      else {
    	  Assert.assertTrue(false);
      }
		

		
	}
	
	
	
	
	

}
