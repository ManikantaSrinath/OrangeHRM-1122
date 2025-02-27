package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjects.DashBoardpageObject;
import PageObjects.EmployeeListTablePageObj;
import PageObjects.LoginpageObject;
import PageObjects.PIMobject;

public class WebTableTest extends TestObject{
	
	
	
	@Test	
	public void Webtable() throws InterruptedException {
	LoginpageObject lp = new LoginpageObject(Driver);
	
	lp.Setusername("Admin");
	lp.Setpassword("admin123");
	lp.Setlogin();

	DashBoardpageObject dbe = new DashBoardpageObject(Driver);
	dbe.Setpim();

	EmployeeListTablePageObj wt = new EmployeeListTablePageObj(Driver);
	 wt.Setemplist();
	 wt.Setlist();
     System.out.println( wt.Setlist());

     for(int p=1;p<=wt.Setlist();p++) {
       if(p>=0) {
    	WebElement pages = Driver.findElement(By.xpath("//ul[@class='oxd-pagination__ul']//li["+p+"]"));
    	pages.click();
    	   	
    	Thread.sleep(5000);
    	List<WebElement> empnames =Driver.findElements(By.xpath("//div[@class='oxd-table-body']//div//div[3]"));
    	
    	for (int i = 0;i<empnames.size();i++) {
    		
    	String allnames	= empnames.get(i).getText();
    	System.out.println(allnames); 		
    	}   	
    	Thread.sleep(3000);
     }
     }
     
      
	
	
	
	
	
	
	
	
}
}