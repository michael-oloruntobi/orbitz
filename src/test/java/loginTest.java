import org.testng.annotations.Test;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import pageObjects.homePage;
import resources.base;

public class loginTest extends base {

	WebDriver driverx;

	JavascriptExecutor executor;

	String username;

	String emailadd;

	@BeforeMethod
	public void basePageNavigation() throws IOException, InterruptedException {

		driverx = initializeDriver();

		driverx.get(prop.getProperty("url"));

		executor = (JavascriptExecutor) driverx;

		driverx.manage().window().maximize();

	}

	@Test
	public void testcase001_validateValidLoginDetails() throws InterruptedException {

		homePage homePages = new homePage(driverx);

		// Login as a user to the website

		homePages.logIN(prop.getProperty("username"), prop.getProperty("password"));

	
		// Enter destination Details

		homePages.enterDestination(prop.getProperty("destination"));

		String checkInDateSearchPage = homePages.getCheckInDateHome();

		String checkOutDateSearchPage = homePages.getCheckOutDateHome();

		String travelersInfoHome = homePages.getTravelersInfoHome();


		// Search 
		homePages.clickSearchSubmitButton().click();

		String checkInDateResultPage = homePages.getCheckInDateResult();

		String checkOutDateResultPage = homePages.getCheckOutDateResult();

		String travelersInfoResult = homePages.getTravelersInfoResult();


		//Assertion to validate Check In date is correct

		Assert.assertEquals(checkInDateSearchPage, checkInDateResultPage);

		//Assertion to validate Checkout date is correct

		Assert.assertEquals(checkOutDateSearchPage, checkOutDateResultPage);

		//Assertion to validate Number of passengers is correct

		Assert.assertTrue(travelersInfoResult.contains(travelersInfoHome));

		driverx.close();

	}
	
	@AfterTest
	public void fTeardown() {
		// closes all the browser windows opened by web driver
		driverx.quit();
	}

}
