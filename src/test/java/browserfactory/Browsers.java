package browserfactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * The main driver for every scenario is created here.
 * Selenium Manager (built into Selenium 4) downloads the matching driver, so no
 * driver binaries are kept in the repository. -Dheadless=true runs without a window.
 */
public class Browsers {

	public WebDriver driver;

	private static boolean headless() {
		return Boolean.parseBoolean(System.getProperty("headless", "false"));
	}

	public void createBrowserbrowserName(String browserName) {
		if (browserName.equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			if (headless()) {
				options.addArguments("-headless", "--width=1920", "--height=1080");
			}
			driver = new FirefoxDriver(options);
		} else {
			ChromeOptions options = new ChromeOptions();
			if (headless()) {
				options.addArguments("--headless=new", "--window-size=1920,1080", "--no-sandbox", "--disable-dev-shm-usage");
			}
			driver = new ChromeDriver(options);
		}
		// Implicit wait (global): the maximum time to wait when an element is not there yet
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public void openURL(String url) {
		driver.get(url);
	}
}
