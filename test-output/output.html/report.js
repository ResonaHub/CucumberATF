$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login flipcart",
  "description": "",
  "id": "login-flipcart",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "login on flipcart",
  "description": "",
  "id": "login-flipcart;login-on-flipcart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@LoginPage"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User navigate to flipcart shopping",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter credential",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should on homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_navigate_to_flipcart_shopping()"
});
formatter.result({
  "duration": 10788218900,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.sendKeys(Unknown Source)\r\n\tat pageObject.LoginPage.enterUserName(LoginPage.java:28)\r\n\tat stepDefination.Login.user_navigate_to_flipcart_shopping(Login.java:16)\r\n\tat ✽.Given User navigate to flipcart shopping(Login.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Login.user_enter_credential()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_should_on_homepage()"
});
formatter.result({
  "status": "skipped"
});
});