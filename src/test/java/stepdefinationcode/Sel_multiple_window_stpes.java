package stepdefinationcode;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;

public class Sel_multiple_window_stpes {

	// Dependency injection
	A1StepCodeHelper helper;

	/** Constructor */
	public Sel_multiple_window_stpes(A1StepCodeHelper helper) {
		this.helper = helper;
	}


	@Given("^I click on new window button$")
	public void i_click_on_new_window_button() {
		helper.getBrowser().driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
	}

	@Given("^I can get the text from new window$")
	public void i_can_get_the_text_from_new_window() {

		// It will return the parent window name as a String
		String mainWindow = helper.getBrowser().driver.getWindowHandle();

		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> set = helper.getBrowser().driver.getWindowHandles();

		// Need Unload the parent so we can start from the First Child
		set.remove(mainWindow);

		Iterator<String> itr = set.iterator(); // 2 Items [ 1 Parent, 2 child
		while (itr.hasNext()) {

			String childWindow = itr.next(); // Give First Child Reference

			// Compare whether the main windows is not equal to child window. If not equal,
			// we will close.
			if (!mainWindow.equals(childWindow)) {
				
				//Switching to Child 
				helper.getBrowser().driver.switchTo().window(childWindow);
				
				String childText = helper.getBrowser().driver.findElement(By.xpath("//h3[contains(text(),'New Window')]"))
						.getText();

				System.out.println(childText);
				helper.getBrowser().driver.close(); // Closed the Switched Child
			}

		}

		// This is to switch to the main window
		helper.getBrowser().driver.switchTo().window(mainWindow);

	}

	@Given("^I get back to parent & print parents Heeading$")
	public void I_get_back_to_parent_print_parents_Heeading() {
		
		String parentHeading = helper.getBrowser().driver
				               .findElement(By
				               .xpath("//h3[contains(text(),'Opening a new window')]"))
				                .getText();
		System.out.println(parentHeading);
		
	}
	
}
