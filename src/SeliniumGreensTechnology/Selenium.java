package SeliniumGreensTechnology;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	
	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver", "C:/Users/MK/Desktop/Chrome/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.fb.com/");
    driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("ggg");
	driver.findElement(By.id("pass")).sendKeys("jjj");
	driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
	driver.quit();
	
	}

}
