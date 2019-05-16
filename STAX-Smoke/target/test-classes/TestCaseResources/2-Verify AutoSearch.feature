Feature: Verify the Autosearch complete function

Scenario Outline: User searches for<Country> with <SearchString>

Given User provides <SearchString>
And Seletcs the <Country> fro the list
Then Results should be displayed properly
And navigate to Previous Page

Examples:
|SearchString|Country|
|uni|United Kingdom|
|uni|United Arab Emirates|