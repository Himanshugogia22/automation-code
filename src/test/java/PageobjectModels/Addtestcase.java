package PageobjectModels;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtestcase {
    public ChromeDriver driver;
    public Properties pr;

    public Addtestcase(ChromeDriver driver, Properties pr) {
        this.driver = driver;
        this.pr = pr;
    }

    public void addcase(String username) {
        try {
            driver.findElement(By.xpath(pr.getProperty("index"))).click();
            driver.findElement(By.xpath(pr.getProperty("addSectionInline"))).click();
            driver.findElement(By.xpath(pr.getProperty("form-control"))).sendKeys(username);
            driver.findElement(By.xpath(pr.getProperty("editSectionAdd"))).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addcase1(String username) {
        try {
            driver.findElement(By.xpath(pr.getProperty("sidebarCasesAdd"))).click();
            driver.findElement(By.xpath(pr.getProperty("addtitle"))).sendKeys(username);
            driver.findElement(By.xpath(pr.getProperty("buttonadd"))).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addcase2(String username1) {
        try {
             driver.findElement(By.xpath(pr.getProperty("addtitle"))).sendKeys(username1);
            driver.findElement(By.xpath(pr.getProperty("buttonadd"))).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void addcase3(String username1) {
        try {
             driver.findElement(By.xpath(pr.getProperty("addtitle"))).sendKeys(username1);
            driver.findElement(By.xpath(pr.getProperty("buttonadd"))).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void addcase4(String username1) {
        try {
             driver.findElement(By.xpath(pr.getProperty("addtitle"))).sendKeys(username1);
            driver.findElement(By.xpath(pr.getProperty("buttonadd"))).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addcase5() {
        try {
            driver.findElement(By.xpath(pr.getProperty("navigation-suites"))).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
