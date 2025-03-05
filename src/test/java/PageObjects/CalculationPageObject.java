package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CalculationPageObject extends BaseObject{

	public CalculationPageObject(WebDriver Driver) {
		super(Driver);
		
	}

	@FindBy(xpath = "//input[@id='mat-input-0']") 
	WebElement depositeAmt;
	
	@FindBy(xpath = "//input[@id='mat-input-1']") 
	WebElement months;
	
	@FindBy(xpath = "//input[@id='mat-input-2']") 
	WebElement intrestrate;
	
	@FindBy(xpath = "//div[@class='mat-select-arrow-wrapper ng-tns-c109-5']")
	WebElement selectDdown;
	
	@FindBy(xpath = "//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']")
	WebElement runbtn;
	
	@FindBy(xpath = "//span[@id='displayTotalValue']") 
	WebElement expectedvalue;
	
	
	public void SetDeposite(String amount) {
		depositeAmt.clear();
		depositeAmt.sendKeys(amount);
	}
	public void Setmonths(String month) {
		months.clear();
		months.sendKeys(month);	
	}
	
	public void Setintrest(String intrest) {
		intrestrate.clear();
		intrestrate.sendKeys(intrest);		
	}
	
	public void Setselectdd(String Compounding) {
		Select dropdown = new Select(selectDdown);
		dropdown.selectByVisibleText(Compounding);
	}
	
	public void Setrun() {
		runbtn.click();
	}
	
	public String  Setvalue() {
		return expectedvalue.getText();
	}
	


}
