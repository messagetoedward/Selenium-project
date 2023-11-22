package firstSeleniumScript;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class forLoops {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Select departmentDropdown = new Select(driver.findElement(By.cssSelector("select[id='searchDropdownBox']")));
		departmentDropdown.selectByValue("search-alias=baby-products");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Powder", Keys.ENTER);
//		System.out.println(driver.findElement(By.xpath("//div[@id='brandsRefinements']/ul/span[1]")).getText());
		driver.findElement(By.xpath("//div[@id='brandsRefinements']/ul/span/li/span/a/span[contains(text(), 'Johnson & Johnson')]")).click();
		driver.findElement(By.xpath("//div[@id='brandsRefinements']/ul/li/span/a[contains(@class, 's-navigation-clear-link')]")).click();
		//Loops and Multiple WebElements
		System.out.print(driver.findElements(By.tagName("span")).size());
		

	}

}
