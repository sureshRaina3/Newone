package AmazonRunnerFile;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Features",
		glue= "StepDefenitions",stepNotifications=true
		)


public class JunitAmazonRunner {

}
