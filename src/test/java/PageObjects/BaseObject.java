package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseObject {
	
	public WebDriver Driver;
	
	public BaseObject(WebDriver Driver){
		
		this.Driver=Driver;
		PageFactory.initElements(Driver, this);
		
	}
	
	


}
