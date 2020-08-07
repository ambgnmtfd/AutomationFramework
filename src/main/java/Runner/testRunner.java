package Runner;

//import cucumber.api.junit.Cucumber;
//import org.junit.runner.RunWith;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;

/* Uncomment when running using JUnit
	//@RunWith(Cucumber.class)
 */

@CucumberOptions(
		features = "src/main/java/Features", //feature file path
		glue = {"stepDefinitions"}, //path of step definitions
		format = {"pretty", "html:test-outout"},
		dryRun = false, //always set as false to execute the test steps
		monochrome = true // generates console output into a readable format
		)

public class testRunner extends AbstractTestNGCucumberTests {

}
