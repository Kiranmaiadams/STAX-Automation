Feature: Verify whether the User is able to Make Hold Bookings

@Group(Tour)
Scenario: Verify whether the User is able to make a hold booking
Given User clicks on Reset Filter
And Selects the departure month as three months from now in filters
And Select the Highest Price Tour
And User clicks on Book Now
And Selects the Need more time RB
And Click On Continue
And Fills the passenger details
And Clicks On Hold Request
Then Hold Booking should be created

