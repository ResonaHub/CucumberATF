package stepDefination;

import org.openqa.selenium.StaleElementReferenceException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.BuyProduct;

public class StepBuyProduct {
	BuyProduct buy=new BuyProduct();
	@When("^user search the product on search box$")
	public void user_search_the_product_on_search_box() {
		buy.enterProductToSearch("FastTrack Watch for men");
	}

	@Then("^shows the all related product on the page$")
	public void shows_the_all_related_product_on_the_page() {
		try
		{
		buy.clickOnSelectedProduct();
		}
		catch(StaleElementReferenceException e) {
			buy.clickOnSelectedProduct();
		}
	}

	@Then("^user Select The Product$")
	public void user_Select_The_Product() {
		
		buy.getTitleOfTheproduct();
	}

	@And("^User Click On Add-Cart$")
	public void user_Click_On_Add_Cart() {
	}

	@Then("^Selected product should buy$")
	public void selected_product_should_buy() {
	}

}
