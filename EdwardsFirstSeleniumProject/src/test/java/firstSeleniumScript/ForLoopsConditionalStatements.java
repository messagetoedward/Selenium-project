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

public class ForLoopsConditionalStatements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://booking.com");
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
//		driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/div[22]/div/div/div/div[1]/div[1]/div/button")).click();
		
		WebElement passenger = driver.findElement(By.xpath("//*[@id='indexsearch']/div[2]/div/form/div[1]/div[3]/div/button"));
//		passenger.click();
		
		WebElement typeDestination = driver.findElement(By.id(":re:"));
		typeDestination.click();
		typeDestination.sendKeys("ch");
		
		Thread.sleep(Duration.ofSeconds(2));
		
		List<WebElement> autoComplete = driver.findElements(By.xpath("//*[@id='autocomplete-results']/div/ul/li"));
		
		System.out.println(autoComplete.size());
		
		Thread.sleep(Duration.ofSeconds(2));
		
		for (WebElement each : autoComplete) {
			String eachName=each.getText();
			System.out.println(eachName);
			if(eachName.contains("Charlotte") /*("Charlotte\n"
					+ "North Carolina, United States")*/) {
				each.click();
				System.out.println("clicked");
				break;
			} else {
				System.out.println("was not clicked - panic >=O");
			}
		} 
		
		/* count and name each <a> tag START
		 
		List<WebElement> generalAtag = driver.findElements(By.tagName("a"));
		System.out.println(generalAtag.size());
		
		for (WebElement link:generalAtag) {
			String linkName=link.getText();
			System.out.println(linkName);
		}
		
		count and name each <a> tag END */
		
		
		
		
		
//		WebElement addAdultPassenger = driver.findElement(By.xpath("//*[@id=\":rf:\"]/div/div[1]/div[2]/button[2]"));
//		WebElement exreactAdultPassenger = driver.findElement(By.xpath("//*[@id=\":rf:\"]/div/div[1]/div[2]/button[1]"));
//		WebElement doneButton = driver.findElement(By.xpath("//*[@id=\":rf:\"]/button"));
		
//		addAdultPassenger.click();
		
//		WebElement travelForWorkDiv = driver.findElement(By.xpath("//div[@data-testid='searchbox-footer']/div[1]")); 
//		WebElement travelForWorkInput = driver.findElement(By.id(":rg:"));
//			
		
//		if(travelForWorkInput.isSelected()==true) {
//			System.out.println(travelForWorkInput.isSelected());
//		} else {
//			travelForWorkDiv.click();
//		}
//	
//		
//		System.out.println(travelForWorkInput.isSelected());		
				
		
		
	//for, while loops, add, extract START
		//int i =3;
		//while (i<10) {
		//addAdultPassenger.click();
		//i++;
		//}
		//		
		//int k = 10;
		//while (k>1) {
		//exreactAdultPassenger.click();
		//i--;
		//}
				
		//for (int i=2; i<10; i++) {
		//addAdultPassenger.click(); 
		//}
		//		
		//for (int i=10; i>2; i--) {
		//exreactAdultPassenger.click();
		//}
				
		//int i=2;
		//while (i<5) {
		//addAdultPassenger.click();
		//i++;
		//}
		//		
		//int k=5;
		//while (k>3) {
		//exreactAdultPassenger.click();
		//k--;
		//}
		
		//for (int i=2; i<5; i++) {
		//	addAdultPassenger.click();
		//	System.out.println(driver.findElement(By.xpath("//*[@id=\":rf:\"]/div/div[1]/div[2]/span")).getText());
		//}
		
		//doneButton.click();
	//for, while loops, add, extract END
		
	}

}
