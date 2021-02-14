package SeliniumGreensTechnology;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MK\\eclipse-workspace\\SeliniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Frame");
		
	
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]")).click();
		
		
		WebElement Frame1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(Frame1);
		Thread.sleep(3000);
		
		WebElement Frame2 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
	    driver.switchTo().frame(Frame2);
	    Thread.sleep(3000);
	    
	    WebElement Frame3 = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		Frame3.sendKeys("Hi");
		
	}
		

}
