package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.DashBoardpageObject;
import PageObjects.LoginpageObject;
import PageObjects.PIMPageObjEmployeeList;

public class EmployeeListTest extends TestObject{
	
	
	
	
	
	
	@Test
	public void Emplist() {
		
		LoginpageObject lp = new LoginpageObject(Driver);
		
		lp.Setusername("Admin");
		lp.Setpassword("admin123");
		lp.Setlogin();
	
		
		
		
		DashBoardpageObject dbe = new DashBoardpageObject(Driver);
		dbe.Setpim();
		
		
		
		PIMPageObjEmployeeList pim = new PIMPageObjEmployeeList(Driver);
		pim.SetEmpLstClick();
		pim.SetEmpnametxt("srinath");
		pim.Setsearch();
		
		
		String conformation = pim.ConMSG();
		
		if(conformation.equals("(1) Record Found")) {
			Assert.assertTrue(true);
		}
		if (conformation.equals("No Records Found")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		pim.SetDp();
		pim.Setlogout();
		
		
	}

}
