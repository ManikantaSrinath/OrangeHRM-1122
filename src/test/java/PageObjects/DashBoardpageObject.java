package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardpageObject extends BaseObject {

	public DashBoardpageObject(WebDriver Driver) {
		super(Driver);
		
	}
	
	
	
	@FindBy(xpath = "//span[normalize-space()='PIM']") WebElement pimclick;
	
	
	
	
	
	
	
	
	
	
	public void Setpim() {
		pimclick.click();
		
	}

	
	

	
	
	
}
