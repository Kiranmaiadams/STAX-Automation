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
