package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{


	// create static selectByVisibleText() method with WebElement and String
		// arguments

		public static void selectByVisibleText(WebElement wb, String value) {
			// create object of WebDriverWait class by using driver instance and Duration in
			// time.
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

			// use visibilityOf() method to check element is visible or not
			WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));

			// create Object of Select class by passing WebElement
			Select sel = new Select(waitwb);

			// use selectByVisibleText() method from Select class by passing String
			// arguments
			sel.selectByVisibleText(value);

		}
	


		// create static selectByValue() method with WebElement and String arguments
		public static void selectByValue(WebElement wb, String value) {
			// create object of WebDriverWait class by using driver instance and Duration in
			// time.
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

			// use visibilityOf() method to check element is visible or not
			WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));

			// create Object of Select class by passing WebElement
			Select sel = new Select(waitwb);

			// use selectByValue() method from Select class by using String arguments
			sel.selectByValue(value);
		}
		
		
		// create static selectByIndex() method with WebElement and int arguments
		public static void selectByIndex(WebElement wb, int index) {
			// create object of WebDriverWait class by using driver instance and Duration in
			// time.
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

			// use visibilityOf() method to check element is visible or not
			WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));

			// create Object of Select class by passing WebElement
			Select sel = new Select(waitwb);

			// use selectByValue() method from Select class by using String arguments
			sel.selectByIndex(index);
		}


		// create static getOptions() method with WebElement
		public static void getOptions(WebElement wb) {
			// create object of WebDriverWait class by using driver instance and Duration in
			// time.
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

			// use visibilityOf() method to check element is visible or not
			WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));

			// create Object of Select class by passing WebElement
			Select sel = new Select(waitwb);

			// use getOptions() method
			List<WebElement> ls = sel.getOptions();

			// iterate all values
			for (WebElement wb1 : ls) {
				String a = wb1.getText();
				System.out.println(a);
			}

		}
		
		
		// create static size() method with WebElement with int return type
		public static int size(WebElement wb) {
			// create object of WebDriverWait class by using driver instance and Duration in
			// time.
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

			// use visibilityOf() method to check element is visible or not
			WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));

			// create Object of Select class by passing WebElement
			Select sel = new Select(waitwb);

			// use getOptions() method
			List<WebElement> ls = sel.getOptions();

			// count drop down item using size() method

			int a = ls.size();

			// return a variable
			return a;

		}
		
		

		// create static selectDropDown() method with WebElement and String arguments
			public static void selectDropDown(WebElement wb,String value) {
				// create object of WebDriverWait class by using driver instance and Duration in
				// time.
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

				// use visibilityOf() method to check element is visible or not
				List<WebElement> ls = wait.until(ExpectedConditions.visibilityOfAllElements(wb));


				// iterate all values
				for (WebElement wb1 : ls) {
					String a = wb1.getText();
					//check Expected Value is present or not
					if(a.equalsIgnoreCase(value))
					{
						// if present click on it and break the loop
						wb1.click();
						break;
					}
				}
			}
		
		
			// create static getFirstSelectedOption() method with WebElement 

			public static String getFirstSelectedOption(WebElement wb) {
				// create object of WebDriverWait class by using driver instance and Duration in
				// time.
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

				// use visibilityOf() method to check element is visible or not
				WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));

				// create Object of Select class by passing WebElement
				Select sel = new Select(waitwb);

				// use getFirstSelectedOption() method from Select class 
				WebElement selwb = sel.getFirstSelectedOption();

				//capture the selected value text using getText() method
				String a = selwb.getText();
				
				//return a variable
				return a;
			}
		
		
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

