package firstSeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondSeleniumScript {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		
		
		WebElement user = driver.findElement(By.xpath("//div[@class='_6luv _52jv']/form/div/div/input"));
		WebElement password = driver.findElement(By.xpath("//div[@class='_6luv _52jv']/form/div/div/div/input"));
		WebElement loginButton = driver.findElement(By.cssSelector("button[id*='u_0_']"));
		//Negative testing
		
		//1.1 Test user cannot login with user only
		
		user.sendKeys("test@testuser.com");
		loginButton.click();
		Thread.sleep(2000);
		WebElement errorMessage = driver.findElement(By.xpath("//div[@id='email_container']/div[2]"));
		System.out.println(errorMessage.getText());
		driver.navigate().back();
		
		//1.2 Test user can not loging with just password
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_6luv _52jv']/form/div/div/input")).clear();
		driver.findElement(By.xpath("//div[@class='_6luv _52jv']/form/div/div/div/input")).sendKeys("testpassword");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id*='u_0_']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@id='email_container']/div[2]")).getText());
		
		
		
		//Absolute xpath
//		driver.findElement(By.xpath("//div[@class='_6luv _52jv']/form/div/div/input")).sendKeys("test@testmail.com");
//		driver.findElement(By.xpath("//div[@class='_6luv _52jv']/form/div/div/div/input")).sendKeys("testpassword");
		
		//Regular expression CSS
//		driver.findElement(By.cssSelector("button[id*='u_0']")).click();
//		driver.findElement(By.cssSelector("input[class^='inputtext']")).sendKeys("test@testmail.com");
//		driver.findElement(By.cssSelector("input[placeholder$='word']")).sendKeys("testpassword");
		
		//Regular expressions xpath
//		driver.findElement(By.xpath("//input[contains(@placeholder, 'number')]")).sendKeys("test@testmfaka.com");
//		driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Pass')]")).sendKeys("testpassword");
		
		//Warm up
//		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("test@testmail.com");
//		driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("test@testmail.com");
//		driver.findElement(By.id("email")).sendKeys("test@testmail.com");
//		driver.findElement(By.id("pass")).sendKeys("testpassword");
		
	}

}
