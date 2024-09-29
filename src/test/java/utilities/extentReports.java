package utilities;

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

import testCases.baseclass;

public class extentReports implements ITestListener {
	
	
		
		public ExtentSparkReporter sparkReport;
		public ExtentReports extent;
		public ExtentTest test;
		
		String repName;
		
		public void onStart(ITestContext context) {
			
			
			String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			repName="Test-Report-" + timestamp + ".html";
			sparkReport=new ExtentSparkReporter(".\\reports\\" + repName);
			sparkReport.config().setDocumentTitle("Opencert Automation report");
			sparkReport.config().setReportName("OpenCert Functional Testing");
			sparkReport.config().setTheme(Theme.DARK);
			
			extent=new ExtentReports();
		    extent.attachReporter(sparkReport);
		    
		    extent.setSystemInfo("Application","Opencert");
		    extent.setSystemInfo("Module","Admin");
		    extent.setSystemInfo("Sub-Module","Customers");
		    extent.setSystemInfo("UserName",System.getProperty("user.name"));
		    
		    extent.setSystemInfo("Environment",  "QA");
		    extent.setSystemInfo("Tester Name",  "Raja");
		    extent.setSystemInfo("os",  "Windows10");
		    extent.setSystemInfo("Browser Name ",  "Chrome");
		    
		    
		    String os=context.getCurrentXmlTest().getParameter("os");
		    extent.setSystemInfo("Operating Systemt", os);
		    
		    String browser=context.getCurrentXmlTest().getParameter("browser");
		    extent.setSystemInfo("Browser", browser);
		    
		    List<String> includedGroups=context.getCurrentXmlTest().getIncludedGroups();
		    if(!includedGroups.isEmpty()) {
		    	extent.setSystemInfo("Groups", includedGroups.toString());
		    }
		}
		public void onTestSuccess(ITestResult result) {
			
			test = extent.createTest(result.getTestClass().getName());
			test.assignCategory(result.getMethod().getGroups()); 
			test.log(Status.PASS,"Test case passed is :"+ result.getName());
		}
		
		/*
		 * public void onTestFailure(ITestResult result) {
		 * 
		 * test = extent.createTest(result.getTestClass().getName());
		 * 
		 * test.log(Status.FAIL,"Test case failed is :"+ result.getName());
		 * test.log(Status.FAIL,"Test case failed is :"+ result.getThrowable());
		 * 
		 * try { String impPath=new baseclass().captureScreen(result.getName());
		 * test.addScreenCaptureFromPath(impPath);
		 * 
		 * } catch (IOException e1) { e1.printStackTrace(); } }
		 * 
		 * 
		 */
		public void onTestSkipped(ITestResult result) {
			
			test = extent.createTest(result.getName());
			test.log(Status.SKIP,"Test case skipped is :"+ result.getName());
		}
		public void onFinish(ITestContext context) {
			
			extent.flush();
		}
}

