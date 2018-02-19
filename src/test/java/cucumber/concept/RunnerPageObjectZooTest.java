package cucumber.concept;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty","html:target/cucumber" }, 
		glue = "cucumber.concept.steps", 
		features = "classpath:cucumber/PageObjectZooTest.feature",
		monochrome = true
)
public class RunnerPageObjectZooTest {

}


