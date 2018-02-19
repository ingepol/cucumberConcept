package cucumber.concept;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class StartChromeDriver {

	protected static WebDriver driver;
	private DesiredCapabilities capabilities = DesiredCapabilities.chrome();

	private void optionsConfiguration() {
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("profile.default_content_setting_values.notifications", 2);
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.addArguments("--disable-notifications");
		options.setExperimentalOption("prefs", prefs);
		capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	}

	protected void init() {
		if (null == driver) {
			optionsConfiguration();
			driver = new ChromeDriver(capabilities);
		}
	}

	protected WebDriver getDriver() {
		if (null == driver) {
			throw new IllegalStateException("No driver initialized");
		}
		return driver;
	}

	protected void closeDriver() {
		driver.close();

	}

	protected void quiteDriver() {
		driver.quit();
		driver = null;
	}
}
