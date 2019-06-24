package StepDefinitions;

import Implementations.HomeLeftImpl;
import Implementations.HomePageImpl;
import Implementations.LoginImpl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageDefinitions {

	HomePageImpl Home = new HomePageImpl();
	HomeLeftImpl HomeL = new HomeLeftImpl();
	LoginImpl basic = new LoginImpl();

	@Given("^User Checks Tours With Promotions$")
	public void user_checks_tours_with_promotions() throws Throwable {

	}

	@Then("^Only Tours With Promotions Should be Displayed$")
	public void only_tours_with_promotions_should_be_displayed() throws Throwable {

	}

	@And("^Promotion Data should be displayed correctly$")
	public void promotion_data_should_be_displayed_correctly() throws Throwable {

	}

	@Given("^User Slides the price$")
	public void user_slides_the_price() throws Throwable {
		HomeL.MovePriceSliderToLeft();
		Thread.sleep(6000);
		HomeL.MovePriceSliderToRight();
		Thread.sleep(10000);
	}

	@Then("^Lowest price tour should be adjusted$")
	public void lowest_price_tour_should_be_adjusted() throws Throwable {
		HomeL.VerifyLowestPriceAccordingToSlider();
	}

	@And("^Highest price tour should be adjusted$")
	public void highest_price_tour_should_be_adjusted() throws Throwable {
		Thread.sleep(3000);
		HomeL.VerifyHighestPriceAccordingToSlider();
	}
	
	
	@Given("^User Selects the Tours with Promotions$")
    public void user_selects_the_tours_with_promotions() throws Throwable {
        HomeL.SelectToursWithPromotions();
        Thread.sleep(2000);
    }
	
	@And("^Click on Reset Filters$")
    public void click_on_reset_filters() throws Throwable {
        HomeL.ClickOnResetFilters();
        Thread.sleep(8000);
    }

    @Then("^Only Tours with Promotions are displayed$")
    public void only_tours_with_promotions_are_displayed() throws Throwable {
        HomeL.VerifyToursWithPromotionsCount();
    }

	@Given("^User selects the (.+)$")
	public void user_selects_the(String sortoption) throws Throwable {
		Thread.sleep(2000);
		Home.SelectSortOption(sortoption);
		Thread.sleep(4000);
	}

	@Then("^Verify the Results for (.+)$")
	public void verify_the_results_for(String sortoption) throws Throwable {
		Thread.sleep(3000);
		if(sortoption.equalsIgnoreCase("Price (Low-High)")||sortoption.equalsIgnoreCase("Price (High-Low)")) {
		Home.VerifySortResults(sortoption);
		}
		else {
		Home.VerifySortResultsPerDay(sortoption);
		}
	}

	@Given("^Defaults count of results are in displayed initially$")
	public void defaults_count_of_results_are_in_displayed_initially() throws Throwable {
		Home.VerifyDefaultResultsCountInHomePage();
	}

	@And("^View more Button is displayed for extra results$")
	public void view_more_button_is_displayed_for_extra_results() throws Throwable {
		Home.VerifyViewMoreButton();
	}

	@Then("^User should be able to see all the Results after clicking on it$")
	public void user_should_be_able_to_see_all_the_results_after_clicking_on_it() throws Throwable {
		Home.VerifyViewMoreResults();
	}

	@When("^User clicks on Reset$")
	public void user_clicks_on_reset() throws Throwable {
		Thread.sleep(2000);
		System.out.println("Resettt");
		Home.ClickReset();
		Thread.sleep(2000);
	}

	@Given("^User provides (.+)$")
	public void user_provides(String searchstring) throws Throwable {
		Home.userSearchesonAutoSearch(searchstring);
	}

	@Then("^Results should be displayed properly$")
	public void results_should_be_displayed_properly() throws Throwable {
		// Thread.sleep(20000);

	}
	

    @Given("^User clicks on Reset Filter$")
    public void user_clicks_on_reset_filter() throws Throwable {
       
    }
	
	
	

	@And("^navigate to Previous Page$")
	public void navigate_to_previous_page() throws Throwable {
		Thread.sleep(7000);
		basic.navigateToPreviousPage();
	}

	@And("^Selects the (.+) from the list$")
	public void selects_the_from_the_list(String country) throws Throwable {
		Thread.sleep(5000);
		Home.userSearchesCountryFromAutoSearch(country);
	}
}
