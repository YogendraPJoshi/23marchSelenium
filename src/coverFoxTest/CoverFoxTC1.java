package coverFoxTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import coverFoxBase.Base;
import coverFoxPOM.CoverFoxAddressDetailsPage;
import coverFoxPOM.CoverFoxHealthPlanPage;
import coverFoxPOM.CoverFoxHomePage;
import coverFoxPOM.CoverFoxMemberDetailsPage;
import coverFoxPOM.CoverFoxResultPage;
import coverFoxUtility.Utility;
@Listeners(coverFoxUtility.Listener.class)
public class CoverFoxTC1 extends Base {

	CoverFoxHomePage homePage;
	CoverFoxHealthPlanPage healthPlanPage;
	CoverFoxAddressDetailsPage addressDetailsPage;
	CoverFoxMemberDetailsPage memberDetailsPage;
	CoverFoxResultPage resultPage;
	String filePath;

	@BeforeTest
	public void launchBrowser() {
		openBrowser();
		homePage = new CoverFoxHomePage(driver);
		healthPlanPage = new CoverFoxHealthPlanPage(driver);
		addressDetailsPage = new CoverFoxAddressDetailsPage(driver);
		memberDetailsPage = new CoverFoxMemberDetailsPage(driver);
		resultPage = new CoverFoxResultPage(driver);
		filePath = "D:\\Velocity\\Java Class\\23 March 2024 Morning\\excelTest.xlsx";

	}

	@BeforeClass
	public void preConditions() throws InterruptedException, EncryptedDocumentException, IOException {
		homePage.clickOnGenderButton();
		Thread.sleep(1000);
		healthPlanPage.clickOnNextButton();
		Thread.sleep(1000);
		//memberDetailsPage.handleAgeDropDown(Utility.readDataFromExcel(filePath, "Sheet5", 0, 0));
		memberDetailsPage.handleAgeDropDown(Utility.readDataFromPropertiesFile("age"));
		memberDetailsPage.clickOnNextButton();
		Thread.sleep(1000);
		//addressDetailsPage.enterPincode(Utility.readDataFromExcel(filePath, "Sheet5", 0, 1));
		addressDetailsPage.enterPincode(Utility.readDataFromPropertiesFile("pinCode"));

		//addressDetailsPage.enterMobileNumber(Utility.readDataFromExcel(filePath, "Sheet5", 0, 2));
		addressDetailsPage.enterMobileNumber(Utility.readDataFromPropertiesFile("mobNum"));

		addressDetailsPage.clickOnContinueButton();
	}

	@Test
	public void validateBanners() throws InterruptedException {
		Thread.sleep(4000);
		Assert.fail();
		int bannerPlanNumbers = resultPage.getPlanNumersFromBanners();
		int StringplanNumbers = resultPage.getPlanNumersFromString();

		Assert.assertEquals(StringplanNumbers, bannerPlanNumbers,
				"Plans on banners not matching with results, TC failed");
	}

	@Test
	public void validatePresenceOfSortButton() throws InterruptedException, IOException {
		
		Thread.sleep(4000);
		Assert.fail();
		Assert.assertTrue(resultPage.sortPlanFilterIsDisplayed(), "Sort Plan filter is not displayed,TC is failed");

	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		browserClose();
	}
}
