package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestObject {
	public WebDriver Driver;
	@BeforeClass
	public void setup() throws InterruptedException{
		
		Driver = new ChromeDriver();
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	@AfterClass
	void teardown(){
		
		Driver.close();
		
	}

}
