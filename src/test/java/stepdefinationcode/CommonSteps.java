package stepdefinationcode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class CommonSteps {

	///// Object
	A1StepCodeHelper helper;

	public CommonSteps(A1StepCodeHelper helper) {
		this.helper = helper;
	}
	
	
	
	//// Common Steps //////
	@Given("I Open my computers {string} browser")
	public void i_open_my_computers_browser(String browserName) {
		///helper = new A1StepCodeHelper();
		helper.getBrowser().createBrowserbrowserName(browserName);
	}

	@And("I browse to mct website using url {string}")
	public void i_browse_to_website(String url) {
		helper.getBrowser().openURL(url);
	}


	@And("I close my browser")
	public void i_close_my_browser() {
		// homepage.closeBrowser();
	}

}
