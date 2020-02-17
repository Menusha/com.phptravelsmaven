$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginTests.feature");
formatter.feature({
  "line": 1,
  "name": "Test functionalities on login page of the application",
  "description": "",
  "id": "test-functionalities-on-login-page-of-the-application",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#senario01"
    }
  ],
  "line": 4,
  "name": "Verify if a user will be able to login with a valid username and valid password",
  "description": "",
  "id": "test-functionalities-on-login-page-of-the-application;verify-if-a-user-will-be-able-to-login-with-a-valid-username-and-valid-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open the Chrome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter valid Username and valid Password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify message and close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.open_the_Chrome_and_launch_the_application()"
});
formatter.result({
  "duration": 15223989600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enter_the_valid_Username_and_Password()"
});
formatter.result({
  "duration": 205574200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Click_on_the_login_button()"
});
formatter.result({
  "duration": 1091786600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Verify_error_alert_and_close_the_browser()"
});
formatter.result({
  "duration": 724174500,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 10,
      "value": "#senario02"
    }
  ],
  "line": 11,
  "name": "Verify if a user cannot login with a valid username and an invalid password",
  "description": "",
  "id": "test-functionalities-on-login-page-of-the-application;verify-if-a-user-cannot-login-with-a-valid-username-and-an-invalid-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "Open the Chrome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Enter invalid Username and valid Password",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Click on the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Verify message and close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.open_the_Chrome_and_launch_the_application()"
});
formatter.result({
  "duration": 17871968900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enter_invalid_Username_and_Valid_Password()"
});
formatter.result({
  "duration": 395871500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Click_on_the_login_button()"
});
formatter.result({
  "duration": 1087968800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Verify_error_alert_and_close_the_browser()"
});
formatter.result({
  "duration": 718920500,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 17,
      "value": "#senario03"
    }
  ],
  "line": 18,
  "name": "Verify the login page for both, when the field is blank and Login button is clicked",
  "description": "",
  "id": "test-functionalities-on-login-page-of-the-application;verify-the-login-page-for-both,-when-the-field-is-blank-and-login-button-is-clicked",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "Open the Chrome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Enter valid Username and invalid Password",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Click on the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Verify message and close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.open_the_Chrome_and_launch_the_application()"
});
formatter.result({
  "duration": 14337890800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enter_valid_Username_and_invalid_Password()"
});
formatter.result({
  "duration": 457565700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Click_on_the_login_button()"
});
formatter.result({
  "duration": 1096608000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Verify_error_alert_and_close_the_browser()"
});
formatter.result({
  "duration": 727039400,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 24,
      "value": "#senario04"
    }
  ],
  "line": 25,
  "name": "Verify the login page for both, when the field is blank and Login button is clicked",
  "description": "",
  "id": "test-functionalities-on-login-page-of-the-application;verify-the-login-page-for-both,-when-the-field-is-blank-and-login-button-is-clicked",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "Open the Chrome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "Enter empty Username and empty Password",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Click on the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Verify message and close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.open_the_Chrome_and_launch_the_application()"
});
formatter.result({
  "duration": 14700480800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enter_empty_Username_and_Password()"
});
formatter.result({
  "duration": 225323700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Click_on_the_login_button()"
});
formatter.result({
  "duration": 1372576700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Verify_error_alert_and_close_the_browser()"
});
formatter.result({
  "duration": 686889400,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 31,
      "value": "#senario05"
    }
  ],
  "line": 32,
  "name": "Verify user logout",
  "description": "",
  "id": "test-functionalities-on-login-page-of-the-application;verify-user-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "Open the Chrome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "Enter valid Username and valid Password",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "Click on the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Verify user logout succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.open_the_Chrome_and_launch_the_application()"
});
formatter.result({
  "duration": 14097368800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enter_the_valid_Username_and_Password()"
});
formatter.result({
  "duration": 354022600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Click_on_the_login_button()"
});
formatter.result({
  "duration": 1077824700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Verify_user_logout()"
});
formatter.result({
  "duration": 7395296500,
  "status": "passed"
});
});