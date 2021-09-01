package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

	public WebDriver driver;

	By logIn = By.xpath("//button[@class='sc-fjdhpX jRpNCu']");

	By inputEmail = By.xpath("//input[@id='lookup-email-input-id']");
	
	By submitButton = By.xpath("//button[@type='submit']");
	
	By enterPassword = By.xpath("//input[@id='login-with-email-and-password-password-id']");
	
	By demo = By.xpath("//span[contains(text(),'Swapcard Demo')]");
	
	By viewAttendees = By.xpath("//div[contains(text(),'Attendees')]");
	
	By searchLLC = By.xpath("//input[@placeholder='Search']");
	
	By attendees = By.xpath("//span[contains(text(),'LLC')]");
	
	
	
	
	
	
	By createAccountButton = By.xpath("//button[contains(text(),'Create Account')]");
	
	By successAlert = By.xpath("//div[contains(text(),'Signup Successful')]");
	
	public homePage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}

	public WebElement getLogIn() {

		return driver.findElement(logIn);
	}

	public WebElement getInputEmail() {

		return driver.findElement(inputEmail);
	}
	
	
	public WebElement getSubmitButton() {

		return driver.findElement(submitButton);
	}
	
	public By enterPassword() {

		return enterPassword;
	}	
	
	
	public WebElement getEnterPassword() {

		return driver.findElement(enterPassword);
	}	
	
	public WebElement getDemo() {

		return driver.findElement(demo);
	}	
	
	public WebElement getViewAttendees() {

		return driver.findElement(viewAttendees);
	}	
	
	
	public WebElement getSearchLLC() {

		return driver.findElement(searchLLC);
	}	
	
	public By attendees() {

		return attendees;
	}
	

	


}
