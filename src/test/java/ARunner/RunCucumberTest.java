package ARunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/",
		glue={"stepdefinationcode"},
		plugin = { "pretty", "html:target/cucumber-reports.html" },
		//tags = "@debug_may25",
		monochrome=true,
		snippets = SnippetType.CAMELCASE
		)

public class RunCucumberTest {

}
