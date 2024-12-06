package PageobjectModels;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//locate = driver
//locator value = object.properties --object of properties file
//constructor ==used for assigning values

public class ForgetPassword {
	public ChromeDriver driver;
	public Properties pr;
	
	
	public ForgetPassword(ChromeDriver driver,Properties pr) //this is he constructor
	{
		this.driver = driver;
		this.pr =pr;
	}
	
	public void resetpassword(String username) throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("loginPageForgotPassword"))).click();
		WebElement email = driver.findElement(By.xpath(pr.getProperty("email")));
		email.sendKeys(username); 
		Thread.sleep(5500L);
		driver.findElement(By.xpath(pr.getProperty("loginForgotPasswordRequest"))).click();
		//driver.findElement(By.xpath(pr.getProperty("accept"))).click(); // add project button
	
		
	}
	
}
