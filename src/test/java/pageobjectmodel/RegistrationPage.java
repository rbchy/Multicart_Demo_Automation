package pageobjectmodel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends PageParent {

	//////// Webdriver for this class will will used for this local class only
	////WebDriver driverforRegistrationPage;

	String emailField = "txtEmail";
	String userNameField = "txtUserName";
	String passwordField = "txtPassword";
	String confPasswordField = "txtCnfPassword";
	String firstNameField = "txtFirstName";
	String lastNameField = "txtLastName";
	String termsAndCondField = "//textarea[@name='custom_field_1']";
	String addressField = "//input[@name='custom_field_2']";   //// "Address *" — required since the site update
	String checkNewscheckBox = "check_news";
	String registerButton = "btnRegister";


	////// Constructor
	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	public void completeREgistrationWithUser(String username) {
		String email;
		if (username.contains("generateNew")) {
			//// Unique user name per run, stored in the parent page for later checks
			String timeStamp = new SimpleDateFormat("yyMMddHHmmss").format(new Date());
			testUserName = "user" + timeStamp;
			email = testUserName + "@aa.bb";
		} else if (username.contains("emptyEmail")) {
			testUserName = "emptyemail";
			email = "";
		} else {
			//// A fixed user name (e.g. an existing account for the duplicate-user check)
			testUserName = username;
			email = username + "@aa.bb";
		}
		enterValueOnWebElement(emailField, email);
		enterValueOnWebElement(userNameField, "auto" + testUserName);
		enterValueOnWebElement(passwordField, "Password");
		enterValueOnWebElement(confPasswordField, "Password");
		enterValueOnWebElement(firstNameField, "MR Auto");
		enterValueOnWebElement(lastNameField, testUserName);
		if (!driverforParentPage.findElements(By.xpath(addressField)).isEmpty()) {
			enterValueOnWebElementByxpath(addressField, "100 Test Street, Philadelphia, PA");
		}
		//// The Terms & Conditions box is not on every version of the form
		if (!driverforParentPage.findElements(By.xpath(termsAndCondField)).isEmpty()) {
			enterValueOnWebElementByxpath(termsAndCondField, "Terms Sample ...");
		}
		clickWebElement(registerButton);
	}
}
