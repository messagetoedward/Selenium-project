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

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://booking.com");
		Thread.sleep(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//div[@data-testid='searchbox-footer']/div[1]")).click();
//		driver.findElement(By.xpath("//button[@aria-label='Dismiss sign in information.']")).click();
		
		WebElement travelForWork = driver.findElement(By.id(":rg:"));
//		travelForWork.click();
		
		System.out.println(travelForWork.isSelected());
		
		
		driver.findElement(By.xpath("//div[@data-testid='searchbox-footer']/div[1]")).click();
	
		System.out.println(travelForWork.isSelected());
		System.out.println("end 0f script");

		
		//Loops and Multiple WebElements
//			Select departmentDropdown = new Select(driver.findElement(By.cssSelector("select[id='searchDropdownBox']")));
//			departmentDropdown.selectByValue("search-alias=baby-products");
//			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Powder", Keys.ENTER);
//			System.out.println(driver.findElement(By.xpath("//div[@id='brandsRefinements']/ul/span[1]")).getText());
//			driver.findElement(By.xpath("//div[@id='brandsRefinements']/ul/span/li/span/a/span[contains(text(), 'Johnson & Johnson')]")).click();
//			driver.findElement(By.xpath("//div[@id='brandsRefinements']/ul/li/span/a[contains(@class, 's-navigation-clear-link')]")).click();
//			System.out.print(driver.findElements(By.tagName("span")).size());
		//Located span using absolute xpath with parent-child relation
			//driver.findElement(By.xpath("//div[@class='span8']/div/label")).click();
//				System.out.println(driver.findElement(By.xpath("//div[@class='customComponent']/label[contains(for, 'flightSearchForm.tripType.redeemMiles')]")).getText());
			//driver.navigate().refresh();
		//Located span using cssSeelctor
			//driver.findElement(By.cssSelector("[for='flightSearchForm.tripType.redeemMiles']")).click();
			//driver.navigate().refresh();
		//Locate span using xpath no tag (*any tag), attribute+value 
		
//		WebElement redeemMiles = driver.findElement(By.xpath("//*[@for='flightSearchForm.tripType.redeemMiles']"));
//		System.out.println(driver.findElement(By.xpath("//*[@for='flightSearchForm.tripType.redeemMiles']/span")).getText());
		
//		redeemMiles.click();
//		System.out.println(redeemMiles.getText());
//		System.out.println(driver.findElement(By.xpath("//*[@for='flightSearchForm.tripType.redeemMiles']/span")).getText());
		
		//isSelected for # of passengers
		
//		Select numberOfPassengers = new Select(driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount")));
		
//		System.out.println(numberOfPassengers.getFirstSelectedOption().getText());
		
		
		
	}
		
}
