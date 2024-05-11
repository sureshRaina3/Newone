package StepDefenitions;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import Hooks.Hook;
import Hooks.driverInitialising;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon extends driverInitialising {

	Actions a;
	
	
@Given("^I am in the Amazon HomePage$")
public void i_am_in_the_amazon_homepage(){
	 
	//s.CreateTests("Amazon");
	driver.get("https://www.amazon.in/");
	//ExtentReportcreator.test.log(Status.SKIP ,null)
	//screenshorts.sc(driver, "sc1");

}

@When("^I clicks on Signin link$")
public void i_clicks_on_signin_link(){
	a= new Actions(driver);
	WebElement Signup = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	a.moveToElement(Signup).build().perform();
	WebElement clkSignup = driver.findElement(By.xpath("//*[text()='Sign in']"));
	clkSignup.click();
	//screenshorts.screen(driver, "sc2");
   
}
/*@And("^I Enter UserName\"([^\"]*)\" and password\"([^\"]*)\"$")
public void i_enter_usernamesomethingand_password_something(String strArg1, String strArg2) throws Throwable {
    WebElement Email = driver.findElement(By.xpath("//input[@id ='ap_email']"));
    Email.sendKeys(strArg1);
    Thread.sleep(2000);
    WebElement contineu =driver.findElement(By.xpath("//input[@id ='continue']"));
    contineu.click();
    WebElement Password = driver.findElement(By.xpath("//input[@id ='ap_password']"));
    Password.sendKeys(strArg2);
    Thread.sleep(2000);
}*/
@And("^I Enter UserName (.+) and password (.+)$")
public void i_enter_username_and_password(String username, String password) {
    System.out.println(username);
    System.out.println(password);
}


@Then("^I Navigated to Signin Page$")
public void i_navigated_to_signin_page() throws Throwable {
	String PageTitle = driver.getTitle();
	//SoftAssert a = new SoftAssert();
	//a.assertEquals(PageTitle, "Amazon Sign In");
	System.out.println(PageTitle);
	driver.quit();

    
}


}
