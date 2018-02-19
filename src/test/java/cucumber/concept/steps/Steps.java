package cucumber.concept.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	@Given("^I navigated to the zoo website$")
	public void shouldNavigationToZoo 	() throws Throwable {
		System.out.println("executed the navigated to zoo method");
	}

	@When("^I navigated to the adoption page$")
	public void shouldNavigationToAdoption() throws Throwable {
		System.out.println("executed the click on adoption link method ");
	}

	@Then("^I check to see that no animals  are available$")
	public void checkAnimalStringVisible() throws Throwable {
		System.out.println("check that the no animals string was visible or not");
	}
	
	@When("^I navigated to the about page$")
	public void shouldNavigationToAbout() throws Throwable {
		System.out.println("executed the click to about link method");
	}
}
