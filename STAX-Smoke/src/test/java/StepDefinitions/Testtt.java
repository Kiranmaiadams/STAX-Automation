package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import cucumberOptions.TestRunner;

@Test
public class Testtt extends TestRunner {

	
	 @Given("^a number a printed$")
	    public void a_number_a_printed() throws Throwable {
	       System.out.println("Test works");
	    }

	@Given("^User initilised browser$")
	public void user_initilised_browser() throws Throwable {
		//main();

	}

	@And("^opens the url$")
	public void opens_the_url() throws Throwable {
		
		STAXDriver.findElement(By.id("sortSelect")).click();
		STAXDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/select/option[2]")).click();
		
		}
	
	@Given("^user scrolls the page till reset is found$")
    public void user_scrolls_the_page_till_reset_is_found() throws Throwable {
		
    }

}
