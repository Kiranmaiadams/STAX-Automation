package cucumberOptions;



import org.testng.annotations.BeforeGroups;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/BookingsWithoutPayment/TesttHooks.feature", 
glue = "StepDefinitions",  plugin = {"pretty","json:target/cucumber-report/cucumber.json"}, monochrome = true)


public class TestRunner2 extends AbstractTestNGCucumberTests {
	
	@BeforeGroups("Tour")
	public void a() {
		System.out.println("It works");
	}
	
	
}