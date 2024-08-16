package coverFoxUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetailsPage {

	@FindBy(className = "mp-input-text")
	private WebElement pinCodeField;

	@FindBy(id = "want-expert")
	private WebElement mobileNumberField;

	@FindBy(className = "next-btn")
	private WebElement continueButton;

	public CoverFoxAddressDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterPincode() {
		pinCodeField.sendKeys("411046");
	}

	public void enterMobileNumber() {
		mobileNumberField.sendKeys("9421357890");
	}

	public void clickOnContinueButton() {
		continueButton.click();
	}
}
