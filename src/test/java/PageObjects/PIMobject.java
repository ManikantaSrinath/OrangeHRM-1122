package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMobject extends BaseObject{

	public PIMobject(WebDriver Driver) {
		super(Driver);
	}

	
	@FindBy(xpath = "//button[normalize-space()='Add']") WebElement PimAddbtm; 
	
	@FindBy(xpath = "//a[normalize-space()='Add Employee']") WebElement addemploylist;  //a[normalize-space()='Add Employee']
	
	@FindBy(xpath = "//input[@placeholder='First Name']") WebElement firstnametxt;   
	
	@FindBy(xpath = "//input[@placeholder='Middle Name']") WebElement middlenametxt;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']") WebElement lastnametxt;
	
	@FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']") WebElement defualtempidnum;
	
	@FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']") WebElement empidnum;

	@FindBy(xpath = "//button[@class='oxd-icon-button oxd-icon-button--solid-main employee-image-action']") WebElement addphotoclcl;
	
	@FindBy(xpath = "//button[normalize-space()='Save']") WebElement savebuttn;
	
	@FindBy(xpath = "(//h6[normalize-space()='Personal Details']") WebElement conformationmsg;
	
	public void Clickpim() {
		PimAddbtm.click();
	}
	
	public void ClickEmpList() {
		addemploylist.click();
	}
	
	public void SetFirtName(String firstuser) {
		firstnametxt.sendKeys(firstuser);
		
	}
	public void SetMiddleName(String midname) {
		middlenametxt.sendKeys(midname);
	}

	public void SetLastName(String lastname) {
		lastnametxt.sendKeys(lastname);
	}
	
	public void Clearempid() {
		defualtempidnum.clear();		
	}
	
	public void Clickmpid(String num) {
		empidnum.sendKeys(num);		
	}
	
	public void Setaddpic() {
		addphotoclcl.click();
	}

	public void Clicksave() {
		savebuttn.click();		
	}
	

	public String ConformMSG() {
		try {
		return(conformationmsg.getText());
	}
		catch(Exception e) {
			
			return(e.getMessage());
		}
			
		}

}
