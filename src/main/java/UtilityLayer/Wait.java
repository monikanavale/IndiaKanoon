package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait extends BaseClass {

	// create static sendKeys() method with WebElement and String arguments
	public static void sendKeys(WebElement wb, String value) {
		// create object of WebDriverWait class by using driver instance and Duration in
		// time.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// use visibilityOf() method to check element is visible or not
		WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));

		// enter the text using sendKeys method by using String arguments
		waitwb.sendKeys(value);

	}

	// create static click() method with WebElement argument
	public static void click(WebElement wb) {
		// create object of WebDriverWait class by using driver instance and Duration in
		// time.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// use visibilityOf() method to check element is visible or not
		WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));

		// click on element by using click method
		waitwb.click();

	}

	// create static clear() method with WebElement argument
	public static void clear(WebElement wb) {
		// create object of WebDriverWait class by using driver instance and Duration in
		// time.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// use visibilityOf() method to check element is visible or not
		WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));

		// clear the text from text box
		waitwb.clear();
	}

	// create static getText() method with WebElement argument and return type is
	// String
	public static String getText(WebElement wb) {
		// create object of WebDriverWait class by using driver instance and Duration in
		// time.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// use visibilityOf() method to check element is visible or not
		WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));

		// capture the physical text from application
		String a = waitwb.getText();

		// return a variable
		return a;
	}

	// create static getAttribute() method with WebElement argument and String
	// arguments and return type is String
	public static String getAttribute(WebElement wb, String keyName) {
		// create object of WebDriverWait class by using driver instance and Duration in
		// time.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// use visibilityOf() method to check element is visible or not
		WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));

		// capture the the inner HTML Attributes from HTML DOM structure
		String a = waitwb.getAttribute(keyName);

		// return a variable
		return a;
	}

	// create static isSelected() method with WebElement argument and return type is
	// boolean
	public static boolean isSelected(WebElement wb) {
		// create object of WebDriverWait class by using driver instance and Duration in
		// time.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// use visibilityOf() method to check element is visible or not
		WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));

		// check element is selected or not from application
		boolean a = waitwb.isSelected();

		// return a variable
		return a;
	}

}
