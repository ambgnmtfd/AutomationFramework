$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Website Login Feature",
  "description": "",
  "id": "free-crm-website-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Website Login Scenario",
  "description": "",
  "id": "free-crm-website-login-feature;free-crm-website-login-scenario",
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
  "name": "Title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 6987213400,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 22043300,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.User_enters_username_and_password()"
});
formatter.result({
  "duration": 583387600,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.User_clicks_on_login_button()"
});
formatter.result({
  "duration": 74677600,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.User_is_on_home_page()"
});
formatter.result({
  "duration": 25404600,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition.Close_the_browser()"
});
formatter.result({
  "duration": 5774089400,
  "status": "passed"
});
});