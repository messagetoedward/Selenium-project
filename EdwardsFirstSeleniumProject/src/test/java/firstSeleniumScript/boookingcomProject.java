package firstSeleniumScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class boookingcomProject {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://booking.com");
		
		WebElement dropdown = driver.findElement(By.id(":re:"));
//		dropdown.click();
		
		for (char firstChar = 'a'; firstChar <= 'z'; firstChar++) {
			for (char secondChar = 'a'; secondChar <= 'z'; secondChar++) {
				for (char thirdChar = 'a'; thirdChar <= 'z'; thirdChar++) {
					String searchQuery = String.valueOf(firstChar) + secondChar + thirdChar;
					
					clickDropdownAndPrintSuggestions(driver, dropdown, searchQuery);
				}
				
			}
		}
	driver.quit();	
	}

	private static void clickDropdownAndPrintSuggestions(WebDriver driver, WebElement dropdown, String searchQuery) throws InterruptedException {
		
		dropdown.click();
		
		dropdown.sendKeys(searchQuery);
		
		Thread.sleep(Duration.ofSeconds(2));
		
		List<WebElement> suggestionElements = dropdown.findElements(By.xpath("//*[@id='autocomplete-results']/div/ul/li"));
		
		for (WebElement suggestion : suggestionElements) {
			Thread.sleep(Duration.ofSeconds(1));
			System.out.println(suggestion.getText());
			
		}
		WebElement clearButton = driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[1]/div/div/div[1]/div/div/div[3]"));
		clearButton.click();
		
	}
}
