package firstSeleniumScript;

import java.time.Duration;

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
		
		driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/div[22]/div/div/div/div[1]/div[1]/div/button")).click();
		
		WebElement passenger = driver.findElement(By.xpath("//*[@id='indexsearch']/div[2]/div/form/div[1]/div[3]/div/button"));
		passenger.click();
		
		WebElement addAdultPassenger = driver.findElement(By.xpath("//*[@id=\":rf:\"]/div/div[1]/div[2]/button[2]"));
		WebElement exreactAdultPassenger = driver.findElement(By.xpath("//*[@id=\":rf:\"]/div/div[1]/div[2]/button[1]"));
		WebElement doneButton = driver.findElement(By.xpath("//*[@id=\":rf:\"]/button"));
		
		addAdultPassenger.click();
		
		int i =3;
		while (i<10) {
			addAdultPassenger.click();
			i++;
		}
		
		int k = 10;
		while (k>1) {
			exreactAdultPassenger.click();
			i--;
		}
		
//		for (int i=2; i<10; i++) {
//			addAdultPassenger.click();
//		}
//		
//		for (int i=10; i>2; i--) {
//			exreactAdultPassenger.click();
//		}
		
//		int i=2;
//		while (i<5) {
//			addAdultPassenger.click();
//			i++;
//		}
//		
//		int k=5;
//		while (k>3) {
//			exreactAdultPassenger.click();
//			k--;
//		}
		
		//for (int i=2; i<5; i++) {
		//	addAdultPassenger.click();
		//	System.out.println(driver.findElement(By.xpath("//*[@id=\":rf:\"]/div/div[1]/div[2]/span")).getText());
		//}
		
//		doneButton.click();
		
	}

}
