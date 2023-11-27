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


public class forLoops {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://booking.com");
		Thread.sleep(Duration.ofSeconds(6));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> dismissButton = driver.findElements(By.cssSelector("button[aria-label='Dismiss sign in information.']"));
		//Selecting adults on home page START//

		//if statement start
		if(!dismissButton.isEmpty()) {
			dismissButton.get(0).click();
			System.out.println("Dismiss button clicked.");
		} else {
			System.out.println("Dismiss button not found. Proceeding with the rest of the script.");
		}
		//if statement end
		WebElement occupancy = driver.findElement(By.xpath("//button[@data-testid='occupancy-config']"));
		occupancy.click();
		
		WebElement addAdult = driver.findElement(By.xpath("//div[@id=':rf:']/div/div[1]/div[2]/button[2]"));
		WebElement subtractAdult = driver.findElement(By.xpath("//*[@id=':rf:']/div/div[1]/div[2]/button[1]"));
		WebElement totalAdults = driver.findElement(By.xpath("//*[@id=':rf:']/div/div[1]/div[2]/span"));
		System.out.println(totalAdults.getText());
		
		int countAdults = Integer.parseInt(totalAdults.getText());
				
		//Selecting adults on home page END//

		//Loop START
		for (int i = countAdults; i < 20; i++) {
			addAdult.click();
		}
		
		System.out.println(totalAdults.getText());
		int countAdults2 = Integer.parseInt(totalAdults.getText());
		
		for	(int i=countAdults2; i>2; i--) {
			subtractAdult.click();
		}
		//Loop END
		
		System.out.println(totalAdults.getText());
		
		//isSelected() - true false; START
//		driver.findElement(By.xpath("//div[@data-testid='searchbox-footer']/div[1]")).click();
//		driver.findElement(By.xpath("//button[@aria-label='Dismiss sign in information.']")).click();
		
//		WebElement travelForWork = driver.findElement(By.id(":rg:"));
//		travelForWork.click();
		
//		System.out.println(travelForWork.isSelected());
//		
//		
//		driver.findElement(By.xpath("//div[@data-testid='searchbox-footer']/div[1]")).click();
//	
//		System.out.println(travelForWork.isSelected());
//		System.out.println("end 0f script");
//
		//isSelected() - true false; END
//		
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
