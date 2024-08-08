package in.redBus.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ADMIN\\eclipse\\RedBus\\src\\test\\resources\\FeatureFiles",
					glue = {"in.redBus.StepDefinition", "in.redBus.Hooks"},
					tags = "@Smoke and @Sanity",
					dryRun = false,
					monochrome = true,
					plugin = {"html:target", "json:target/report.json"})
public class TestRunner {
	//Folder Structure
	//maintaining dependencies easy
	//pom.xml - we can change dependency versions
	//build
	//maven goal - clean, test, install
	//command prompt execution
	//new code
}
