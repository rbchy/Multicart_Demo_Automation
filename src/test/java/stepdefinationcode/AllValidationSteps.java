package stepdefinationcode;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import pageobjectmodel.PageParent;
import io.cucumber.datatable.*;

public class AllValidationSteps {

	A1StepCodeHelper helper;

	///// Default Method
	public AllValidationSteps(A1StepCodeHelper helper) {
		this.helper = helper;
	}

	
	
	
	@Then("I validate a text {string}")
	public void i_validate_a_text(String expectedText) {
			
		//// Get the Actual Text from Page 
		String actualText=helper.getHomePageTheInternet().getActualFlasText();		
		actualText=actualText.replace("\n", "");
		actualText=actualText.replace("×", "");		
		
		Assert.assertEquals("Failed to validate Expected Text!!!", 
				             expectedText.trim().toLowerCase(), 
				             actualText.trim().toLowerCase().replace("x", ""));		
	}
	
	@Then("I see all my account options available")
	public void i_see_all_my_account_options_available(DataTable dataTable) {

		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		/// throw new io.cucumber.java.PendingException();
		List<String> expectedOptionsList = dataTable.asList(String.class);
		// for(int i=0;i<expectedOptionsList.size();i++) {
		// System.out.println("exp option from gherkin (" + i +")" +
		// expectedOptionsList.get(i));
		// }

		//// Get the List of Option From UI - Selenium
		List<String> actualOptionsList = helper.getMyAccountPage().getAllAccountOptionsfromUI();

		///// Compare 2 List
		Assert.assertEquals("List Not Matched !!", actualOptionsList, expectedOptionsList);

	}

	@Then("I expect {string} my account option link is {string}")
	public void I_expect_first_my_account_option_link_is(String expOptionOrder, String expectedOptionName) {
		String actaulOptionName = null;

		if (expOptionOrder.toLowerCase().equals("first")) {
			actaulOptionName = helper.getMyAccountPage().getFirstMyAccountOption();
		} else if (expOptionOrder.toLowerCase().equals("second")) {
			actaulOptionName = helper.getMyAccountPage().getSecondMyAccountOption();
		} else if (expOptionOrder.toLowerCase().equals("third")) {
			actaulOptionName = helper.getMyAccountPage().getThirdMyAccountOption();
		} else if (expOptionOrder.toLowerCase().equals("fourth")) {
			actaulOptionName = helper.getMyAccountPage().getFourthMyAccountOption();
		}

		Assert.assertEquals("Failed to Find Correct Option Name!!", actaulOptionName.toLowerCase(),
				expectedOptionName.toLowerCase());
	}

	@Then("I expect my Option1 name text as {string}")
	public void i_expect_my_option_name_text(String expectedOptionName) {

		String actaulOptionName = helper.getHomePage().getActualOptionName();
		Assert.assertEquals("Failed to Find Correct Profile Name!!", actaulOptionName,
				expectedOptionName.toLowerCase());
	}

	@Then("I expect my profile name text as {string}")
	public void i_expect_my_profile_name_text(String expectedProfileName) {

		if (expectedProfileName.contains("generateNew")) {
			expectedProfileName = expectedProfileName.replace("generateNew", PageParent.testUserName);
		}

		String actaulProfileName = helper.getHomePage().getActualProfileName();

		Assert.assertEquals("Failed to Find Correct Profile Name!!", actaulProfileName,
				expectedProfileName.toLowerCase());
	}

	@Then("I expect an error text as {string}")
	public void i_expect_error_text_as(String expectedErrorText) {
		// String actualErrorText = homepage.getActualErrorText();
		// Assert.assertEquals("Failed to Find Correct Profile Name!!", actualErrorText,
		// expectedErrorText.toLowerCase());
	}

	@Then("I expect an error name text as {string}")
	public void i_expect_error_name_text_as(String expectedErrorText) {

		String actualErrorText = helper.getHomePage().getNameFiledErrorText();
		Assert.assertEquals("Failed to Find Correct Profile Name!!", actualErrorText, expectedErrorText.toLowerCase());
	}

	@Then("I expect an error password text as {string}")
	public void i_expect_error_password_text_as(String expectedErrorText) {

		String actualErrorText = helper.getHomePage().getPasswordFiledErrorText();
		Assert.assertEquals("Failed to Find Correct Profile Name!!", actualErrorText, expectedErrorText.toLowerCase());
	}

	@Then("I validate a error text as {string}")
	public void iValidateAErrorTextAs(String expError) {
		String actualerror = helper.getHomePage().getForgotPassError();
		Assert.assertEquals("Failed to Find Correct Profile Name!!", actualerror, expError.toLowerCase());
	}

	@Then("I expect existing reg error name text as {string}")
	public void validateExistRegregError(String expectedError) {

		String actualerror;
		actualerror = helper.getBrowser().driver.findElement(By.xpath("//div[@class=\"error\"]")).getText();
		actualerror = actualerror.replace("\n", "");
		actualerror = actualerror.trim();

		// actualerror=helper.getRegistrationPage().getActualExistRegError();

		//// Local Debug
		System.out.println(actualerror);

		/// String expectedError = "Please correct the following errors to continue!*
		/// User Name already exists!* The email address is already in use!.Terms &
		/// Conditions cannot be empty !";

		Assert.assertEquals("Failed to get correct Error", actualerror.toLowerCase(), expectedError.toLowerCase());
	}

}
