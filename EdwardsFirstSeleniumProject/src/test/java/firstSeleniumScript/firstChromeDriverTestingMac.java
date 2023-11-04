package firstSeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstChromeDriverTestingMac {

	public static void main(String[] args) throws InterruptedException {

		

		WebDriver driver = new ChromeDriver();
		driver.get("https://reddit.com/login");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='loginUsername']")).sendKeys("bababuy123");
		driver.findElement(By.xpath("//input[@id='loginPassword']")).sendKeys("bababuy123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		//changes for Github
	
	
		
		
		//Salesforce
//		driver.get("https://salesforce.com/login");
//		driver.findElement(By.cssSelector("#username")).sendKeys("test@testmail.com")
//		driver.findElement(By.cssSelector("input#password")).sendKeys("testpassword");
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("input.button.r4.wide.primary")).click();
//			String errorMessage = driver.findElement(By.cssSelector(".loginError")).getText();
//		Thread.sleep(1000);
//		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		
//			System.out.println(driver.findElement(By.cssSelector(".loginError")).getText());
		
		
		
		
		//REDDIT
//		driver.get("https://reddit.com/login");
//		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("test@tesmail.com");
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("testpassword");
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
//		Thread.sleep(3000);
//		System.out.println(driver.findElement(By.cssSelector("div[class='AnimatedForm__errorMessage']")).getText());
		
		// ROBINHOOD
//		driver.get("https://robinhood.com/login");
//		Thread.sleep(3000);
//		WebElement emailElement = driver.findElement(By.cssSelector("input[type='text']"));
//		WebElement passwordElement = driver.findElement(By.cssSelector("input[type='password']"));
//		WebElement buttonlElement = driver.findElement(By.cssSelector("button[type='submit']"));
//		emailElement.sendKeys("test@testemail.com");
//		passwordElement.sendKeys("testpassword");
//		buttonlElement.click();
//		WebElement messageText = driver.findElement(By.linkText("Unable to log in with provided credentials."));
		
//		driver.quit();
		
//		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("test@testmail.com");
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("testpassword");
//		driver.findElement(By.cssSelector("button[value='1']")).click();
//		System.out.println(driver.findElement(By.cssSelector("div[class='_9ay7']")).getText());
		
//		WebElement messageElement = driver.findElement(By.cssSelector("div[class='_9ay7']"));
//		
//		String messageText = messageElement.getText();
//		
//		String expectedMessage = "The email address you entered isn't connected to an account. Find your account and log in.";
//		
//		if (messageText.equals(expectedMessage)) {
//			System.out.println("Message is expected: " + messageText);
//		} else {
//			System.out.println("Message is not expected. Actual message: " + messageText);
//		}

		
//		driver.get("https://google.com");
//		driver.findElement(By.name("q")).sendKeys("weather near me");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

//		driver.findElement(By.name("username")).sendKeys("username test");
//		driver.findElement(By.name("pw")).sendKeys("password test");
//		driver.findElement(By.name("Login")).click();

//		driver.findElement(By.id("email")).sendKeys("testing@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("password");
//		driver.findElement(By.linkText("Forgotten password?")).click();
		
//		driver.navigate().to("https://facebook.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		System.out.println(driver.getCurrentUrl());
//		driver.navigate().to("http://instagram.com");
//		System.out.println(driver.getTitle());
//		driver.close();
	}

}
