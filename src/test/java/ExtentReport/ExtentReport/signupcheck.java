package ExtentReport.ExtentReport;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testingutilities.LogsCapture;
import org.testng.asserts.SoftAssert;

public class signupcheck {

		public static void main(String[] args) throws InterruptedException {
			//System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
			System.setProperty("webdriver.chrome.driver", "../ExtentReport/chromedriver.exe");
             ChromeDriver driver = new ChromeDriver();
			driver.get("https://demo72066.testrail.io/index.php?/dashboard");
			WebElement email = driver.findElement(By.id("name"));
			 email.sendKeys("himanshu.gogia@filestack.com");
			 WebElement Password = driver.findElement(By.id("password"));
			 Password.sendKeys("H1234h@@");
			driver.findElement(By.xpath("//*[@*='button_primary']")).click();
			
			SoftAssert softAssert = new SoftAssert(); 
			String actualRersult=driver.getCurrentUrl(); 
			//Actions ac = new Actions(driver);
			 String expectedResult="https://celcompany.testrail.io/index.php?/auth/login/LWZhMDA0NWExYzgyM2UyNWUzMDVjMjE3ZmRjNzU1ZWEzMjJkOTZmNWY1MWEwODk0MDNjZDJhN2E1NTQ2YTEzM2Y:";
			 softAssert.assertEquals(actualRersult,expectedResult);
			 softAssert.assertAll();
			//LogsCapture.takelogs("signup", "login successful");
			Actions ac = new Actions(driver);
			WebElement TestRuns = driver.findElement(By.id("navigation-runs"));
			Thread.sleep(200L);
			ac.keyDown(Keys.CONTROL).click(TestRuns).keyUp(Keys.CONTROL).build().perform();
			
			String firsttab=driver.getWindowHandle(); // // navigate to the newly opened tab
			Set <String>windowHandles = driver.getWindowHandles();// navigate to the newly opened tab
			 for (String handle : windowHandles) {
		            if (!handle.equals(driver.getWindowHandle())) {
		                // Switch to the new tab
		                driver.switchTo().window(handle);
		                break;
		            }
		        }
			
			//driver.findElement(By.xpath("//*[@*='navigation-runs']")).click();
			//email.sendkeys("himanshu@celestialsys.com");
			//driver.findElement(By.xpath("//*[@*='password']"));
			
		}

	}
