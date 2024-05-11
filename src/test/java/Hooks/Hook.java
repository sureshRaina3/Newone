package Hooks;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import StepDefenitions.Amazon;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hook extends driverInitialising {  
	
	@Before
	public void before() {
		driver=new ChromeDriver();
	}
 
	@AfterStep
	public void AfterStep(Scenario scenario) {
		System.out.println("Hello");
		//File directory = new File("C:\\Users\\2252549\\eclipse-workspace\\SampleCucumber\\screenshots");
       // FileUtils.cleanDirectory(directory);
		//FileUtils.delete( );
		String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot tss =(TakesScreenshot)driver;
		File actual = tss.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\2252549\\eclipse-workspace\\SampleCucumber\\screenshots\\"+timeStamp+"_"+scenario.getName()+".png");
		try {
			FileUtils.copyFile(actual, dest);
			}
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("error occured while taking the screenshot");;
		}
	}
	@After
	public void after(Scenario scenario) {
		 driver.quit();
	}
	
}
