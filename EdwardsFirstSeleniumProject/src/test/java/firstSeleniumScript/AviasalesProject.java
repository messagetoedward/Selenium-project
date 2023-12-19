package firstSeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AviasalesProject {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://aviasales.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement destinationFrom = driver.findElement(By.id("avia_form_origin-input"));

        // Type "ch" into the input field
        destinationFrom.clear();
        destinationFrom.sendKeys("san");

        // Wait for the dropdown items to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> dropdownFromItems = driver.findElements(By.xpath("//*[@id='avia_form_origin-menu']/li"));
        List<WebElement> dropdownDynamicActiveWait = wait.until(ExpectedConditions.visibilityOfAllElements(dropdownFromItems));
        
        dropDownMenuIteration(driver, dropdownDynamicActiveWait);
    }

    private static void dropDownMenuIteration(WebDriver driver, List<WebElement> dropdownDynamicActiveWait) {
        for (WebElement eachItem : dropdownDynamicActiveWait) {
            String eachItemName = eachItem.getText();
            System.out.println(eachItemName);
            
            if (eachItemName.contains("Charlotte")) {
            	eachItem.click();
            	System.out.println("Hooray Charlotte clicked =)");
            	break;
            } else {
            	System.out.println("Charlotte wasnt clicked abort, panic =O");
            	break;
            }
        }
    }
}















//package firstSeleniumScript;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;
//
//import java.time.Duration;
//import java.util.*;
//
//
//
//public class AviasalesProject {
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://aviasales.com");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		WebElement destinationFrom = driver.findElement(By.id("avia_form_origin-input" ));
//		destinationFrom.sendKeys("ch");
//		List<WebElement> dropdownFromItems = driver.findElements(By.xpath("//*[@id=\"avia_form_origin-menu\"]/li"));
//		
//		dropDownMenuIteration(driver, destinationFrom, dropdownFromItems);
//	}
//
//	private static void dropDownMenuIteration(WebDriver driver, WebElement destinationFrom,
//			List<WebElement> dropdownFromItems) throws InterruptedException {
//	
//		
//		for (WebElement eachItem : dropdownFromItems) {
//			String eachItemName = eachItem.getText();
//			System.out.println(eachItemName);
//			
////			if (eachItemName.contains("Charlotte")) {
////				eachItem.click();
////				System.out.println("Charlotte found and clicked =)");
////			} else {
////				System.out.println("Charlotte wasnt founf panic! =O");
////			}
//		}
//		
//	}
//	
//
//}
