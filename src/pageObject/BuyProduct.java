package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import keyword.Constants;
import keyword.Keyword;

public class BuyProduct {

	public BuyProduct() {
		PageFactory.initElements(new AjaxElementLocatorFactory(Constants.driver, 10), this);
	}

	@FindBy(how = How.XPATH, using = "//input[@class='LM6RPg']")
	WebElement enterTextToSearch;

	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'NG38004PP06CJ Tees Analog Watch  - For Men')]")
	WebElement product;

	public void enterProductToSearch(String productName) {
		enterTextToSearch.sendKeys(productName);
		Keyword.getAction().sendKeys(Keys.ENTER).build().perform();
	}
	
	public void clickOnSelectedProduct() {
		product.click();
	}
	public void getTitleOfTheproduct() {
		product.getTagName();
	}
	
	
	
}
