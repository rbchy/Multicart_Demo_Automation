package stepdefinationcode;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Sel_frame_switching_Steps {

	// Dependency injection
	A1StepCodeHelper helper;

	/** Constructor */
	public Sel_frame_switching_Steps(A1StepCodeHelper helper) {
		this.helper = helper;
	}

	@Then("^I can acccess the Left Frame Text$")
	public void i_can_acccess_the_Left_Frame_Text() {

		///////// From Here you are in the Main Page 
		
		// Switching From Parent to frame-top
		helper.getBrowser().driver.switchTo().frame("frame-top");

		// Switching From frame-top to frame-Left
		helper.getBrowser().driver.switchTo().frame("frame-left");

		// Code to Find Out The Element
		String expText = helper.getBrowser().driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();

		System.out.println(expText);

	}

	@Then("^I can acccess the Middle Frame Text$")
	public void i_can_acccess_the_Middle_Frame_Text() {

		// Lets Get Back to Parent
		helper.getBrowser().driver.switchTo().defaultContent();

		// Switching From Parent to frame-top
		helper.getBrowser().driver.switchTo().frame("frame-top");

		// Switching From frame-top to frame-Middle
		helper.getBrowser().driver.switchTo().frame("frame-middle");

		// Code to Find Out The Element
		String expText = helper.getBrowser().driver.findElement(By.xpath("//div[@id='content']")).getText();

		System.out.println(expText);

	}

	@Then("^I can acccess the Right Frame Text by switching one by one$")
	public void i_can_acccess_the_Right_Frame_Text() {

		// Lets Get Back to Parent
		helper.getBrowser().driver.switchTo().defaultContent();

		// Switching From Parent to frame-top
		helper.getBrowser().driver.switchTo().frame("frame-top");

		// Switching From frame-top to frame-Right
		helper.getBrowser().driver.switchTo().frame("frame-right");

		// Code to Find Out The Element
		String expText = helper.getBrowser().driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText();

		System.out.println(expText);

	}

	@Given("^I Navigate to Iframe Page$")
	public void I_Navigate_to_Iframe_Page() {

		helper.getBrowser().driver.get("http://the-internet.herokuapp.com/iframe");
	}

	@Then("^I Also can acccess  Iframe$")
	public void I_Also_can_acccess_Iframe() {

		int size = helper.getBrowser().driver.findElements(By.tagName("iframe")).size();
		System.out.println("How Many Iframe is there " + size);

		helper.getBrowser().driver.switchTo().frame("mce_0_ifr"); // Switched By ID ...

		System.out.println("No Issue Switched Happen .");

		// To Do : There is a WYSWYG Input Box Need to Know How to Automate it
	}

}
