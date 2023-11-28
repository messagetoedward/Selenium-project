package firstSeleniumScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class loopsAmazon {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		Thread.sleep(Duration.ofSeconds(6));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Select dropDown = new Select(driver.findElement(By.id("searchDropdownBox")));
		
		
		System.out.println(driver.findElements(By.xpath("//*[@id='searchDropdownBox']/option")).size());
		
		for (int i=1; i<driver.findElements(By.xpath("//*[@id='searchDropdownBox']/option")).size(); i++) {
			dropDown.selectByIndex(i);
			System.out.println(dropDown.getFirstSelectedOption().getText());
		}	
		
		
	}

}
