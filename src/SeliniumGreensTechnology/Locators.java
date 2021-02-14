package SeliniumGreensTechnology;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MK\\eclipse-workspace\\SeliniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("Hi@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("jjj");
//		driver.findElement(By.name("login")).click();
		
//////////////////////////////////////////////////////////////////
		
		
//	driver.manage().window().maximize();	
//	driver.get("https://www.facebook.com/");
//    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hi@gmail.com");
//    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hhh");
//    driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
//    
//    WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
//    
//	org.openqa.selenium.support.ui. Select s = new org.openqa.selenium.support.ui.Select(day);
//	
//	s.selectByValue("29");
//	System.out.println(s.isMultiple());
//    
//	java.util.List<WebElement> options = s.getOptions();
//	for (WebElement webElement : options) {
//		System.out.println(webElement.getText());
//	}
		
/////////////////////////////////////////////////////
		
//	driver.get("https://www.google.com/");
//	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Greens Technology");
//	driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();

	//////////////////////////////////////////////////////////////
	
//	driver.get("https://www.redbus.in/");
//	driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
//	driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
//	driver.findElement(By.xpath("//input[@data-caleng='10-Feb-2021']")).click();
//	driver.findElement(By.xpath("//button[@id='search_btn']")).click();  
	
		
		
//	driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
//	driver.findElement(By.xpath("//a[@data-target='#interview22']")).click();
	
///////////////////////////////////////////////////////////////////////	
		
		
		
		driver.get("https://www.flipkart.com/");
	//	driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement flipkart = driver.findElement(By.xpath("(//span[@class='hDTmm5'])[4]"));
		
		Thread.sleep(20000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", flipkart);
		
		  
		Thread.sleep(20000);
		WebElement top = driver.findElement(By.xpath("//div[@class='_2N81D7']"));	
		js.executeScript("arguments[0].scrollIntoView(false);", top);
		
		Thread.sleep(20000);
		js.executeScript("window.scrollBy(0,3000)");
		
		
		
		
/////////////////////////////////////////////////////
		
//	driver.get("https://www.lvbankonline.in/index.html?module=login");
//	Thread.sleep(20000);
//	driver.findElement(By.xpath("//oj-input-text[@id='login_username']")).sendKeys("Mr.D");
//	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("jj");
//	driver.findElement(By.xpath("(//span[@class='oj-button-text'])[1]")).click();

////////////////////////////////////

//		driver.get("https://twitter.com/");
//		Thread.sleep(20000);
//		driver.findElement(By.xpath("(//div[@dir='auto'])[3]")).click();
//		Thread.sleep(20000);
//		driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[1]")).sendKeys("MrD");
//		driver.findElement(By.xpath("//input[@name='phone_number']")).sendKeys("123456");
//		driver.findElement(By.xpath("//option[@value='6']")).click();
		
		
	/////////////////////////////////////////////
//		
//		driver.get("https://www.amazon.in/");
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
//		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
//		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Mr.D");
//		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Hi");
//		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
////////////////////////////////////////////
		
		
			
	
	
		

	
	
	
			
	}
}
