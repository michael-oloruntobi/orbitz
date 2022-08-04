package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class homePage {

	public WebDriver driver;

	By sign_in_xpath = By.xpath("//button[contains(text(),'Sign in')]");

	By signIn_button_xpath = By.xpath("//a[@data-stid='link-header-account-signin']");

	By username_textbox_xpath = By.xpath("//input[@id='loginFormEmailInput']");

	By password_textbox_xpath = By.xpath("//input[@id='loginFormPasswordInput']");

	By submit_button1_xpath = By.xpath("//button[@id='loginFormSubmitButton']");

	By destination_xpath = By.xpath("//div[@data-stid='location-field-destination']");
			
	By destination_textbox_xpath = By.xpath("//input[@data-stid='location-field-destination-dialog-input']");

	By destination_button_xpath = By.xpath("//button[@data-stid='location-field-destination-result-item-button']");

	By submit_button_xpath = By.xpath("//button[@data-testid='submit-button']");

	By checkInSearchPage_xpath = By.xpath("//button[@id='d1-btn']");

	By checkOutSearchPage_xpath = By.xpath("//button[@id='d2-btn']");

	By checkInResultPage_xpath = By.xpath("//button[@id='hotels-check-in-btn']");

	By checkOutResultPage_xpath = By.xpath("//button[@id='hotels-check-out-btn']");

	By travelersInfoHome_xpath = By.xpath("//button[@data-testid='travelers-field-trigger']");

	By travelersInfoResult_xpath = By.cssSelector(".uitk-cell.s-cell-1-1.m-cell-1-4.l-cell-1-6.xl-cell-1-6");

	public homePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement clickSignInLink() {

		return driver.findElement(sign_in_xpath);
	}

	public WebElement clickSignInButton() {

		return driver.findElement(signIn_button_xpath);
	}

	public WebElement enterUsername() {

		return driver.findElement(username_textbox_xpath);
	}

	public WebElement enterPassword() {

		return driver.findElement(password_textbox_xpath);
	}

	public WebElement clickLoginSubmitButton() {

		return driver.findElement(submit_button1_xpath);
	}

	public WebElement DestinationInput() {

		return driver.findElement(destination_xpath);
	}

	public WebElement DestinationInput2() {

		return driver.findElement(destination_xpath);
	}

	public WebElement clickSearchSubmitButton() {

		return driver.findElement(submit_button_xpath);
	}

	public String getCheckInDateHome() {

		return driver.findElement(checkInSearchPage_xpath).getText();
	}

	public String getCheckOutDateHome() {

		return driver.findElement(checkOutSearchPage_xpath).getText();
	}

	public String getCheckInDateResult() {

		return driver.findElement(checkInResultPage_xpath).getText();
	}

	public String getCheckOutDateResult() {

		return driver.findElement(checkOutResultPage_xpath).getText();
	}

	public String getTravelersInfoHome() {

		return driver.findElement(travelersInfoHome_xpath).getText();
	}

	public String getTravelersInfoResult() {

		return driver.findElement(travelersInfoResult_xpath).getText();
	}

	public void logIN(String username, String password) throws InterruptedException {
		
		clickSignInLink().click();

		clickSignInButton().click();

		Thread.sleep(6000);

		enterUsername().sendKeys(username);

		enterPassword().sendKeys(password);

		clickLoginSubmitButton().click();
}

	public void enterDestination(String destination) {

		new Actions(driver)
				.click(DestinationInput())
				.sendKeys(DestinationInput2(), destination)
				.sendKeys(DestinationInput2(), Keys.ENTER)
				.build()
				.perform();
}






}
