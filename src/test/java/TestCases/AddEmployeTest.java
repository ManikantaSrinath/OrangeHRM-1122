package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.DashBoardpageObject;
import PageObjects.LoginpageObject;
import PageObjects.PIMobject;

public class AddEmployeTest extends TestObject{
	
	
	
	
	@Test
	public void PimEmpV() throws InterruptedException {
		
		LoginpageObject lp = new LoginpageObject(Driver);
		
		lp.Setusername("Admin");
		lp.Setpassword("admin123");
		lp.Setlogin();
		
		//Assert.assertEquals(Driver.getTitle(), "OrangeHRM");
		
		
		
		DashBoardpageObject dbe = new DashBoardpageObject(Driver);
		dbe.Setpim();
	
		PIMobject pim = new PIMobject(Driver);
		
		
		
		pim.ClickEmpList();
		pim.SetFirtName("Manikanta");
		pim.SetMiddleName("srinath");
		
		Thread.sleep(2000);
		pim.SetLastName("Gudimalla");
		
		
		
		
		
		pim.Clearempid();
	
		pim.Clickmpid("630071");
		
		pim.Clicksave();
		
		Thread.sleep(3000);
		
		String msg	= pim.ConformMSG();
		
		if(msg.contains("Personal Details")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		
		
		
		
		
	}

}
