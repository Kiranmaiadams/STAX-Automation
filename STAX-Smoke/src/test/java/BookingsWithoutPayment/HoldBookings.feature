Feature: Verify whether the User is able to Make Hold Bookings

Scenario: Verify whether the User is able to make a hold booking

Given User clicks on Reset Filter
And Select the Highest Price Tour
And User clicks on Book Now
And Selects the Need more time RB
And Click On Continue
And Fills the passenger details
And Clicks On Hold Request
Then Hold Booking should be created

