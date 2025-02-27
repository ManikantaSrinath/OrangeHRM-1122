package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeListDeletPageObject extends BaseObject{

	public EmployeeListDeletPageObject(WebDriver Driver) {
		super(Driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	//i[@class='oxd-icon bi-trash']
	
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-trash']") WebElement trashicon;
	@FindBy(xpath = "//button[normalize-space()='Yes, Delete']") WebElement deletbtn;
	
	
	
	public void Settrashicon() {
		trashicon.click();
	}
	public void Setdeletbtn() {
		deletbtn.click();
	}
	

}
