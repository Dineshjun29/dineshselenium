package SeliniumGreensTechnology;

import org.graalvm.compiler.lir.amd64.AMD64ClearRegisterOp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MK\\eclipse-workspace\\SeliniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("http://demo.automationtesting.in/Alerts.html");
//		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
//		Thread.sleep(3000);
//		org.openqa.selenium.Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		
//		driver.get("http://demo.automationtesting.in/Alerts.html");
//		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]")).click();
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//		Thread.sleep(3000);
//		org.openqa.selenium.Alert alert = driver.switchTo().alert();
//		alert.dismiss();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(3000);
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hi dude");
		alert.accept();
		
	}
	
	

}
