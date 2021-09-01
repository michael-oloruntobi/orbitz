package swapTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.homePage;
import resources.base;

public class  newTest extends base {
	
	WebDriver driverx;
	
	JavascriptExecutor executor;
	
	String username;
	
	String emailadd;
	
	@BeforeTest
	public void basePageNavigation() throws IOException, InterruptedException {
		
		driverx = initializeDriver();
		
		driverx.get(prop.getProperty("url"));
		
		executor = (JavascriptExecutor) driverx;
		
		driverx.manage().window().maximize();
		

	}
	
	@Test
	public void testcase001_validateAttendeeList() throws InterruptedException {
		

	
		homePage homePages = new homePage(driverx);
		
		// Click Login Button
		
		homePages.getLogIn().click();
		
		//Enter Email address
		
		homePages.getInputEmail().sendKeys(prop.getProperty("username"));
		
		//Submit Email
		
		homePages.getSubmitButton().click();
		
		//Wait for pasword field to appear properly
		
		Thread.sleep(1000);
		
		//Input password
		
		homePages.getEnterPassword().sendKeys(prop.getProperty("password"));
		
		//Submit Login details
		
		homePages.getSubmitButton().click();
		
		//Naviagte to the Swapcard Demo event
		
		homePages.getDemo().click();
		
		//Click to view list of attendees
		
		homePages.getViewAttendees().click();
		
		//Search using the keyword LLC
		
		homePages.getSearchLLC().sendKeys(prop.getProperty("keyword"));
		
		//Wait for list to be fully displayed
		
		Thread.sleep(1500);
		
		//Store the filtered of attendees in a list
		
		List<WebElement> alist = driverx.findElements(homePages.attendees());
		
		
		//Validates that attendee list is not empty
		AssertJUnit.assertFalse(alist.isEmpty());
		
		//Validate all attendees with matching keywords are shown
		
		for(int i=0; i<alist.size(); i++) {
		
			AssertJUnit.assertTrue(alist.get(i).getText().contains("LLC"));
			System.out.println(alist.get(i).getText());
		
		
		}
		
		
		Thread.sleep(1000);
		
		//driverx.close();
	}
	
	
	@AfterTest
	public void fTeardown() {
	// closes all the browser windows opened by web driver
	driverx.quit();
	}
	
	
	

}
