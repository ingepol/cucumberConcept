package cucumber.concept.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.concept.StartChromeDriver;

public class PageSteps extends StartChromeDriver {

	WebDriver driver = getDriver();

	@Given("^I am on my zoo website$")
	public void shouldNavigateToZooSite() throws Throwable {
		driver.navigate().to("http://www.thetestroom.com/webapp/");
	}

	/*
	 * @When("^I navigation to Adoption$") public void
	 * shouldNavigateToAdopcion() throws Throwable {
	 * StartChromeDriver.getDriver().findElement(By.id("adoption_link")).click()
	 * ; }
	 * 
	 * @When("^I navigation to About$") public void shouldNavigateToAbout()
	 * throws Throwable {
	 * StartChromeDriver.getDriver().findElement(By.id("about_link")).click(); }
	 * 
	 * @When("^I navigation to Contact$") public void shouldNavigateToContact()
	 * throws Throwable {
	 * StartChromeDriver.getDriver().findElement(By.id("contact_link")).click();
	 * }
	 */

	@When("^I navigation to \"([^\"]*)\"$")
	public void shouldNavigateTo(String link) throws Throwable {
		driver.findElement(By.id(link.toLowerCase() + "_link")).click();
	}

	@When("^I click on ([^\"]*)$")
	public void shouldClickOn(String link) throws Throwable {
		driver.findElement(By.id(link)).click();
	}

	@Then("^I close the browser$")
	public void shouldCloseTheBrowser() throws Throwable {
		closeDriver();
	}
}
