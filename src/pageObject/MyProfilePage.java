package pageObject;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import keyword.Constants;
import keyword.Keyword;

public class MyProfilePage {

	public MyProfilePage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(Constants.driver, 30), this);
	}

	@FindBy(how = How.XPATH, using = "(//*[@class='_14jSvk'])[1]")
	WebElement howerOnProfile;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'My Profile')]")
	WebElement myProfile;

	@FindBy(how = How.XPATH, using = "//span[@class='_1x4IU1']")
	WebElement clickEdit;

	@FindBy(how = How.NAME,using = "firstName")
	WebElement changeFirstName;

	@FindBy(how = How.NAME, using = "lastName")
	WebElement chnageLastName;

	@FindBy(how = How.XPATH, using = "//div[@class='_3uzK7o']")
	WebElement deactivate;

	@FindBy(how = How.XPATH, using = "//button[@class='_2AkmmA rAx-Sv']")
	WebElement clickSave;

	@FindBy(how = How.XPATH, using = "//button[@class='_2AkmmA _1ejljl']")
	WebElement dontDectivate;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Logout')]")
	WebElement logout;

	public void howerMouseOnUser() {
		Keyword.getAction().moveToElement(howerOnProfile).build().perform();
	}

	public void clickOnMyProfile() {
		try {
		myProfile.click();
		}
		catch(StaleElementReferenceException e) {
			myProfile.click();
		}
	}

	public void clickAndEdit() {
		clickEdit.click();
	}

	public void editFirstName(String fname) {
		changeFirstName.clear();
		changeFirstName.sendKeys(fname);
	}

	public void editLastName(String lname) {
		chnageLastName.clear();
		chnageLastName.sendKeys(lname);
	}

	public void clickSave() {
		clickSave.click();
	}

	public void clickOnDeactivate() {
		deactivate.click();
	}

	public void dontDeactivate() {
		dontDectivate.click();
	}
	
	public void clickOnLogout() {
		logout.click();
	}

}
