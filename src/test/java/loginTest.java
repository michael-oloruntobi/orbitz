import org.testng.annotations.Test;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
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

		// Click Form Aunthentication Link

		homePages.clickFormlink();

		// Enter Username

		homePages.enterUsername(prop.getProperty("username"));

		// Input password

		homePages.EnterPassword(prop.getProperty("password"));

		// Submit Email

		homePages.clickSubmitButton();

		// assert Success message

		String successM = homePages.successMessage();

		assertTrue(successM.contains(prop.getProperty("successMessage")));

		driverx.close();

	}

	@Test
	public void testcase002_validateInvalidLoginDetails() throws InterruptedException {

		homePage homePages = new homePage(driverx);

		// Click Form Aunthentication Link

		homePages.clickFormlink();

		// Enter Username

		homePages.enterUsername(prop.getProperty("invalidUsername"));

		// Input password

		homePages.EnterPassword(prop.getProperty("invalidPassword"));

		// Submit Email

		homePages.clickSubmitButton();

		// assert Success message

		String successM = homePages.successMessage();

		assertTrue(successM.contains(prop.getProperty("errorMessage")));

		driverx.close();

	}

	@AfterTest
	public void fTeardown() {
		// closes all the browser windows opened by web driver
		driverx.quit();
	}

}
