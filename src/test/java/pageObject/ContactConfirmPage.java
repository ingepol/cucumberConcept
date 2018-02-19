package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactConfirmPage extends AbstractPage{

	public ContactConfirmPage(WebDriver driver) {
		super(driver);
	}
	
	public String getPageTitle(){
		return driver.findElement(By.cssSelector(".content h1")).getText();
	}

}
