package cucumber.concept.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.concept.StartChromeDriver;

public class PageTitleSteps extends StartChromeDriver {
	
	WebDriver driver = getDriver();
	
	/*@Then("^I check page title is Adoption$")
	public void checkTitleIsAdoption() throws Throwable {		
		Assert.assertTrue(StartChromeDriver.getDriver().getTitle().contains("Adoption"));
	}

	@Then("^I check page title is About$")
	public void checkTitleIsAbout() throws Throwable {
		Assert.assertTrue(StartChromeDriver.getDriver().getTitle().contains("About"));
	}

	@Then("^I check page title is Contact$")
	public void checkTitleIsContact() throws Throwable {
		Assert.assertTrue(StartChromeDriver.getDriver().getTitle().contains("Contact"));
	}*/
	
	@Then("^I check page title is \"([^\"]*)\"$")
	public void checkPageTitle(String title) throws Throwable {
		Assert.assertTrue(driver.getTitle().contains(title));
	}
	
	@Then("^I check I am on ([^\"]*)$")
	public void checkIAmOn(String title) throws Throwable {
		Assert.assertTrue(driver.getTitle().contains(title));
	}
	
	
	

	
}
