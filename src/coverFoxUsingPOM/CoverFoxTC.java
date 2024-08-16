package coverFoxUsingPOM;

import java.time.Duration;

import org.bouncycastle.crypto.prng.drbg.DualECPoints;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CoverFoxTC {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		// create object of homePage

		CoverFoxHomePage home = new CoverFoxHomePage(driver);
		home.clickOnGenderButton();

		CoverFoxHealthPlanPage healthPlanPage = new CoverFoxHealthPlanPage(driver);
		healthPlanPage.clickOnNextButton();

		CoverFoxMemberDetailsPage memberDetailsPage = new CoverFoxMemberDetailsPage(driver);
		memberDetailsPage.handleAgeDropDown();
		memberDetailsPage.clickOnNextButton();

		CoverFoxAddressDetailsPage addressDertailsPage = new CoverFoxAddressDetailsPage(driver);
		addressDertailsPage.enterPincode();
		addressDertailsPage.enterMobileNumber();
		addressDertailsPage.clickOnContinueButton();

		Thread.sleep(4000);

		CoverFoxResultPage resultPage = new CoverFoxResultPage(driver);
		resultPage.validateBanners();

		Thread.sleep(4000);
		driver.close();

	}

}
