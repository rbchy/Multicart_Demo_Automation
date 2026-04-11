package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomepageTheInternet extends PageParent {

	public HomepageTheInternet(WebDriver driver) {
		super(driver);
	}

	/////// Properperties
	String authentacitionLink = "//a[contains(text(),'Form Authentication')]";
	String loginButton = "//i[contains(text(),'Login')]";
	String userNameField = "//input[@id='username']";
	String passwordField = "//input[@id='password']";


	/////// CLick Operation
	public void clickFromAuthentionLInk() {

		clickWebElementByXpath(authentacitionLink);

	}

	public void clickLoginButton() {

		clickWebElementByXpath(loginButton);

	}

	/// Enter Operation 
	public void enterUserName(String userName) {
		enterValueOnWebElementByxpath(userNameField,userName);
	}

	public void enterPasswrod(String password) {
		enterValueOnWebElementByxpath(passwordField,password);
	}
	
//////
	String flasElementObject = "//div[@id='flash']";

	public String getActualFlasText() {

		return driverforParentPage.findElement(By.xpath(flasElementObject)).getText();
	}
	
}
