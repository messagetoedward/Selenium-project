package firstSeleniumScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ThirdSeleniumScriptLoops {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com/");
		//page refresh
		driver.navigate().refresh();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//select dropdown
		Select dropdown = new Select(driver.findElement(By.cssSelector("select[id='searchDropdownBox']")));
		//select by index
		dropdown.selectByIndex(12);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//select by value
		dropdown.selectByValue("search-alias=mobile");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//select by visible text
		dropdown.selectByVisibleText("Handmade");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("wood", Keys.ENTER);
		//new select
		Select sort = new Select(driver.findElement(By.xpath("//select[@id='s-result-sort-select']")));
		sort.selectByVisibleText("Price: High to Low");
		System.out.println(sort.getFirstSelectedOption().getText());
		//additionally click on 4 star + rating
		driver.findElement(By.xpath("//span[@class='a-list-item']/a")).click();
		//counting links on page
		System.out.println(driver.findElements(By.tagName("a")).size());
	
		
		
		
		
//		driver.findElement(By.cssSelector("[id='searchDropdownBox']")).click();
//		driver.findElement(By.cssSelector("[value$=stripbooks]")).click();
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("tiktok");
//		driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();

		
//		driver.manage().window().setPosition(new Point(908, 24));
//		driver.findElement(By.id("searchDropdownBox")).click();
//		WebElement emailOrPhone = driver.findElement(By.xpath("//div[@class='a-box']/div/div/input"));
//		WebElement continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
//		WebElement loginButton = driver.findElement(By.cssSelector("button[id*='u_0_']"));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().ex
		
//		emailOrPhone.sendKeys("+19803713112");
//		continueButton.click();
//		
//		driver.navigate().back();
//		
//		driver.findElement(By.xpath("//div[@class='a-box']/div/div/input")).clear();
		
	}
	
}