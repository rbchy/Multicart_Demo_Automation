package stepdefinationcode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonPageActions {

	A1StepCodeHelper helper;

	///// Default Method
	public CommonPageActions(A1StepCodeHelper helper) {
		this.helper = helper;
	}

	///// Page Opration Steps ///////

	////////Click A Operation where a system behave will change
	@When("I click on {string} {string}")           /////// We will use it LAter
	public void i_click_on_link(String elementName, String elementType) {
		if(elementName.equals("Form Authentication")) {
			helper.getHomePageTheInternet().clickFromAuthentionLInk();
		}else if(elementName.equals("Login")) {
			helper.getHomePageTheInternet().clickLoginButton();
		}

	}

	@And("I Enter {string} on {string} Text Box")
	public void i_enter_on_text_box(String value, String fieldName) {

		if(fieldName.equals("UserName")) {
			helper.getHomePageTheInternet().enterUserName(value);
		}else if(fieldName.equals("Password")) {
			helper.getHomePageTheInternet().enterPasswrod(value);
		}

	}



	@When("I click on my-account link")
	public void i_click_on_my_account_link() {
		helper.homepage.clickMyAccountLink();
	}

	@When("I click on myprofile-name link")
	public void i_click_on_my_profileName_link() {
		helper.homepage.clickMyProfileNameLink();
	}

	@And("I click on login link")
	public void i_click_on_login_link() {
		helper.getHomePage().clickLoginLink();

	}

	@And("I Enter user id as {string}")
	public void i_enter_valid_user_id(String userName) {
		helper.getHomePage().enterUseName(userName);
	}

	@And("I Enter password as {string}")
	public void i_enter_valid_password(String password) {
		helper.getHomePage().enterPassword(password);
	}

	@When("I Click the login button")
	public void i_click_the_login_button() {
		helper.getHomePage().clickLogButton();
	}

	@And("I click on signup button")
	public void i_click_on_signup_button() {

		helper.getHomePage().clickSIgnUpButton();

	}

	@And("I logout for the user")
	public void i_log_Out() {
		helper.getHomePage().logOut();
	}

	@Given("I click on forgotpassword link")
	public void iClickOnForgotpasswordLink() {
		helper.getHomePage().clickForgotPawordLink();
	}

	@Given("I enter regemail as {string}")
	public void iEnterRegemailAs(String regEmail) {
		helper.getHomePage().enterRegisterEmail(regEmail);
	}

	@When("I click on reset password button")
	public void iClickOnResetPasswordButton() {
		helper.getHomePage().clickResetPasswordButton();
	}

}
