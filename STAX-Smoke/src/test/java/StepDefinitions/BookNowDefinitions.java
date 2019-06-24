package StepDefinitions;

import Implementations.BookNowImpl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BookNowDefinitions {

	BookNowImpl Book = new BookNowImpl();
	String TourPricePerPerson = null;
	
	 @Given("^User clicks on Book Now$")
	    public void user_clicks_on_book_now() throws Throwable {
		 Thread.sleep(5000);
		 TourPricePerPerson = Book.ClickBookNow();
	//	 Thread.sleep(15000);
	    }

	    @And("^Verify Cost Per Traveller$")
	    public void verify_cost_per_traveller() throws Throwable {
	        System.out.println("tour price per person" + TourPricePerPerson);
	    }

	    @And("^Verify Max number of Passengers Count$")
	    public void verify_max_number_of_passengers_count() throws Throwable {
	        
	    }

	    @Then("^Hold Booking should be created$")
	    public void hold_booking_should_be_created() throws Throwable {
	        
	    }

	    @And("^Selects the Need more time RB$")
	    public void selects_the_need_more_time_rb() throws Throwable {
	        
	    }

	    @And("^Click On Continue$")
	    public void click_on_continue() throws Throwable {
	        
	    }

	    @And("^Fills the passenger details$")
	    public void fills_the_passenger_details() throws Throwable {
	        
	    }

	    @And("^Clicks On Hold Request$")
	    public void clicks_on_hold_request() throws Throwable {
	        
	    }

	
}
