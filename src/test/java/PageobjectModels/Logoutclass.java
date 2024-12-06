package PageobjectModels;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//locate = driver
//locator value = object.properties --object of properties file
//constructor ==used for assigning values

public class Logoutclass {
	public ChromeDriver driver;
	public Properties pr;
	
	
	public Logoutclass(ChromeDriver driver,Properties pr)
	{
		this.driver = driver;
		this.pr =pr;
	}
	
	public void Logout1() throws InterruptedException
	{
		
		driver.findElement(By.xpath(pr.getProperty("navigation-user"))).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath(pr.getProperty("navigation-user-logout"))).click();
	}
	
}
