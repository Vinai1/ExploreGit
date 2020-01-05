package testExecutor;
   
import java.net.MalformedURLException;
import java.util.List;

import org.junit.BeforeClass;
import org.openqa.selenium.By;   
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;   
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;  

//protected static WebDriver driver;



public class CucumberStepDef {
	
	//System.setProperty("webdriver.edge.driver", driverPath+"MicrosoftWebDriver.exe");
	static WebDriver driver=null;
	@BeforeClass
	public static void setUp() throws MalformedURLException {
		System.setProperty("webdriver.edge.driver", "src/test/resources/MicrosoftWebDriver.exe");

	    driver =  new EdgeDriver(); //for local check
	    
	} 

	 
	@Given("the user on the user registration page.")   
	public void the_user_on_the_user_registration_page() {  
	      //Intiate web browser instance. driver = new FirefoxDriver();  
	      driver.navigate().to("https://www.javaTpoint.com/");   
	   }   
	      
	@When("user enter invalid data on the page")   
	public void user_enter_invalid_data_on_the_page(io.cucumber.datatable.DataTable dataTable) {   
	      //Initialize data table   
		   List<List<String>> data = dataTable.asLists(String.class) ;
	      System.out.println(data.get(1).get(1));   
	        
	      //Enter data  
	      driver.findElement(By.name("firstname")).sendKeys(data.get(1).get(1));  
	      driver.findElement(By.name("lastname")).sendKeys(data.get(2).get(1));  
	      driver.findElement(By.name("registered_email__")).sendKeys(data.get(3).get(1));       
	      driver.findElement(By.name("registered_email_confirmation__")).sendKeys(data.get(4).get(1));   
	      driver.findElement(By.name("registered_passwd__")).sendKeys(data.get(5).get(1));   
	        
	      Select dropdownB = new Select(driver.findElement(By.name("birth_day")));   
	      dropdownB.selectByValue("12");   
	          
	      Select dropdownM = new Select(driver.findElement(By.name("birth_month")));  
	      dropdownM.selectByValue("7");   
	          
	      Select dropdownY = new Select(driver.findElement(By.name("birth_year")));  
	      dropdownY.selectByValue("1992");   
	          
	      driver.findElement(By.className("_59mt")).click();   
	      // Click submit button driver.findElement(By.name("websubmit")).click();   
	   }   
	      
	@Then("the user registration should be successful.")  
	public void the_user_registration_should_be_successful() { 
	      if(driver.getCurrentUrl().equalsIgnoreCase("https://www.javaTpoint.com/")){  
	         System.out.println("Test Pass");   
	      } else {   
	         System.out.println("Test Failed");   
	      }   
	      driver.close();   
	   }   
	
	

}
