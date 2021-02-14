package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;

public class Browser {

	public static String Browser = "Firefox";
	public static WebDriver driver;

	public static void main(String[] args) {

		browserLaunch(Browser);
		browserFunctiions();

	}

	public static void browserFunctiions() {

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Dinesh");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.quit();

	}

	public static void browserLaunch(String BrowserValue) {


		if (BrowserValue.contains("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "/Users/MK/Desktop/Chrome/chromedriver.exe");

			driver = new ChromeDriver();

		} else if (BrowserValue.contains("Firefox")) {

			System.setProperty("webdriver.gecko.driver", "/Users/MK/Desktop/fox/geckodriver.exe");

			driver = new FirefoxDriver();

		}

		else {

		}

	}

}
