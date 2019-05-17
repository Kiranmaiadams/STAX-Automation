$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/TestCaseResources/4-Email Us.feature");
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
  "duration": 6088960713,
  "status": "passed"
});
formatter.match({
  "location": "EmailUsDefinitions.clicks_on_email_us()"
});
formatter.result({
  "duration": 7283412370,
  "status": "passed"
});
formatter.match({
  "location": "EmailUsDefinitions.provides_all_the_details()"
});
formatter.result({
  "duration": 816560353,
  "status": "passed"
});
formatter.match({
  "location": "EmailUsDefinitions.click_on_send_my_email()"
});
formatter.result({
  "duration": 98135868,
  "status": "passed"
});
formatter.match({
  "location": "EmailUsDefinitions.an_email_will_be_sent()"
});
formatter.result({
  "duration": 22245,
  "status": "passed"
});
});