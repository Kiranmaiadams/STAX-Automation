$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("1-Verify View More.feature");
formatter.feature({
  "line": 1,
  "name": "Verify view more functionality",
  "description": "",
  "id": "verify-view-more-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify View more functionality",
  "description": "",
  "id": "verify-view-more-functionality;verify-view-more-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Defaults count of results are in displayed initially",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "View more Button is displayed for extra results",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should be able to see all the Results after clicking on it",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks on Reset",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Defaults count of results are in displayed initially",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageDefinitions.defaults_count_of_results_are_in_displayed_initially()"
});
formatter.result({
  "duration": 86610765,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinitions.view_more_button_is_displayed_for_extra_results()"
});
formatter.result({
  "duration": 4289245303,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinitions.user_should_be_able_to_see_all_the_results_after_clicking_on_it()"
});
formatter.result({
  "duration": 75738425,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinitions.user_clicks_on_reset()"
});
formatter.result({
  "duration": 4316794472,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinitions.defaults_count_of_results_are_in_displayed_initially()"
});
formatter.result({
  "duration": 87688372,
  "status": "passed"
});
formatter.uri("2-Verify AutoSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the Autosearch complete function",
  "description": "",
  "id": "verify-the-autosearch-complete-function",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User searches for\u003cCountry\u003e with \u003cSearchString\u003e",
  "description": "",
  "id": "verify-the-autosearch-complete-function;user-searches-for\u003ccountry\u003e-with-\u003csearchstring\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User provides \u003cSearchString\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Seletcs the \u003cCountry\u003e fro the list",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Results should be displayed properly",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "navigate to Previous Page",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "verify-the-autosearch-complete-function;user-searches-for\u003ccountry\u003e-with-\u003csearchstring\u003e;",
  "rows": [
    {
      "cells": [
        "SearchString",
        "Country"
      ],
      "line": 11,
      "id": "verify-the-autosearch-complete-function;user-searches-for\u003ccountry\u003e-with-\u003csearchstring\u003e;;1"
    },
    {
      "cells": [
        "uni",
        "United Kingdom"
      ],
      "line": 12,
      "id": "verify-the-autosearch-complete-function;user-searches-for\u003ccountry\u003e-with-\u003csearchstring\u003e;;2"
    },
    {
      "cells": [
        "uni",
        "United Arab Emirates"
      ],
      "line": 13,
      "id": "verify-the-autosearch-complete-function;user-searches-for\u003ccountry\u003e-with-\u003csearchstring\u003e;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "User searches forUnited Kingdom with uni",
  "description": "",
  "id": "verify-the-autosearch-complete-function;user-searches-for\u003ccountry\u003e-with-\u003csearchstring\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User provides uni",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Seletcs the United Kingdom fro the list",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Results should be displayed properly",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "navigate to Previous Page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "uni",
      "offset": 14
    }
  ],
  "location": "HomePageDefinitions.user_provides(String)"
});
formatter.result({
  "duration": 81115883,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "United Kingdom",
      "offset": 12
    }
  ],
  "location": "HomePageDefinitions.seletcs_the_fro_the_list(String)"
});
formatter.result({
  "duration": 5909604666,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinitions.results_should_be_displayed_properly()"
});
formatter.result({
  "duration": 15316,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinitions.navigate_to_previous_page()"
});
formatter.result({
  "duration": 6309630485,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User searches forUnited Arab Emirates with uni",
  "description": "",
  "id": "verify-the-autosearch-complete-function;user-searches-for\u003ccountry\u003e-with-\u003csearchstring\u003e;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User provides uni",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Seletcs the United Arab Emirates fro the list",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Results should be displayed properly",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "navigate to Previous Page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "uni",
      "offset": 14
    }
  ],
  "location": "HomePageDefinitions.user_provides(String)"
});
formatter.result({
  "duration": 162579298,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "United Arab Emirates",
      "offset": 12
    }
  ],
  "location": "HomePageDefinitions.seletcs_the_fro_the_list(String)"
});
formatter.result({
  "duration": 5787276802,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinitions.results_should_be_displayed_properly()"
});
formatter.result({
  "duration": 15681,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinitions.navigate_to_previous_page()"
});
formatter.result({
  "duration": 5501329595,
  "status": "passed"
});
formatter.uri("3-Sort Order Test.feature");
formatter.feature({
  "line": 1,
  "name": "User Verifies the Sort Order Functionality",
  "description": "",
  "id": "user-verifies-the-sort-order-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User Verifies if the ort order is displayed properly \u003cSort Option\u003e",
  "description": "",
  "id": "user-verifies-the-sort-order-functionality;user-verifies-if-the-ort-order-is-displayed-properly-\u003csort-option\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User selects the \u003cSort Option\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Verify the Results for \u003cSort Option\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "user-verifies-the-sort-order-functionality;user-verifies-if-the-ort-order-is-displayed-properly-\u003csort-option\u003e;",
  "rows": [
    {
      "cells": [
        "Sort Option"
      ],
      "line": 12,
      "id": "user-verifies-the-sort-order-functionality;user-verifies-if-the-ort-order-is-displayed-properly-\u003csort-option\u003e;;1"
    },
    {
      "cells": [
        "Price (Low-High)"
      ],
      "line": 13,
      "id": "user-verifies-the-sort-order-functionality;user-verifies-if-the-ort-order-is-displayed-properly-\u003csort-option\u003e;;2"
    },
    {
      "cells": [
        "Price (High-Low)"
      ],
      "line": 14,
      "id": "user-verifies-the-sort-order-functionality;user-verifies-if-the-ort-order-is-displayed-properly-\u003csort-option\u003e;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "User Verifies if the ort order is displayed properly Price (Low-High)",
  "description": "",
  "id": "user-verifies-the-sort-order-functionality;user-verifies-if-the-ort-order-is-displayed-properly-\u003csort-option\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User selects the Price (Low-High)",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Verify the Results for Price (Low-High)",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Price (Low-High)",
      "offset": 17
    }
  ],
  "location": "HomePageDefinitions.user_selects_the(String)"
});
formatter.result({
  "duration": 21359925723,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (Low-High)",
      "offset": 23
    }
  ],
  "location": "HomePageDefinitions.verify_the_results_for(String)"
});
formatter.result({
  "duration": 659066410,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User Verifies if the ort order is displayed properly Price (High-Low)",
  "description": "",
  "id": "user-verifies-the-sort-order-functionality;user-verifies-if-the-ort-order-is-displayed-properly-\u003csort-option\u003e;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User selects the Price (High-Low)",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Verify the Results for Price (High-Low)",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Price (High-Low)",
      "offset": 17
    }
  ],
  "location": "HomePageDefinitions.user_selects_the(String)"
});
formatter.result({
  "duration": 21338920964,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (High-Low)",
      "offset": 23
    }
  ],
  "location": "HomePageDefinitions.verify_the_results_for(String)"
});
formatter.result({
  "duration": 634273070,
  "status": "passed"
});
formatter.uri("4-Email Us.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Email Us functionality",
  "description": "",
  "id": "verify-email-us-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify email is functionality",
  "description": "",
  "id": "verify-email-us-functionality;verify-email-is-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User Selects a lowest price tour",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Clicks on Email us",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Provides all the details",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click on Send My Email",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "An email will be sent",
  "keyword": "Then "
});
formatter.match({
  "location": "ToursDefinitions.user_selects_a_lowest_price_tour()"
});
formatter.result({
  "duration": 5506823384,
  "status": "passed"
});
formatter.match({
  "location": "EmailUsDefinitions.clicks_on_email_us()"
});
formatter.result({
  "duration": 6380333879,
  "status": "passed"
});
formatter.match({
  "location": "EmailUsDefinitions.provides_all_the_details()"
});
formatter.result({
  "duration": 296455240,
  "status": "passed"
});
formatter.match({
  "location": "EmailUsDefinitions.click_on_send_my_email()"
});
formatter.result({
  "duration": 82672669,
  "status": "passed"
});
formatter.match({
  "location": "EmailUsDefinitions.an_email_will_be_sent()"
});
formatter.result({
  "duration": 16045,
  "status": "passed"
});
formatter.uri("5-BookNow.feature");
formatter.feature({
  "line": 1,
  "name": "Verification Of Book Now functionality",
  "description": "",
  "id": "verification-of-book-now-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify whether the user is able to make a booking",
  "description": "",
  "id": "verification-of-book-now-functionality;verify-whether-the-user-is-able-to-make-a-booking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User clicks on Book Now",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Verify Cost Per Traveller",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Verify Max number of Passengers Count",
  "keyword": "And "
});
formatter.match({
  "location": "BookNowDefinitions.user_clicks_on_book_now()"
});
formatter.result({
  "duration": 6123963784,
  "status": "passed"
});
formatter.match({
  "location": "BookNowDefinitions.verify_cost_per_traveller()"
});
formatter.result({
  "duration": 32821,
  "status": "passed"
});
formatter.match({
  "location": "BookNowDefinitions.verify_max_number_of_passengers_count()"
});
formatter.result({
  "duration": 8022,
  "status": "passed"
});
});