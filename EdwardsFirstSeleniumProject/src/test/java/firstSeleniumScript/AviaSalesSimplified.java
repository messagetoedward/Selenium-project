package firstSeleniumScript;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AviaSalesSimplified {

	public static void main(String[] args) throws IOException {
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
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File screenCapture = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenCapture, new File("/Users/mgid/Documents/GitHub/screensnap.png"));
		
		WebElement startDateFieldButton = driver.findElement(By.cssSelector("button[data-test-id='start-date-field']"));
		startDateFieldButton.click();
		
		Select startDateMonth = new Select(driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div/div/form/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/div/select")));
//		List <WebElement> startDateMonthList = driver.findElements(By.xpath("/html/body/div[7]/div[2]/div/div/div/div/form/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/div/select/option"));	
		startDateMonth.selectByIndex(4);
		
		List <WebElement> datesLoop = driver.findElements(By.cssSelector("div[role='gridcell']"));
		
		for (WebElement eachDate : datesLoop) {
			String ariaLabelValue = eachDate.getAttribute("aria-label");
			if (ariaLabelValue.contains("Wed Jan 03 2024")) {
				eachDate.click();
				eachDate.click();
				System.out.println("date " + ariaLabelValue + " found and clicked");
			} else {
				System.out.println(ariaLabelValue + " date not found");
			}
			
			if (ariaLabelValue.contains("Sat Feb 03 2024")) {
				eachDate.click();
				System.out.println("date " + ariaLabelValue + " found and clicked");
				break;
			} else {
				System.out.println(ariaLabelValue + " date not found");
			}
		}
		
			File screenCapture2 = screenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenCapture2, new File("/Users/mgid/Documents/GitHub/screensnap1.png"));
		
		System.out.println(driver.getTitle());	
			
		//Assert.assertEquals(driver.getTitle(), false, null);
		
		/* WebElement startDate = driver.findElement(By.cssSelector("div[data-test-id='date-13.01.2024']"));
		startDate.click();
		startDate.click();

		WebElement endDate = driver.findElement(By.cssSelector("div[data-test-id='date-20.01.2024']"));
		endDate.click(); */
		
		
		
		
//		System.out.println(startDateMonth.getFirstSelectedOption().getText());		
		
		
		
//		List <WebElement> selectStartDate = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy())
		
	}

}
