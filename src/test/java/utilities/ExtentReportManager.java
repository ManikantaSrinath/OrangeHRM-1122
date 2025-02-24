package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import TestCases.TestObject;



public class ExtentReportManager implements ITestListener{

		public  ExtentSparkReporter sparkReporter;
		public	ExtentReports extent;
		public	ExtentTest test;
		
		   String repName;
		   
		   public void onStart(ITestContext testContext) {
			   
//			   SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
//			   Date dt = new Date();
//			   String currentdatetimestamp = df.format(dt);
			  
			   String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// timeStamp 
			   
			   repName = "Test-Report-" + timeStamp + ".html";
			   sparkReporter = new ExtentSparkReporter(".\\reports\\" + repName); //specify location of the report
			   
			   sparkReporter.config().setDocumentTitle("OrangeHRM"); //title of report
			   sparkReporter.config().setReportName("Functional Report"); //name of the report
			   sparkReporter.config().setTheme(Theme.DARK);
			   
			   
			   extent = new ExtentReports();
			   extent.attachReporter(sparkReporter);
			   
			   
			   extent.setSystemInfo("Application", "OrangeHRM");
			   extent.setSystemInfo("Module", "Admin");
			   extent.setSystemInfo("Sub Module", "Customers");
			   extent.setSystemInfo("User Name", "Manikanta Srinath");
			   extent.setSystemInfo("Environment", "QA");
			   
			   
			   String os = testContext.getCurrentXmlTest().getParameter("os");
			   extent.setSystemInfo("Operating System", os);
			   
			   String browser = testContext.getCurrentXmlTest().getParameter("browser");
			   extent.setSystemInfo("Browser", browser);
			   
			   List<String> includedGroups =  testContext.getCurrentXmlTest().getIncludedGroups();
			   if(!includedGroups.isEmpty()) {
			   extent.setSystemInfo("Gropus",includedGroups.toString() );
			   
			   }
			  }

		
		   public void onTestSuccess(ITestResult result) {
			test = extent.createTest( result.getTestClass().getName());  //display class name in reports
			test.assignCategory(result.getMethod().getGroups());  //to display groups in reports
			test.log(Status.PASS, result.getName()+"Test got successfully executed");
			
			  }
		  
		  
		   public void onTestFailure(ITestResult result) {
			test =  extent.createTest(result.getTestClass().getName());
			test.assignCategory(result.getMethod().getGroups());
			
//			test.log(Status.FAIL,  result.getName() +"Test got failed: ");
//			test.log(Status.FAIL,   result.getThrowable().getMessage()); //it will give text why it got failed
//			
//			try {
//				String imgpath = new TestObject().captureScreens(result.getName());
//				test.addScreenCaptureFromPath(imgpath);
//			}
//			catch(IOException e1) {
//				e1.printStackTrace();//captureScreen(result.getName());
//			}
			
	}
		  
		   public void onTestSkipped(ITestResult result) {
			 test = extent.createTest(result.getClass().getName());
			 test.assignCategory(result.getMethod().getGroups());
			 test.log(Status.SKIP, result.getName()+"Test got skipped ");
			 test.log(Status.FAIL,   result.getThrowable().getMessage());
			  }
		 
		  
		   public void onFinish(ITestContext testContext) {
			   extent.flush();
			   
			   String pathofExtentReport = System.getProperty("user.dir")+"\\reports\\"+repName;
			   File  extenReport = new File(pathofExtentReport);
			   
			   try {
				   Desktop.getDesktop().browse(extenReport.toURI());
			   }catch(IOException e) {
				   e.printStackTrace();
			   }
			   
			    
			  }
		


	
}


