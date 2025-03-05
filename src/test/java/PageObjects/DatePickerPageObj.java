package PageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DatePickerPageObj extends BaseObject{

	public DatePickerPageObj(WebDriver Driver) {
		super(Driver);
		// TODO Auto-generated constructor stub
	}
     
	
	
	@FindBy(xpath = "//a[@class='oxd-main-menu-item active']") WebElement leavebtn;
	
	
	@FindBy(xpath = "//a[normalize-space()='Apply']") WebElement applybtn;
	
	@FindBy(xpath = "//div[@class='oxd-select-text-input']") WebElement selectdpd;
	
	
	@FindBy(xpath = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//i[1]") WebElement Datepicker;
	
	@FindBy(xpath = "//div[@class='oxd-calendar-selector-month-selected']") WebElement monthpicker;
	
	@FindBy(xpath = "//div[@class='oxd-calendar-selector-year-selected']//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']") WebElement yearpicker;
	
	
	
	public void Setleavebtn() {
		leavebtn.click();
	}
	
	public void Setapplybtn() {
		
		applybtn.click();
	}
	
	public void SetSelectdpf() {

		Select element = new Select(selectdpd);
		element.selectByIndex(1);

	}
	
	public void SetDatepicker() {
		Datepicker.click();	
	}
	
	public void Handlingofdatepicker(String Expectedyear,String Expectedmonth,String ExpectedDate) {
		//div[@class='oxd-calendar-selector-month-selected']
		
		//div[@class='oxd-calendar-selector-year-selected']//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']
		SetDatepicker();
		while(true) {
			
			
			
		String month = monthpicker.getText();
		String year = yearpicker.getText();
		
		
		if(month.equals(Expectedyear) && year.equals(Expectedmonth)) {
			break;			
		}
			
		}
		
		
		
		
	}
	
	
	  
	
	
	
	
	
	
	
	
}
