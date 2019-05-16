Feature: Verification Of Filters in Home Page

Scenario: Verify the Filters on Results

Given User Slides the price
Then Lowest price tour should be adjusted
And Highest price tour should be adjusted
Given User Selects the Tours with Promotions
Then Only Tours with Promotions are displayed