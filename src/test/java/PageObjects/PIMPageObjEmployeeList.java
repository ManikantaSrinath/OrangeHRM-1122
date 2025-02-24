package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMPageObjEmployeeList extends BaseObject{

	public PIMPageObjEmployeeList(WebDriver Driver) {
		super(Driver);
		// TODO Auto-generated constructor stub
	}


	
	
	
	@FindBy(xpath = "//a[normalize-space()='Employee List']") WebElement EmpLstclick;
	@FindBy(xpath = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]") WebElement Empnametxt;
	@FindBy(xpath = "//button[normalize-space()='Search']") WebElement searchbtm;
	
	
	@FindBy(xpath = "//div[@class=\"orangehrm-horizontal-padding orangehrm-vertical-padding\"]//span") WebElement conformationMSG;
	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']") WebElement Dpclick;
	@FindBy(xpath = "//a[normalize-space()='Logout']") WebElement logout;
	
	
	public void SetEmpLstClick() {
		EmpLstclick.click();
	}
	
	public void SetEmpnametxt(String name) {
		Empnametxt.sendKeys(name);
	}
	
	
	public void Setsearch() {
		searchbtm.click();
	}
	
	public String ConMSG() {
		try {
		return(conformationMSG.getText());
	}catch(Exception e){
		return(e.getMessage());
	}
		
	}
	
	
	public void SetDp() {
		Dpclick.click();
	}
	
	public void Setlogout() {
		logout.click();
	}
	
}
