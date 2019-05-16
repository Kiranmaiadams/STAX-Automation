Feature: Verify view more functionality

Scenario: Verify View more functionality

Given Defaults count of results are in displayed initially
And View more Button is displayed for extra results
Then User should be able to see all the Results after clicking on it
When User clicks on Reset
Then Defaults count of results are in displayed initially
