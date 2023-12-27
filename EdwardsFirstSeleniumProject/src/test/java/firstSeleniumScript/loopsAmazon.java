package firstSeleniumScript;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loopsAmazon {

    private static final String AVIASALES_URL = "https://aviasales.com";
    private static final String ORIGIN_INPUT_ID = "avia_form_origin-input";
    private static final String DESTINATION_INPUT_ID = "avia_form_destination-input";
    private static final String START_DATE_BUTTON_CSS = "button[data-test-id='start-date-field']";

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Navigate to the Aviasales website
            driver.get(AVIASALES_URL);

            // Select origin destination
            selectDestination(driver, wait, ORIGIN_INPUT_ID, "san", "San Francisco");

            // Select destination
            selectDestination(driver, wait, DESTINATION_INPUT_ID, "cha", "Charlotte");

            // Select start date
            selectStartDate(driver, START_DATE_BUTTON_CSS, 4, "Wed Jan 03 2024", "Sat Feb 03 2024");

        } finally {
            // Close the browser
//            driver.quit();
        }
    }

    private static void selectDestination(WebDriver driver, WebDriverWait wait, String inputId, String inputText, String destinationName) {
        WebElement destinationButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(inputId)));
        destinationButton.click();
        destinationButton.sendKeys(inputText);

        List<WebElement> destinationDropdown = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@id='" + inputId.replace("-input", "-menu") + "']/li")));

        System.out.println(destinationDropdown.size());

        for (WebElement destination : destinationDropdown) {
            String destinationText = destination.getText();
            System.out.println(destinationText);

            if (destinationText.contains(destinationName)) {
                destination.click();
                System.out.println(destinationText + " was found and clicked");
                break;
            } else {
                System.out.println("Destination wasn't found");
            }
        }
    }

    private static void selectStartDate(WebDriver driver, String startDateButtonCss, int monthIndex, String... targetDates) {
        WebElement startDateFieldButton = driver.findElement(By.cssSelector(startDateButtonCss));
        startDateFieldButton.click();

        Select startDateMonth = new Select(driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div/div/form/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/div/select")));
        startDateMonth.selectByIndex(monthIndex);

        List<WebElement> datesLoop = driver.findElements(By.cssSelector("div[role='gridcell']"));

        for (WebElement date : datesLoop) {
            String ariaLabelValue = date.getAttribute("aria-label");
            for (String targetDate : targetDates) {
                if (ariaLabelValue.contains(targetDate)) {
                    date.click();
                    date.click();
                    System.out.println("Date " + ariaLabelValue + " found and clicked");
                } else {
                    System.out.println(ariaLabelValue + " date not found");
                }
            }
        }
    }
}












/*
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
*/