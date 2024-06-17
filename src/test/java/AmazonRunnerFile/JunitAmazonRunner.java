package AmazonRunnerFile;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Features",
		glue= "StepDefenitions",stepNotifications=true,
		monochrome=true,
		dryRun = true,
		tags="@tag1"
		)


public class JunitAmazonRunner {

}
