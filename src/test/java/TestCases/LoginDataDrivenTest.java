package TestCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginpageObject;
import utilities.Daprovider;

public class LoginDataDrivenTest extends TestObject {
	
	@Test(dataProvider = "provider", dataProviderClass = Daprovider.class)
	public void DDTLoginTest(String email,String pwd,String expe) throws InterruptedException {
	
		LoginpageObject lpo = new  LoginpageObject(Driver);
		lpo.Setusername(email);
		lpo.Setpassword(pwd);
		lpo.Setlogin();
		Thread.sleep(5000);
		boolean image = lpo.Confimg();
			
		if(expe.equalsIgnoreCase("Valid")) {
			if(image == true) {
			lpo.Seticon();
			lpo.Setlogout();
			Assert.assertTrue(true);
			}
		
			else {
				Assert.assertTrue(false);
			}
		}
		if(expe.equalsIgnoreCase("Invalid")) {
			if(image == true) {
			lpo.Seticon();
			lpo.Setlogout();
			Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			}
		}
		}

}
