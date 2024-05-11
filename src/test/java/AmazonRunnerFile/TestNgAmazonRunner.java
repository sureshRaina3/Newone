package AmazonRunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features="src/test/java/Features",
		glue= {"StepDefenitions"}, 
		snippets=SnippetType.CAMELCASE,
		monochrome=true,
		plugin =  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		)


public class TestNgAmazonRunner extends AbstractTestNGCucumberTests{
	
	
}
