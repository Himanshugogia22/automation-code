package PageobjectModels;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//locate = driver
//locator value = object.properties --object of properties file
//constructor ==used for assigning values

public class loginpageclass {
	public ChromeDriver driver;
	public Properties pr;
	
	
	public loginpageclass(ChromeDriver driver,Properties pr)
	{
		this.driver = driver;
		this.pr =pr;
	}
	
	public void signin(String username ,String password)
	{
		
		//driver.findElement(By.xpath(pr.getProperty("details-button"))).click();
		//driver.findElement(By.xpath(pr.getProperty("proceed-link"))).click();
		WebElement email = driver.findElement(By.xpath(pr.getProperty("name")));
		email.sendKeys(username);
		WebElement password1 = driver.findElement(By.xpath(pr.getProperty("password")));
		password1.sendKeys(password);
		driver.findElement(By.xpath(pr.getProperty("button_primary"))).click();
	}
	
}