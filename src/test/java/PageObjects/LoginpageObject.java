package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginpageObject extends BaseObject {
	
	WebDriver  Driver;
	public LoginpageObject(WebDriver Driver){
		super(Driver);		
	}

	@FindBy(xpath = "//input[@placeholder='Username']") 
	WebElement usernametxt;
	@FindBy(xpath = "//input[@placeholder='Password']") 
	WebElement passwordtxt;
	@FindBy(xpath = "//button[normalize-space()='Login']") 
	WebElement loginbuttun;
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']") 
	WebElement conformationMSG;
	@FindBy(xpath = "//img[@alt='client brand banner']")
	WebElement img;
	@FindBy(xpath ="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']") 
	WebElement icon;
	@FindBy(xpath= "//a[normalize-space()='Logout']")  
	WebElement logout;
		
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
		
		return conformationMSG.getText();
	}
	
	public boolean Confimg() {
		try {
		return (img.isDisplayed());
		}
		catch(Exception e)	{
			return false;
		}
	}
		
	public void Seticon() {
		icon.click();
	}
	
	public void Setlogout() {
		logout.click();
	}


	
}
