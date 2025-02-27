package TestCases;
import java.awt.Toolkit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.DashBoardpageObject;
import PageObjects.LoginpageObject;
import PageObjects.PIMobject;

public class AddEmployeTest extends TestObject{
	@Test
	public void PimEmpV() throws InterruptedException, AWTException {
		
		LoginpageObject lp = new LoginpageObject(Driver);
		
		lp.Setusername("Admin");
		lp.Setpassword("admin123");
		lp.Setlogin();

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
		pim.Setaddpic();
			
		StringSelection filepath= new StringSelection("C:\\Users\\G Swarnalekha\\Downloads\\png-transparent-hulk.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		Thread.sleep(5000);
			
		Robot rbe = new Robot();
		rbe.keyPress(KeyEvent.VK_CONTROL);
		rbe.keyPress(KeyEvent.VK_V);
		rbe.keyRelease(KeyEvent.VK_V);
		rbe.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(5000);
		
		rbe.keyPress(KeyEvent.VK_ENTER);
		rbe.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);		
		pim.Clicksave();		
		String msg	= pim.ConformMSG();		
		if(msg.contains("Personal Details")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		
		
		
		
		
	}

}
