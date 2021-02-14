package SeliniumGreensTechnology;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MK\\eclipse-workspace\\SeliniumTest\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\MK\\eclipse-workspace\\SeliniumTest\\ScreenShot\\screen.png");
		FileUtils.copyFile(sourcefile, destfile);
		
	}

}
