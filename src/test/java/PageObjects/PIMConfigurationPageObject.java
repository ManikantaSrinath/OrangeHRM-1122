package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMConfigurationPageObject extends BaseObject {

	public PIMConfigurationPageObject(WebDriver Driver) {
		super(Driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	 @FindBy(xpath = "//i[@class='oxd-icon bi-chevron-down']") WebElement configurationclick;
	 @FindBy(xpath = "//a[normalize-space()='Data Import']") WebElement DataImport;
	 @FindBy(xpath = "//div[@class='oxd-file-button']") WebElement uplodebtn;
	 @FindBy(xpath = "//div[@class='oxd-file-input-div']") WebElement conformMsg;
	 
	 
	//div[@class='oxd-file-button']
	 
	 
	 public void Setconfigurationclick() {
		 configurationclick.click();
	 }
	 
	 public void SetDataImport() {
		 DataImport.click();
	 }
	 
	 
	 
	 public void Setuplodebtn() {
		 uplodebtn.click();
	 }
	 
	 
	 
	 public String SetconformMsg() {
		 try {
		 return(conformMsg.getText());
		 
	 }catch(Exception e) {
		 return(e.getMessage());
	 }

	 }
	 
}
