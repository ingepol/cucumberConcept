package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ContactPage extends AbstractPage {

	public ContactPage(WebDriver driver) {
		super(driver);
	}

	public ContactPage setNameField(String value) {
		driver.findElement(By.name("name_field")).sendKeys(value);
		return new ContactPage(driver);
	}

	public ContactPage setAddressField(String value) {
		driver.findElement(By.name("address_field")).sendKeys(value);
		return new ContactPage(driver);
	}

	public ContactPage setPostCodeField(String value) {
		driver.findElement(By.name("postcode_field")).sendKeys(value);
		return new ContactPage(driver);
	}

	public ContactPage setEmailsField(String value) {
		driver.findElement(By.name("email_field")).sendKeys(value);
		return new ContactPage(driver);
	}

	public ContactConfirmPage submitForm() {
		driver.findElement(By.id("submit_message")).click();
		return new ContactConfirmPage(driver);
	}
}
