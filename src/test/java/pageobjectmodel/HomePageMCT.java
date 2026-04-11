package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageMCT extends PageParent {


	//////// Webdriver for this class will will used for this local class only
	///WebDriver driverforHomepage;

	
	///// ////// Proprties Xpath Id Locators of this Page  /////////////////
	String loginLink = "dLabellogin";
	String userNameField = "username";
	String passwordField = "password";
	String loginButton = "jqLogin";
	String signUpButton = "jqSignup";
	String profileName = "dLabel";
	String userNameFiledError = "name_error";
	String passwordFiledError = "password_error";
	
	String myAccountLink = "/html/body/div[1]/div[1]/nav/div[3]/div/div[3]/div/ul/li/div/div[1]/a";
	
	
	///// COnstructor 
	public HomePageMCT(WebDriver driver) {
		
		///// Send The Driver to Parent 
		super(driver);
	}
	
	

	
	////////////////   Homepage all Click Operation Together ////////////////
	public void clickLoginLink() {
		clickWebElement(loginLink);
	}
	
	public void clickLogButton() {
		clickWebElement(loginButton);
	}

	public void clickSIgnUpButton() {
		clickWebElement(signUpButton);
	}
	
	public void clickProfileName() {
		
		////SwithciN()
		/// SwintIn()
			clickWebElement(profileName);
			
		///SwitchOut	
	}

	////////////////   Homepage all Enter Operation Together ////////////////

	public void enterUseName(String userName) {
		enterValueOnWebElement(userNameField, userName);
	}

	public void enterPassword(String password) {
		enterValueOnWebElement(passwordField, password);
	}


	////////////////   Homepage all Get Text Operation Together ////////////////

	public String getActualProfileName() {		
		return getTextFromWebElement(profileName);
	}

	public String getNameFiledErrorText() {
		return getTextFromWebElement(userNameFiledError);
	}

	public String getPasswordFiledErrorText() {
		return getTextFromWebElement(passwordFiledError);
	}




	
	
	public void logOut() {
		clickWebElement(profileName);
		
		///clickWebElement(loginLink);

		
		driverforParentPage.findElement(By.linkText("Logout")).click();
		
	}



	String forgotPassXpath = "//*[@id=\"drp_div\"]/div/div[3]/div[4]/a";
	

	public void clickForgotPawordLink() {
		
		clickWebElementByXpath(forgotPassXpath);
		
	}




	public void enterRegisterEmail(String regEmail) {
		enterValueOnWebElementByxpath("//*[@id=\"item_details\"]/div[2]/div[2]/div/div/form/div[2]/input", regEmail);
	}




	public void clickResetPasswordButton() {
		
		clickWebElementByXpath("//*[@id=\"item_details\"]/div[2]/div[2]/div/div/form/div[3]/input");
		
	}




	public String getForgotPassError() {
		return getTextFromWebElementbyXpath("//*[@id=\"item_details\"]/div[2]/div[2]/div/div/form/div[1]");
	}




	public void clickMyAccountLink() {
		clickWebElementByXpath(myAccountLink);
		
	}




	public void clickMyProfileNameLink() {
		clickWebElement(profileName);
	}




	public String getActualOptionName() {
		return getTextFromWebElementbyXpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div/div[3]/div[1]/div/div[1]/a");
	}

	

	
//	public String getActualErrorText() {
//
//		return driverforHomepage.findElement(By.xpath("//div[@class='text_information errormsg']")).getText()
//				.toLowerCase();
//
//	}
//	
//	
//	public void closeBrowser() {
//		driverforHomepage.close();
//	}

}
