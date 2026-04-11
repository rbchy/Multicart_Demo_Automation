package stepdefinationcode;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jettyserver.SampleJettyServer;

public class WaitLearningSteps {

	
	A1StepCodeHelper helper;
	///// Default Method
	public WaitLearningSteps(A1StepCodeHelper helper) {
		this.helper = helper;
	}
	
	
	//////////// Code to Run a Sample Jetty Server //////////
	
    public static final int PORT = 8886;
    SampleJettyServer jety;
    
	@Given("^a jetty server started$")
	public void startJettyServer() throws Exception {
		jety = new SampleJettyServer(PORT);
		jety.start();
	}
	
	@Given("^I close the jetty server$")
	public void closeJettyServer() throws Exception {
		jety.stop();
	}
	
	
	@When("^I click button load element One$")
	public void i_click_button_load_element_One(){
		helper.getBrowser().driver.findElement(By.xpath("//button[contains(text(),'Load Element 1')]")).click();
	}
	
	@Then("^I Expect Hellow World One Displayed in Page$")
	public void i_Expect_Hellow_World_One_Displayed_in_Page(){

		
		boolean isHelloWordDisplayed = helper.getBrowser().driver.
				                       findElement(By.xpath("//h4[contains(text(),'Hello World!')]")).
				                       isDisplayed();
		
		Assert.assertEquals("Hello World Not Displayed", true, isHelloWordDisplayed );

	}
	
	
	/** For Element 2 ( Takes 2 Second )   */
	@When("^I click button load element Two$")
	public void i_click_button_load_element_Two(){
		helper.getBrowser().driver.findElement(By.xpath("//button[contains(text(),'Load Element 2')]")).click();		
	}
	
	@Then("^I Expect Hellow World Two Displayed in Page$")
	public void i_Expect_Hellow_World_Two_Displayed_in_Page(){

		
		boolean isHelloWordDisplayed = helper.getBrowser().driver.
				                       findElement(By.xpath("//h4[contains(text(),'Hello World2!')]")).
				                       isDisplayed();
		
		Assert.assertEquals("Hello World Not Displayed", true, isHelloWordDisplayed );

	}
	
	
	/** For Element 3 ( Takes 3 Second )   */
	@When("^I click button load element Three$")
	public void i_click_button_load_element_Three(){
		helper.getBrowser().driver.findElement(By.xpath("//button[contains(text(),'Load Element 3')]")).click();		
	}
	
	@Then("^I Expect Hellow World Three Displayed in Page$")
	public void i_Expect_Hellow_World_Three_Displayed_in_Page(){

		
		boolean isHelloWordDisplayed = helper.getBrowser().driver.
				                       findElement(By.xpath("//h4[contains(text(),'Hello World3!')]")).
				                       isDisplayed();
		
		Assert.assertEquals("Hello World Not Displayed", true, isHelloWordDisplayed );

	}

	

	/** For Element 4 ( Takes 2-3-4 Second )   */
	@When("^I click button load element four$")
	public void i_click_button_load_element_Four(){
		helper.getBrowser().driver.findElement(By.xpath("//button[contains(text(),'Load Element 4')]")).click();		
	}
	
	@Then("^I Expect Hellow World four Displayed in Page$")
	public void i_Expect_Hellow_World_four_Displayed_in_Page(){

//		
//		// Expcilitly Waiting for One Specific Elements 
//		WebDriverWait wait = new WebDriverWait(helper.getBrowser().driver, 20);
//		WebElement targetElement4 = 
//			      wait.until(ExpectedConditions.visibilityOfElementLocated(
//			       By.xpath("//h4[contains(text(),'Hello World4!')]")));
//
//	
//		boolean isHelloWordDisplayed = helper.getBrowser().driver.
//				                       findElement(By.xpath("//h4[contains(text(),'Hello World4!')]")).
//				                       isDisplayed();
//		
//		Assert.assertEquals("Hello World Not Displayed", true, isHelloWordDisplayed );

	}
	
	
	
}
