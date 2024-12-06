package ExtentReport.ExtentReport;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;

import PageobjectModels.loginpageclass;
import logging.LogsCapture;



public class testmethodclass extends Base {
	//public ExtentTest test;
	
	
	@Test
	public void xyz() throws IOException, InterruptedException
	{
		// reports.startTest("TestName");
		loginpageclass dr = new loginpageclass(driver , pr);
		dr.signin("honeygogia52@gmail.com","H1234h@@");
		SoftAssert softAssert = new SoftAssert(); 
				String actualRersult=driver.getCurrentUrl(); 
		 String expectedResult="https://celcompany.testrail.io/index.php?/dashboard";
				 softAssert.assertEquals(actualRersult,expectedResult);
				 softAssert.assertAll();
				LogsCapture.takelogs("testmethodclass", "login successfull");
		//test.log(LogStatus.PASS, "details");
		// reports.endTest(test);
		// reports.flush();

}
}

