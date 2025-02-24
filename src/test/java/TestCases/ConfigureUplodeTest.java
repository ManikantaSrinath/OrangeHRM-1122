package TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.DashBoardpageObject;
import PageObjects.LoginpageObject;
import PageObjects.PIMConfigurationPageObject;

public class ConfigureUplodeTest extends TestObject{
	
	
	
	
	
	
  @Test
  public void uplodefile() throws InterruptedException, AWTException {
	  
	  
	  LoginpageObject lp = new LoginpageObject(Driver);
		
		lp.Setusername("Admin");
		lp.Setpassword("admin123");
		lp.Setlogin();
	
		
		
		
		DashBoardpageObject dbe = new DashBoardpageObject(Driver);
		dbe.Setpim();
		
	
		
		PIMConfigurationPageObject upf = new PIMConfigurationPageObject(Driver);
		
		upf.Setconfigurationclick();
		upf.SetDataImport();
		
		
		upf.Setuplodebtn();
		Thread.sleep(5000);
		
	//	C:\Users\G Swarnalekha\Downloads\importData.csv
		//"C:\\Users\\G Swarnalekha\\OneDrive\\Documents\\importData.csv"
		
		
		StringSelection filepathselection = new StringSelection("C:\\Users\\G Swarnalekha\\Downloads\\importData.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepathselection, null);
		
		
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(5000);
		
		
		rb.keyPress(KeyEvent.VK_ENTER);
		
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		Thread.sleep(5000);
		

		String confirm  = upf.SetconformMsg();
		System.out.println(confirm);
         
         if(confirm.contains("importData.csv")) {
        	 Assert.assertTrue(true);
         }
         else {
        	 Assert.assertTrue(false);
         }
	
		
  }


}
