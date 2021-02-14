import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
	public static void main(String[] args) throws IOException {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MK\\eclipse-workspace\\SeliniumTest\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.greenstechnologys.com/");	
//		TakesScreenshot ts = (TakesScreenshot) driver;	
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destfile = new File("C:\\Users\\MK\\eclipse-workspace\\SeliniumTest\\ScreenShot\\screen.png");
//		FileUtils.copyFile(source, destfile);
	
////////////////////////////////////////////////////////////////
		
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MK\\eclipse-workspace\\SeliniumTest\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.toolsqa.com/");
//		driver.findElement(By.xpath("(//div[@class='widget-title'])[2]")).click();
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MK\\eclipse-workspace\\SeliniumTest\\Driver\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
		
//		driver.findElement(By.xpath("(//i[@class=' the7-mw-icon-mail-bold'])[1]")).click();
		
//////////////////////////////////////////////
		
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MK\\eclipse-workspace\\SeliniumTest\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
//		driver.findElement(By.xpath("//p[@style='float:left;padding-top:20px;padding-left:20px;']")).click();
//		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		
//		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
//		File destfile= new File("C:\\Users\\MK\\eclipse-workspace\\SeliniumTest\\ScreenShot\\screen.png");
//		
//		FileUtils.copyFile(sourcefile, destfile);
		
		
	//////////////////////////////////////////////////////////
		
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MK\\eclipse-workspace\\SeliniumTest\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("www.google.com");
//		TakesScreenshot ts= (TakesScreenshot) driver;
//		java.io.File source = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\MK\\eclipse-workspace\\SeliniumTest\\ScreenShot\\screen.png");
//		FileUtils.copyFile(source, dest);
		
/////////////////////////////////////////////////
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MK\\eclipse-workspace\\SeliniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\MK\\eclipse-workspace\\SeliniumTest\\ScreenShot\\screen.png");
		FileUtils.copyFile(source, dest);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement obj = driver.findElement(By.xpath("//p[@style='float:left;padding-top:20px;padding-left:20px;']"));
		obj.click();
		js.executeScript("arguments[0].scrollIntoView(true);", obj);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
