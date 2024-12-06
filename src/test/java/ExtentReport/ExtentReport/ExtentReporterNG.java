package ExtentReport.ExtentReport;

//import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	//ExtentReports extent;
	
	public static ExtentReports getReportObject()
	
	{
		
		//ExtentReports , ExtentSparkReporter
		String path = System.getProperty("user.dir")+"\\Reports\\index4.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("TestautomationResult");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Himanshu");
		return extent;
	}

}
