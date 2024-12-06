package ExtentReport.ExtentReport;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;

import PageobjectModels.loginpageclass;
import logging.LogsCapture;



public class testmethodclass1 extends Base {
	//public ExtentTest test;
	
	@Test
	public void xyz() throws IOException, InterruptedException
	{
		//ExtentTest test = reports.startTest("TestName1");
		loginpageclass dr = new loginpageclass(driver , pr);
		dr.signin("oneygogia52@gmail.com","H1234h@@");
		LogsCapture.takelogs("testmethodclass1", "login should be failed");
	//test.log(LogStatus.FAIL, "details");
	// reports.endTest(test);
	// reports.flush();
		SoftAssert softAssert = new SoftAssert(); 
				String actualRersult=driver.getCurrentUrl(); 
		 String expectedResult="https://celcompany.testrail.io/index.php?/dashboard";
				 softAssert.assertEquals(actualRersult,expectedResult);
				 softAssert.assertAll();



}
}

