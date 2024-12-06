package ExtentReport.ExtentReport;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//import com.aventstack.extentreports.reporter.ExtentXReporter;

public class ExtentReportDemo {
	 ExtentReports extent;
	
	@BeforeTest
	public void config()
	{
		//ExtentReports , ExtentHtmlReporter
		String path = System.getProperty("user.dir")+"\\Reports\\index3.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("TestautomationResult");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Himanshu");
		
		
		
	}
	
	
	
	
	@Test
	
	public  void initialdemo() {
		extent.createTest("initialdemo");
		//System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		System.setProperty("webdriver.chrome.driver", "../ExtentReport/chromedriver1.exe");
         ChromeDriver driver = new ChromeDriver();
         driver.get("https://celcompany.testrail.io/index.php?/dashboard");
         System.out.println(driver.getTitle());
         extent.flush();

}
}