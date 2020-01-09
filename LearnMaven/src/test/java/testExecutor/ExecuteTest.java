package testExecutor;



import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)   
@CucumberOptions(features = "src/test/resources/", glue = {"stepDef"},
plugin = {  "pretty", "html:target/cucumber-reports","json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml" }, monochrome = true)  
public class ExecuteTest {

	/*
	 * static WebDriver driver=null;
	 * 
	 * @BeforeClass public static void setUp() throws MalformedURLException {
	 * System.setProperty("webdriver.edge.driver",
	 * "src//test//resources//MicrosoftWebDriver.exe");
	 * 
	 * WebDriver driver = new EdgeDriver(); //for local check
	 * 
	 * }
	 * 
	 * @AfterClass public static void tearDown(){ driver.close(); }
	 */
	
}
