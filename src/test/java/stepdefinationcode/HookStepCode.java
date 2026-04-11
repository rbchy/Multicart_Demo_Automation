package stepdefinationcode;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pageobjectmodel.PageParent;

public class HookStepCode {

	A1StepCodeHelper helper;

	///// Default Method
	public HookStepCode(A1StepCodeHelper helper) {
		this.helper = helper;
	}
	
	@Before
	public void rampUp() {	
		PageParent.testUserName="XXXXXX";
	}
	
	@After
	public void tearDown(Scenario scenario) {		
		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) helper.getBrowser().driver).getScreenshotAs(OutputType.BYTES);		
			scenario.attach(screenshot, "image/png", "screenShots");
		}
		
		helper.getBrowser().driver.close();
	}

}
