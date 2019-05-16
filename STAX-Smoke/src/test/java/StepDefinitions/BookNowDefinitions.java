package StepDefinitions;

import Implementations.BookNowImpl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

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

	
}
