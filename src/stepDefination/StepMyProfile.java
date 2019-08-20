package stepDefination;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import keyword.Constants;
import keyword.Keyword;
import pageObject.MyProfilePage;

public class StepMyProfile {
	MyProfilePage page;

	@Given("^user should on login page$")
	public void user_should_on_login_page() throws InterruptedException {

		System.out.println("Browser will open using login page: on runner file");
		page = new MyProfilePage();
		page.howerMouseOnUser();
	}

	@Then("^user hit on my profile link$")
	public void user_hit_on_my_profile_link() {
		Constants.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		page.clickOnMyProfile();

	}

	@Then("^user will update the information$")
	public void user_will_update_the_information() {
		page.clickAndEdit();
		page.editFirstName("Tejas");
		page.editLastName("Pokharkar");
		page.clickOnDeactivate();
		page.dontDeactivate();

	}

	@Then("^user will logout the flipcart$")
	public void user_will_logout_the_flipcart() {
		page.clickOnMyProfile();
		Keyword.navigate_Backward();
		//page.clickOnLogout();

	}

}
