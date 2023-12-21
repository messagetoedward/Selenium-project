package firstSeleniumScript;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AviaSalesSimplified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		WebDriver driver = new ChromeDriver();
		driver.get("https://aviasales.com");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		
		WebElement destinationFromButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("avia_form_origin-input"))); /* driver.findElement(By.id("avia_form_origin-input")); */
		destinationFromButton.click();
		destinationFromButton.sendKeys("san");
		
		List<WebElement> destinationDropdown = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@id='avia_form_origin-menu']/li"))); /* driver.findElements(By.xpath("//ul[@id='avia_form_origin-menu']/li")); */
		/* List<WebElement> destinationDropdownWait = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(destinationDropdown)); */
		
		System.out.println(destinationDropdown.size());
		
		for (WebElement eachDestination: destinationDropdown) {
			String destinationName = eachDestination.getText();
			System.out.println(destinationName);
			
			if (destinationName.contains("San Francisco")) {
				eachDestination.click();
				System.out.println(destinationName + " was found and clicked");
				break;
			} else {
				System.out.println("Destination wasnt found");
			}
		
		}
		
		WebElement destinatioToButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("avia_form_destination-input"))); /* driver.findElement(By.id("avia_form_destination-input")); */
		destinatioToButton.click();
		destinatioToButton.sendKeys("cha");
		
		List <WebElement> destinationToDropdown = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@id='avia_form_destination-menu']/li"))); /* driver.findElements(By.xpath("//ul[@id='avia_form_destination-menu']/li")); */
		/* List<WebElement> destinationToDropdownWait = wait.until(ExpectedConditions.visibilityOfAllElements(destinationToDropdown)); */
		
		System.out.println(destinationToDropdown.size());

		for (WebElement eachToDestination : destinationToDropdown) {
			String destinationToName = eachToDestination.getText();
			System.out.println(destinationToName);
			
			if (destinationToName.contains("Charlotte")) {
				eachToDestination.click();
				System.out.println(destinationToName + " was found and clicked");
				break;
			} else {
				System.out.println("Destination wasnt found");
			}
			
		}
		
	}

}
