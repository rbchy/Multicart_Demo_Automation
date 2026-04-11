package stepdefinationcode;

import browserfactory.Browsers;
import pageobjectmodel.HomePageMCT;
import pageobjectmodel.HomepageTheInternet;
import pageobjectmodel.MyAccountPage;
import pageobjectmodel.RegistrationPage;

public class A1StepCodeHelper {

	/// Global Instance/Reference Variable
	Browsers browser;
	HomePageMCT homepage;
	HomepageTheInternet homeTheInternet;
	RegistrationPage registrationPage;
	MyAccountPage myAccountPage;

	//// Return an Object either New or existing
	public Browsers getBrowser() {

		//// If First call it will create new
		if (browser == null) {
			browser = new Browsers();
		}
		return browser; /// Return Existing
	}

	//// Return an Object either New or existing
	public HomePageMCT getHomePage() {
		if (homepage == null) {
			homepage = new HomePageMCT(browser.driver);
		}
		return homepage;
	}

	//// Return an Object either New or existing
	public RegistrationPage getRegistrationPage() {
		if (registrationPage == null) {
			registrationPage = new RegistrationPage(browser.driver);
		}
		return registrationPage;
	}


	////Return an Object either New or existing
	public MyAccountPage getMyAccountPage() {
		if (myAccountPage == null) {
			myAccountPage = new MyAccountPage(browser.driver);
		}
		return myAccountPage;
	}


	public HomepageTheInternet getHomePageTheInternet() {
		if (homeTheInternet == null) {
			homeTheInternet = new HomepageTheInternet(browser.driver);
		}
		return homeTheInternet;
	}

	
	
}
