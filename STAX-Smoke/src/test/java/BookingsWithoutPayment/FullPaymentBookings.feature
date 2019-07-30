Feature: Verify whether the User is able to Make Full Payment Bookings

Scenario: Verify whether the User is able to make a Full Payment booking

Given User clicks on Reset Filter
And Selects the departure month as three months from now in filters
And User Selects a lowest price tour
And User clicks on Book Now
And Selects the Pay Full Amount Option
And Click On Continue
And Fills the passenger details
And Fills the Card Details and Billing Details
And Accepts the Terms and Conditions
And Complete The Booking
