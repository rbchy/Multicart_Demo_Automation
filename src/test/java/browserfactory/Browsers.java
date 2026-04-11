package browserfactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {

	///// The Main Driver to Run all the Test is creaed Here...
	public WebDriver driver;

	public void createBrowserbrowserName(String browserName) {
		
		
		if (browserName.equals("chrome")) {
			//WebDriverManager.chromedriver().setup();

			// System.setProperty("webdriver.chrome.driver",
			// "/Users/rasulm/eclipse-workspace/PNTJULY2021BATCH/salarycalculator-test-automation/drivers/chromedriver");

			// System.out.println(System.getProperty("user.dir"));
			// System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
			// + "/drivers/chromedriver");
			driver = new ChromeDriver();
			
			/////Implicit Wait ( Globally Wait ) /// Max when you dont see the element 
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			// System.setProperty("webdriver.chrome.driver",
			// "/Users/rasulm/eclipse-workspace/PNTJULY2021BATCH/salarycalculator-test-automation/drivers/chromedriver");
			// System.out.println(System.getProperty("user.dir"));
			// System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
			// + "/drivers/chromedriver");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		}
	}

	public void openURL(String url) {
		driver.get(url);
	}

}
