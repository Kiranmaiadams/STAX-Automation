package StepDefinitions;

import Implementations.HomePageImpl;
import Implementations.LoginImpl;
import Implementations.ToursImpl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ToursDefinitions {
	
	ToursImpl Tour = new ToursImpl();
	
	 @Given("^User Selects a lowest price tour$")
	    public void user_selects_a_lowest_price_tour() throws Throwable {
	        Thread.sleep(5000);
	        Tour.SelectLowestPriceTour();
	    }
	 
	 @And("^Select the Highest Price Tour$")
	    public void select_the_highest_price_tour() throws Throwable {
	        
	    }
}