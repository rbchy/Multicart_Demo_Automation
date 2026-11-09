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
			try {
				String html = helper.getBrowser().driver.getPageSource();
				java.nio.file.Path dir = java.nio.file.Paths.get("target", "failures");
				java.nio.file.Files.createDirectories(dir);
				java.nio.file.Files.write(dir.resolve(scenario.getName().replaceAll("[^A-Za-z0-9-]+", "_") + ".html"),
						("<!-- " + helper.getBrowser().driver.getCurrentUrl() + " -->\n" + html).getBytes(java.nio.charset.StandardCharsets.UTF_8));
			} catch (Exception e) {
				System.err.println("Could not save page source: " + e.getMessage());
			}
		}
		
		helper.getBrowser().driver.close();
	}

}
