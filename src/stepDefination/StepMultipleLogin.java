package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import keyword.Keyword;
import pageObject.LoginPage;

public class StepMultipleLogin {
	LoginPage page;
	
	@Given("^user enter the url$")
	public void user_enter_the_url() throws Throwable {
		Keyword.selectAndOpenBrowser("chrome");
		Keyword.enterUrl("https://www.flipkart.com/");
		page = new LoginPage();
	}

	@When("^enter the userId \"([^\"]*)\"$")
	public void enter_the_userId(String username) throws Throwable {
		page.enterUserName(username);
	}

	@When("^enter the password \"([^\"]*)\"$")
	public void enter_the_password(String password) throws Throwable {
		page.enterPassword(password);
	}

	@Then("^all user should login on homepage$")
	public void all_user_should_login_on_homepage() throws Throwable {
		page.clickLogin();
	}


	}
