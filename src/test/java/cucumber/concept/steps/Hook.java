package cucumber.concept.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.concept.StartChromeDriver;

public class Hook extends StartChromeDriver{

	@Before(order=0)
    public void beforeScenario(){
		init();
    }
	
	@After(order=0)
    public void afterScenario(){
		quiteDriver();
    }
}
