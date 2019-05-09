Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

Given User is already on login page
When title of Login page is Free CRM
Then user enters username and password
| Dranadheer | test@1234 |
Then user clicks on login button
Then user is on home page
Then user moves to new deal page
Then user enters deal details
| test deal | 1000 | 50 | 10 |
| test deal2 | 10000 | 70 | 10 |
Then Close the browser