package stepdefinationcode;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertSteps {

	
	
	A1StepCodeHelper helper;

	///// Default Method
	public AlertSteps(A1StepCodeHelper helper) {
		this.helper = helper;
	}
	
	
/** Alert Element TEsting   */

	
//	@Given("^I am on page that loades Alert$")
//	public void i_am_on_page_that_loades_Alert(){
//		helper.getBrowser().driver.get("http://localhost:8886/Sample-Web/alertIWebPage.htm");
//	}

	@When("^I click for js alert button$")
	public void i_click_for_js_alert_button(){
		
		try {
			
			////// Alert That oNly SHow OK Button 
//			helper.getBrowser().driver.
//			findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).
//			click();
//			
//			//Thread.sleep(5000);
//			
//			////// Allert 
//			Alert alert = helper.getBrowser().driver.switchTo().alert();
//			alert.accept();
			
			
			
			////// Alert That  SHow OK-Cancel Button 
//			helper.getBrowser().driver.
//			findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"))
//			.click();
//			Alert alert = helper.getBrowser().driver.switchTo().alert(); //////
//			//alert.accept();
//			alert.dismiss();

			// Alert That  SHow TExt box In it  
			helper.getBrowser().driver.
			findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"))
			.click();

			Alert alert = helper.getBrowser().driver.switchTo().alert();
	        String alertText = alert.getText();
	        System.out.println("Alert data: " + alertText);
        
	        alert.sendKeys("ABCDEF GH");

	        alert.accept(); 
	        //alert.dismiss();
	        
	        
	        ////// When I accept the Alert I want to 
	        
	        	        
		} catch(Exception e) {
			
			e.printStackTrace();
		}
	}

	@Then("^I can Accept the Alert and get result$")
	public void i_can_Accept_the_Alert() {

		String alertREsult = helper.getBrowser().driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		System.out.println(alertREsult);
		
		
	}
	
	
}
