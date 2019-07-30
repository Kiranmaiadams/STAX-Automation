package StepDefinitions;

import Implementations.BookNowImpl;
import Implementations.ToursImpl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BookNowDefinitions {

	BookNowImpl Book = new BookNowImpl();
	ToursImpl Tour = new ToursImpl();
	String TourPricePerPerson = null;

	@Given("^User clicks on Book Now$")
	public void user_clicks_on_book_now() throws Throwable {
		Thread.sleep(5000);
		TourPricePerPerson = Book.ClickBookNow();
		// Thread.sleep(15000);
	}

	@And("^Selects the Pay Deposit Option$")
	public void selects_the_pay_deposit_option() throws Throwable {
		Thread.sleep(4000);
		Book.selectPayDepositAmount();
	}

	@And("^Selects the Pay Full Amount Option$")
	public void selects_the_pay_full_amount_option() throws Throwable {
		
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
		Thread.sleep(10000);
		Tour.ClickNeedMoreTimeRB();
	}

	@And("^Click On Continue$")
	public void click_on_continue() throws Throwable {
		Thread.sleep(5000);
		Book.ClickContinue();
		Thread.sleep(5000);
	}

	@And("^Fills the passenger details$")
	public void fills_the_passenger_details() throws Throwable {
		Thread.sleep(5000);
		Book.EnterPassengerDetails();
	}

	@And("^Fills the Card Details and Billing Details$")
	public void fills_the_card_details_and_billing_details() throws Throwable {
		Book.EnterValidCardDetails();
		Book.EnterBillingDetails();
	}

	@And("^Accepts the Terms and Conditions$")
	public void accepts_the_terms_and_conditions() throws Throwable {
		Book.AcceptBookingTerms();
	}

	@And("^Complete The Booking$")
	public void complete_the_booking() throws Throwable {
		Thread.sleep(3000);
		Book.ClickBookAtCheckOut();
		Thread.sleep(10000);
	}

	@And("^Clicks On Hold Request$")
	public void clicks_on_hold_request() throws Throwable {
		Book.ClickHoldRequest();
	}

}
