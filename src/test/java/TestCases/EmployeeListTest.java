package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.DashBoardpageObject;
import PageObjects.EmployeeListDeletPageObject;
import PageObjects.LoginpageObject;
import PageObjects.PIMPageObjEmployeeList;

public class EmployeeListTest extends TestObject{
	
	
	
	
	
	
	@Test
	public void Emplist() throws InterruptedException {
		
		LoginpageObject lp = new LoginpageObject(Driver);
		
		lp.Setusername("Admin");
		lp.Setpassword("admin123");
		lp.Setlogin();
	
		
		
		
		DashBoardpageObject dbe = new DashBoardpageObject(Driver);
		dbe.Setpim();
		
		
		
		PIMPageObjEmployeeList pim = new PIMPageObjEmployeeList(Driver);
		pim.SetEmpLstClick();
		pim.SetEmpnametxt("srinath");
		Thread.sleep(5000);
		pim.Setsearch();
		
		Thread.sleep(5000);
		String conformation = pim.ConMSG();
		
		
		
		if(conformation.equals("(1) Record Found")) {
			Assert.assertTrue(true);
		}
		
		else {
			Assert.assertTrue(false);
		}
		Thread.sleep(5000);
		
		EmployeeListDeletPageObject del = new EmployeeListDeletPageObject(Driver);
		
		del.Settrashicon();
		del.Setdeletbtn();
		
		
	
		pim.SetDp();
		pim.Setlogout();

		
	}

}
