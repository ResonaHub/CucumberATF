package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import keyword.Keyword;
import pageObject.LoginPage;
import utility.Logconfig;


public class StepLogin {
	Logconfig log = new Logconfig();
	LoginPage page; // = new LoginPage();
	{
		Keyword.selectAndOpenBrowser("chrome");
		Keyword.enterUrl("https://www.flipkart.com/");
		page = new LoginPage();
		log.info("Url will be opened");
		Keyword.maxiMizeWindow();

	}

	@Given("^User navigate to flipcart shopping$")
	public void user_navigate_to_flipcart_shopping() throws Throwable {
		System.out.println("Enter User & Password: ");
		log.info("User Nevigate on browser");

	}

	@SuppressWarnings("deprecation")
	@When("^user enter credential$")
	public void user_enter_credential()  {
		page.enterUserName("7020934512");
		log.fatal("User name invalid");
		page.enterPassword("kailas0101");
		log.error("User Should provide correct credential");
		
	}

	@Then("^user should on homepage$")
	public void user_should_on_homepage() throws Throwable {
		page.clickLogin();
		log.error("User should on homepage");
	
	}
}
