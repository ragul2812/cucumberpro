$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/ForgottenPw.feature");
formatter.feature({
  "name": "",
  "description": " To validate forgotten password functionality of facebook application",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "to validate login using valid email and invalid password",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User have to enter facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click forgotten password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_forgotten_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter email",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to be in invalid credentials page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_be_in_invalid_credentials_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/Login.feature");
formatter.feature({
  "name": "",
  "description": " To validate login functionality of Facebook",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "to validate login using valid email and invalid password",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User have to eter fb login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_eter_fb_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter valid email and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_valid_email_and_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to be in invalid credentials page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_be_in_invalid_credentials_page()"
});
formatter.result({
  "status": "passed"
});
});