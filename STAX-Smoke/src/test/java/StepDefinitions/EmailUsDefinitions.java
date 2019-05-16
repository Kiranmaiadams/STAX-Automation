package StepDefinitions;

import Implementations.EmailUSImpl;
import Implementations.HomePageImpl;
import Implementations.LoginImpl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmailUsDefinitions {

	EmailUSImpl email = new EmailUSImpl();
	
	@Then("^An email will be sent$")
    public void an_email_will_be_sent() throws Throwable {
        
    }

    @And("^Clicks on Email us$")
    public void clicks_on_email_us() throws Throwable {
    	Thread.sleep(5000);
        email.ClickEmailUs();
    }

    @And("^Provides all the details$")
    public void provides_all_the_details() throws Throwable {
        email.EnterEmailDetails();
    }

    @And("^Click on Send My Email$")
    public void click_on_send_my_email() throws Throwable {
        email.ClickSendMyEmail();
    }
	
}