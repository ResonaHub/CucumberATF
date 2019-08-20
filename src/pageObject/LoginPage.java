package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import keyword.Constants;

public class LoginPage {
	public LoginPage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(Constants.driver, 5), this);
	}

	@FindBy(how = How.XPATH, using = "//input[@class='_2zrpKA _1dBPDZ']")
	WebElement username;

	@FindBy(how = How.XPATH, using = "//input[@type='password']")
	WebElement password;

	@FindBy(how = How.XPATH, using = "(//button[@type='submit'])[2]")
	WebElement click;

	public void enterUserName(String usrname) {
		username.sendKeys(usrname);
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);

	}

	public void clickLogin() {
		click.click();

	}

}
