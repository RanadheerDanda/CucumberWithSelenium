Feature: Free CRM Login Feature
Scenario: Free CRM Login Test Scenario

Given User is already on login page
When title of Login page is Free CRM
Then user enters username and password
#And User enters password
Then user clicks on login button
Then user is on home page
Then Close the browser

Scenario: Free CRM Login Test Scenario1

#WIthout examples keyword
Given User is already on login page
When title of Login page is Free CRM
Then user enters "Dranadheer" and "test@1234"
Then user clicks on login button
Then user is on home page
Then Close the browser

Scenario Outline: Free CRM Login Test Scenario1
#Scenario Outline
Given User is already on login page
When title of Login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then Close the browser

Examples:
		|  username  | password |
		| Dranadheer | test@1234 |
		| tom | Test@456 |
