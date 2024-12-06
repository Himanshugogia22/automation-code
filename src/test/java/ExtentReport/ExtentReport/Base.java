package ExtentReport.ExtentReport;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

//import com.relevantcodes.extentreports.ExtentReports;

//import com.aventstack.extentreports.ExtentReports;
public class Base

{
    
    
	public ChromeDriver driver;
	 public Properties pr;
	//public ExtentReports reports;
	 // @BeforeSuite
	   // public void setUp() {
	     //   ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Users\\HimanshuGogia\\Downloads\\Java Selenium\\testrail automation\\extent-report1.html");
	      //  extent = new ExtentReports();
	       // extent.attachReporter(htmlReporter);
	  //  }
	  
	 //  @AfterSuite
	   // public void tearDown() {
	       // extent.flush();
	   // }
	 
	
	@BeforeMethod
	public void setupApplication() throws IOException
	{
		//reports = new ExtentReports("C:\\Users\\HimanshuGogia\\Downloads\\Java Selenium\\testrail automation\\reporting1.html" , false);

		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		System.setProperty("webdriver.chrome.driver", "../ExtentReport/chromedriver.exe");
		
		Reporter.log("=====Browser Session Started=====", true);
		
                driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://celcompany.testrail.io/index.php?/auth/login/:");
		File f = new File("../ExtentReport/object2.properties");
		FileInputStream fi = new FileInputStream(f);
		pr = new Properties();
		pr.load(fi);
		
		//Reporter.log("=====Application Started=====", true);
	}
	
	
	//@AfterMethod
	//public void closeApplication()
	//{
		//driver.quit();
		//Reporter.log("=====Browser Session End=====", true);
		
	//}
	
}
