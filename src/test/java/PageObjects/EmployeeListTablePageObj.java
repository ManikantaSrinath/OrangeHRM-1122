package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeListTablePageObj extends BaseObject{

	public EmployeeListTablePageObj(WebDriver Driver) {
		super(Driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(xpath = "//a[normalize-space()='Employee List']" )WebElement employeelist; ////a[normalize-space()='Employee List']
	
	@FindBy(xpath = "//ul[@class='oxd-pagination__ul']//li") List<WebElement>  list;
	
	
	
	//ul[@class='oxd-pagination__ul']//li[6]
	
	
	
	public void Setemplist() {
		employeelist.click();
	}
	
	
	public int Setlist() {
		return (list.size());
	}
	
	
   
        

}
