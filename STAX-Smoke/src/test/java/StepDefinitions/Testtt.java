package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import cucumberOptions.TestRunner;

@Test
public class Testtt extends TestRunner {

	@Given("^User initilised browser$")
	public void user_initilised_browser() throws Throwable {
		//main();

	}

	@And("^opens the url$")
	public void opens_the_url() throws Throwable {
		
		STAXDriver.findElement(By.id("sortSelect")).click();
		STAXDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/select/option[2]")).click();
		
		}

}
