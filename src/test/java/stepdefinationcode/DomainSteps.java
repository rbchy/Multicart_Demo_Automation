package stepdefinationcode;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class DomainSteps {


	A1StepCodeHelper helper;
	///// Default Method
	public DomainSteps(A1StepCodeHelper helper) {
		this.helper = helper;
	}


	///// All DOmain Related Steps //////
	@When("I complete the registration form for a new {string}")
	public void i_complete_the_registration_form(String userNumber) {
		helper.getRegistrationPage().completeREgistrationWithUser(userNumber);
	}

	

	@When("I complete the registration form again for the same user")
	public void i_complete_the_registration_form_again_for_the_same_user() {
		helper.getRegistrationPage().completeRegistrationAgainForSameUser();
	}
}
