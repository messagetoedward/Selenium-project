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
		Thread.sleep(Duration.ofSeconds(3));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Select dropDown = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> countDropDown = driver.findElements(By.xpath("//*[@id='searchDropdownBox']/option"));
		
		System.out.println(countDropDown.size());
		
		dropDown.selectByIndex(55);
		
		for (int i=0; i<countDropDown.size(); i++) {
			dropDown.selectByIndex(i);
			System.out.println(dropDown.getFirstSelectedOption().getText());
		}	
		
		for (int i=countDropDown.size(); i>0; i--) {
			dropDown.selectByIndex(i-1);
			System.out.println(dropDown.getFirstSelectedOption().getText());
		}
		
	}

}
