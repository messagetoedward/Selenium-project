package firstSeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondSeleniumScript {
	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
//		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("test@testmail.com");
//		driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("test@testmail.com");
//		driver.findElement(By.id("email")).sendKeys("test@testmail.com");
//		driver.findElement(By.id("pass")).sendKeys("testpassword");
		
		//Regular expression CSS
//		driver.findElement(By.cssSelector("button[id*='u_0']")).click();
		driver.findElement(By.cssSelector("input[class^='inputtext']")).sendKeys("test@testmail.com");
		
		
		
	}

}
