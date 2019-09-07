$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("contact.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM create Contact",
  "description": "",
  "id": "free-crm-create-contact",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Free CRM create a new Contact Scenario",
  "description": "",
  "id": "free-crm-create-contact;free-crm-create-a-new-contact-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is already on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User hits the login",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User hits the Classic CRM button",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#  And user verify that title of login page is CRM PRO"
    }
  ],
  "line": 8,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user moves to new contact page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enter new \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003cposition\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user verifies he is in new contact page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "free-crm-create-contact;free-crm-create-a-new-contact-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "firstname",
        "lastname",
        "position"
      ],
      "line": 18,
      "id": "free-crm-create-contact;free-crm-create-a-new-contact-scenario;;1"
    },
    {
      "cells": [
        "christophodibo",
        "Tkogl1979",
        "christopher",
        "ovie",
        "Automation eng"
      ],
      "line": 19,
      "id": "free-crm-create-contact;free-crm-create-a-new-contact-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "Free CRM create a new Contact Scenario",
  "description": "",
  "id": "free-crm-create-contact;free-crm-create-a-new-contact-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is already on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User hits the login",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User hits the Classic CRM button",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#  And user verify that title of login page is CRM PRO"
    }
  ],
  "line": 8,
  "name": "user enters \"christophodibo\" and \"Tkogl1979\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user moves to new contact page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enter new \"christopher\" and \"ovie\" and \"Automation eng\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user verifies he is in new contact page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactStepDefinition.user_is_already_on_Login_page()"
});
formatter.result({
  "duration": 8301024499,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDefinition.user_hits_the_login()"
});
formatter.result({
  "duration": 4321358599,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDefinition.user_hits_the_Classic_CRM_button()"
});
formatter.result({
  "duration": 2743810900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "christophodibo",
      "offset": 13
    },
    {
      "val": "Tkogl1979",
      "offset": 34
    }
  ],
  "location": "ContactStepDefinition.user_enters_and(String,String)"
});
formatter.result({
  "duration": 291927701,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3703795700,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 17225400,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDefinition.user_moves_to_new_contact_page()"
});
formatter.result({
  "duration": 1463022301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "christopher",
      "offset": 16
    },
    {
      "val": "ovie",
      "offset": 34
    },
    {
      "val": "Automation eng",
      "offset": 45
    }
  ],
  "location": "ContactStepDefinition.user_enter_new_and_and(String,String,String)"
});
formatter.result({
  "duration": 668416800,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDefinition.user_click_on_save_button()"
});
formatter.result({
  "duration": 1721987400,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDefinition.user_verifies_he_is_in_new_contact_page()"
});
formatter.result({
  "duration": 176494101,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 69501,
  "status": "passed"
});
});