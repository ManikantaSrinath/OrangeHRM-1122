package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginpageObject extends BaseObject {
	
	WebDriver  Driver;
	public LoginpageObject(WebDriver Driver){
		super(Driver);
		
	}
	
	

	

//By.xpath("//input[@placeholder='Username']")
//By.xpath("//input[@placeholder='Password']")
//By.xpath("//button[normalize-space()='Login']")
	
	@FindBy(xpath = "//input[@placeholder='Username']") WebElement usernametxt;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement passwordtxt;
	@FindBy(xpath = "//button[normalize-space()='Login']") WebElement loginbuttun;
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']") WebElement conformationMSG;
	
	
	
	
	public void Setusername(String user) {
		usernametxt.sendKeys(user);
		
	}
	
	public void Setpassword(String pwd) {
		passwordtxt.sendKeys(pwd);
	}
	
	public void Setlogin() {
		loginbuttun.click();
	}
	

	public String GetconfirmMSG() {
		try {
			return(conformationMSG.getText());
			
		}catch(Exception e) {
			return(e.getMessage());
	}

}
	
}
