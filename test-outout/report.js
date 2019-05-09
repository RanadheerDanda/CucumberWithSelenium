$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("G:/Ranadheer Workspace/CucumberWithSelenium/src/main/java/features/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new deal scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of Login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "Dranadheer",
        "test@1234"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "test deal",
        "1000",
        "50",
        "10"
      ],
      "line": 13
    },
    {
      "cells": [
        "test deal2",
        "10000",
        "70",
        "10"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 8377315100,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.title_of_Login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 23670500,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 279114400,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3811229400,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 8175600,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_moves_to_new_contact_page()"
});
formatter.result({
  "duration": 2539075900,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_enters_contacts_details(DataTable)"
});
formatter.result({
  "duration": 1906841600,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 1235297000,
  "status": "passed"
});
});