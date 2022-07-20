package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {

	public WebDriver driver;

	By form_link_xpath = By.xpath("//a[contains(text(),'Form Authentication')]");

	By username_textbox_xpath = By.xpath("//input[@id='username']");

	By password_textbox_xpath = By.xpath("//input[@id='password']");

	By submit_button_xpath = By.xpath("//button[@class='radius']");

	By successAlert = By.xpath("//div[@id='flash']");

	public homePage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}

	public void clickFormlink() {

		driver.findElement(form_link_xpath).click();
	}

	public void enterUsername(String username) {

		driver.findElement(username_textbox_xpath).sendKeys(username);
		;
	}

	public void EnterPassword(String password) {

		driver.findElement(password_textbox_xpath).sendKeys(password);
		;
	}

	public void clickSubmitButton() {

		driver.findElement(submit_button_xpath).click();
	}

	public String successMessage() {

		return driver.findElement(successAlert).getText();
	}

}
