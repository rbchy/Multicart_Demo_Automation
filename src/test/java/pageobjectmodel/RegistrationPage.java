package pageobjectmodel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

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
	String checkNewscheckBox = "check_news";
	String registerButton = "btnRegister";


	////// Constructor
	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	public void completeREgistrationWithUser(String username) {
		
		String email = null;

		
		//// Random user Name
		if(username.contains("generateNew")) {
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	        testUserName = "user" + timeStamp;  ///Static  Store it in Parent Page 
	        email = testUserName + "@aa.bb";
		}
		
		if(username.contains("emptyEmail")) {
			email = "";
		}

		
		enterValueOnWebElement(emailField, email);
		enterValueOnWebElement(userNameField, "auto" + testUserName);
		enterValueOnWebElement(passwordField, "Password");
		enterValueOnWebElement(confPasswordField, "Password");
		enterValueOnWebElement(firstNameField, "MR Auto");
		enterValueOnWebElement(lastNameField, testUserName);
		enterValueOnWebElementByxpath(termsAndCondField, "Terms Sample ...");

		//clickWebElement(checkNewscheckBox);
		clickWebElement(registerButton);
		
		
	}

}
