package never.us.runnertests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty", "json:target/cucumber.json"},
		features = ".//Features/",
		glue = {"never.us.stepdefinition", "never.us.hook"},
		dryRun = false,
		tags = "@sanity"		
		
		
		)


public class MyRunner extends AbstractTestNGCucumberTests{

}
