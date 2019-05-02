Feature: Free CRM Login Feature
Scenario: Free CRM Login Test Scenario

Given User is already on login page
When title of Login page is Free CRM
Then user enters username and password
#And User enters password
Then user clicks on login button
Then user is on home page
Then Close the browser