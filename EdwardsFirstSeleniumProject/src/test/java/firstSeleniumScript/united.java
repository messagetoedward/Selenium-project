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

public class united {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://aa.com");
//		driver.findElement(By.id("APjFqb")).sendKeys("american airlines", Keys.ENTER);
//		driver.findElement(By.xpath("//a[@href='https://www.united.com/']")).click();
//		driver.navigate().refresh();
//		driver.navigate().back();
		System.out.println("Tabs "+ driver.findElements(By.cssSelector("a[class='ui-tabs-anchor']")).size());
		System.out.println("Checkbox "+ driver.findElements(By.cssSelector("[type='checkbox']")).size());
		System.out.println("Links "+ driver.findElements(By.tagName("a")).size());
		
		Select dropDown = new Select(driver.findElement(By.cssSelector("select[name='adultOrSeniorPassengerCount']")));
		dropDown.selectByIndex(2);
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
		
		
	
		
		// TODO Auto-generated method stub

	}

}
