package pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageParent {

	/// Properties 
	WebDriver driverforParentPage;

	//// Power Full Variables 
	public static String testUserName;
	
	
	public PageParent(WebDriver driver) {
		driverforParentPage = driver;
	}

	////////// Click Operation /////////
	public void clickWebElement(String locators) {
		WebElement element = driverforParentPage.findElement(By.id(locators));
		highlightElement(element, "pass");
		element.click();		
	}

	public void clickWebElementByName(String locators) {
		
		WebElement element = driverforParentPage.findElement(By.name(locators));		
		highlightElement(element, "pass");
		element.click();		
	}

	public void clickWebElementByXpath(String locators) {
		WebElement element = driverforParentPage.findElement(By.xpath(locators));
		
		highlightElement(element, "pass");
		element.click();		
	}

	
	////////// Enter Operation /////////
	
	public void enterValueOnWebElement(String locators, String value) {
		WebElement element = driverforParentPage.findElement(By.id(locators));
		
		highlightElementBackground(element, "Pass");
		element.sendKeys(value);	
	}

	public void enterValueOnWebElementByname(String locators, String value) {
		WebElement element = driverforParentPage.findElement(By.name(locators));
		
		highlightElementBackground(element, "Pass");
		element.sendKeys(value);	
	}

	public void enterValueOnWebElementByxpath(String locators, String value) {
		WebElement element = driverforParentPage.findElement(By.xpath(locators));
		
		highlightElementBackground(element, "Pass");
		element.sendKeys(value);	
	}

	
	
	////////// Get TExt Operation /////////

	public String getTextFromWebElement(String locators) {
		WebElement element = driverforParentPage.findElement(By.id(locators));
		
		explicitWait(element); //// 

		highlightElement(element, "Pass");
		String result = element.getText().toLowerCase();
		return result;
	}

	public String getTextFromWebElementbyXpath(String locators) {

		WebElement element = driverforParentPage.findElement(By.xpath(locators));
		explicitWait(element);

		highlightElement(element, "Pass");
		String result = element.getText().toLowerCase();
		return result;
	}

	
	public void framSwitchIn(String framName) {
		driverforParentPage.switchTo().frame(framName);
	}
	public void framSwitchOut() {
		driverforParentPage.switchTo().defaultContent();
	}
	
	
	public String AlertHandel(String AlertOperationFlag) {
		Alert alert = driverforParentPage.switchTo().alert();
		
		String alertText = null;
		
		if(AlertOperationFlag.equals("ok")) {
			alert.accept();
		}else if(AlertOperationFlag.equals("cancel")) {
			alert.dismiss();
		}else if(AlertOperationFlag.equals("alerttext")) {
			alertText=alert.getText();
		}

		return alertText;
	}
	
	public void highlightElement(WebElement element, String flag) {
		JavascriptExecutor js = (JavascriptExecutor) driverforParentPage;

		if (flag.equalsIgnoreCase("pass")) {
			js.executeScript("arguments[0].style.border='2px groove green'", element);
		} else {
			js.executeScript("arguments[0].style.border='2px solid red'", element);

		}
		uglyWaitFor(2000);
	}

	public void highlightElementBackground(WebElement element, String flag) {
		JavascriptExecutor js = (JavascriptExecutor) driverforParentPage;

		if (flag.equalsIgnoreCase("pass")) {
			// js.executeScript("arguments[0].style.border='1px groove green'", element);
			js.executeScript("arguments[0].style.backgroundColor = '" + "yellow" + "'", element);
		} else {
			// js.executeScript("arguments[0].style.border='4px solid red'", element);
			js.executeScript("arguments[0].style.backgroundColor = '" + "red" + "'", element);
		}

		uglyWaitFor(500);
	}

	public void highlightElementBorder(WebElement element, String flag) {
		JavascriptExecutor js = (JavascriptExecutor) driverforParentPage;

		if (flag.equalsIgnoreCase("pass")) {
			js.executeScript("arguments[0].style.border='2px groove green'", element);
		} else {
			js.executeScript("arguments[0].style.border='2px solid red'", element);

		}
		uglyWaitFor(2000);
	}

	public void uglyWaitFor(int mls) {
		try {
			Thread.sleep(mls);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	///////// Explicitly Wait for any Element you pass from the Method Call
	public void explicitWait(WebElement ele ) {
		//WebDriverWait wait = new WebDriverWait(driverforParentPage, 20);
		//wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	
	
	
	public void closeBrowser() {
		driverforParentPage.close();
		;
	}

}
