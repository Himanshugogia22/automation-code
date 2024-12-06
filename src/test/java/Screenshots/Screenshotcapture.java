package Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshotcapture {
	public static void takescreenshot(WebDriver driver,String path) throws IOException
	
	{
		File f = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(path));
		
	}


}
