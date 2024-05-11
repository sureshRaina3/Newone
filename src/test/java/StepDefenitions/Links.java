package StepDefenitions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.driverInitialising;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Links extends driverInitialising {
	 
	List<WebElement>links;

	
	@Given("I am in the amazon Home page")
	public void iAmInTheAmazonHomePage() {
		
		driver.get("https://www.flipkart.com/");
		//screenshorts.sc(driver, "sc3");
		 
	}
	@When("I am in the Home page")
	public void iAmInTheHomePage() {
		links=driver.findElements(By.xpath("//a[@href]"));
	}
	@Then("I am printing in the mobile links")
	public void iAmPrintingInTheMobileLinks() {
		for (WebElement linkText: links) {
			String allLinks = linkText.getAttribute("href");
			System.out.println(allLinks);
			//driver.quit();
		}
	}
}
			