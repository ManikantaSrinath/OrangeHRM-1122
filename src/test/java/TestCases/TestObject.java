package TestCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		//Driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		Thread.sleep(3000);
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
	}
	
	@AfterClass
	void teardown(){
		
		Driver.close();
		
	}
	
//	public String captureScreens(String tname) throws IOException//tname is a faildetestmethod name for ss name
//	{
//		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// timeStamp 
//		TakesScreenshot takesScreenshot = (TakesScreenshot) Driver;	
//		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//		
//		String targetFilepath = System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
//		
//		File targetFile = new File(targetFilepath); //converting string to file formate
//		
//		sourceFile.renameTo(targetFile);
//		return targetFilepath;
//		
//	}

}
