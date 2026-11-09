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

	////////// Shared wait + retry: the iScripts demo re-renders parts of the page after clicks /////////
	private WebElement waitFor(By by, boolean clickable) {
		WebDriverWait wait = new WebDriverWait(driverforParentPage, java.time.Duration.ofSeconds(20));
		return wait.until(clickable ? ExpectedConditions.elementToBeClickable(by)
				: ExpectedConditions.visibilityOfElementLocated(by));
	}

	private <T> T retryStale(java.util.function.Supplier<T> action) {
		for (int attempt = 1; ; attempt++) {
			try {
				return action.get();
			} catch (org.openqa.selenium.StaleElementReferenceException stale) {
				if (attempt == 3) {
					throw stale;
				}
				uglyWaitFor(1000);
			}
		}
	}

	private void click(By by) {
		retryStale(() -> {
			WebElement element = waitFor(by, true);
			highlightElement(element, "pass");
			element.click();
			return null;
		});
	}

	private void type(By by, String value) {
		retryStale(() -> {
			WebElement element = waitFor(by, false);
			highlightElementBackground(element, "Pass");
			element.sendKeys(value);
			return null;
		});
	}

	private String text(By by) {
		return retryStale(() -> {
			WebElement element = waitFor(by, false);
			highlightElement(element, "Pass");
			return element.getText().toLowerCase();
		});
	}

	////////// Click Operation /////////
	public void clickWebElement(String locators) {
		click(By.id(locators));
	}

	public void clickWebElementByName(String locators) {
		click(By.name(locators));
	}

	public void clickWebElementByXpath(String locators) {
		click(By.xpath(locators));
	}

	////////// Enter Operation /////////
	public void enterValueOnWebElement(String locators, String value) {
		type(By.id(locators), value);
	}

	public void enterValueOnWebElementByname(String locators, String value) {
		type(By.name(locators), value);
	}

	public void enterValueOnWebElementByxpath(String locators, String value) {
		type(By.xpath(locators), value);
	}

	////////// Get Text Operation /////////
	public String getTextFromWebElement(String locators) {
		return text(By.id(locators));
	}

	public String getTextFromWebElementbyXpath(String locators) {
		return text(By.xpath(locators));
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
		new WebDriverWait(driverforParentPage, java.time.Duration.ofSeconds(20))
				.until(ExpectedConditions.visibilityOf(ele));
	}
	
	
	
	
	public void closeBrowser() {
		driverforParentPage.close();
		;
	}

}
