package cucumber.concept.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.concept.StartChromeDriver;
import pageObject.ContactConfirmPage;
import pageObject.ContactPage;
import pageObject.LandingPage;

public class ContactSteps extends StartChromeDriver {

	WebDriver driver = getDriver();
	LandingPage landigPage;
	ContactPage contactPage;
	ContactConfirmPage contactConfirmPage;

	@When("^populate the contact forms$")
	public void shouldPopulateContactForm() throws Throwable {
		driver.findElement(By.name("name_field")).sendKeys("Paul Arenas");		
		driver.findElement(By.name("address_field")).sendKeys("Happy Land");
		driver.findElement(By.name("postcode_field")).sendKeys("A1 S22");
		driver.findElement(By.name("email_field")).sendKeys("iWillSubscribe@tothis.channel");
		driver.findElement(By.id("rdona")).click();
		driver.findElement(By.id("cadop")).click();
		//driver.findElement(By.id("submit_message")).click();
		contactPage = new ContactPage(driver);
		contactConfirmPage = contactPage.submitForm();
	}

	@When("^I submit the form with valid data$")
	public void submitContacForm(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		driver.findElement(By.name("name_field")).sendKeys(data.get(1).get(1));
		driver.findElement(By.name("address_field")).sendKeys(data.get(2).get(1));
		driver.findElement(By.name("postcode_field")).sendKeys(data.get(3).get(1));
		driver.findElement(By.name("email_field")).sendKeys(data.get(4).get(1));
		//driver.findElement(By.id("submit_message")).click();
		contactPage = new ContactPage(driver);
		contactConfirmPage = contactPage.submitForm();
	}

	/*
	 * @When("^I enter \"([^\"]*)\" into the name field$") public void
	 * i_enter_into_the_name_field(String value) throws Throwable {
	 * //driver.findElement(By.name("name_field")).sendKeys(value); contactPage
	 * = new ContactPage(driver); contactPage.setNameField(value); }
	 * 
	 * @When("^I enter \"([^\"]*)\" into the address field$") public void
	 * i_enter_into_the_address_field(String value) throws Throwable {
	 * //driver.findElement(By.name("address_field")).sendKeys(value);
	 * contactPage.setAddressField(value); }
	 * 
	 * @When("^I enter \"([^\"]*)\" into the postcode field$") public void
	 * i_enter_into_the_postcode_field(String value) throws Throwable {
	 * //driver.findElement(By.name("postcode_field")).sendKeys(value);
	 * contactPage.setPostCodeField(value); }
	 * 
	 * @When("^I enter \"([^\"]*)\" into the email field$") public void
	 * i_enter_into_the_email_field(String value) throws Throwable {
	 * //driver.findElement(By.name("email_field")).sendKeys(value);
	 * contactPage.setEmailsField(value); }
	 * 
	 * 
	 */

	@When("^I populate the entire form$")
	public void i_populate_the_entire_form() throws Throwable {
		contactPage = new ContactPage(driver);
		contactPage.setNameField("name").setAddressField("address").setPostCodeField("postCode")
				.setEmailsField("email");

	}

	@When("^I submit the contact form$")
	public void i_submit_the_contact_form() throws Throwable {
		contactConfirmPage = contactPage.submitForm();
	}

	@Then("^I should be on the contact confirmation page$")
	public void checkOnContactConfirmationPage() throws Throwable {
		Assert.assertTrue("Not on contact confirmation page ",
				contactConfirmPage.getPageTitle().contains("We have your message"));
	}
}
