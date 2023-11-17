package firstSeleniumScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdSeleniumScriptLoops {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com/sign-in");
		
		WebElement emailOrPhone = driver.findElement(By.xpath("//div[@class='a-box']/div/div/input"));
		WebElement continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
//		WebElement loginButton = driver.findElement(By.cssSelector("button[id*='u_0_']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		emailOrPhone.sendKeys("+19803713112");
		continueButton.click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='a-box']/div/div/input")).clear();
		
	}
	
}