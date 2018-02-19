package cucumber.concept.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.concept.StartChromeDriver;

public class AdoptionSteps extends StartChromeDriver{
	
	@Then("^I set the start date to \"([^\"]*)\"$")
	public void i_set_the_start_date_to(String dropItem) throws Throwable {
		Select dropDown = new Select(getDriver().findElement(By.id("start_select")));
		dropDown.selectByVisibleText(dropItem);
	}
}
