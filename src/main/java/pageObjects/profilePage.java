package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class profilePage {
	
	WebDriver driver;
	
	public profilePage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}
	
	
	By profileLink = By.xpath("//a[@href='/dashboard/settings']");
	
	By fullName = By.xpath("//input[@name='full_name']");
	
	By userName = By.xpath("//input[@name='username']");
	
	By updateDetailsButton = By.xpath("//button[contains(text(),'Update Details')]");
	
	By updateSuccessfulAlert = By.xpath("//div[contains(text(),'Update Successful')]");
	
	By securityTab = By.xpath("//a[contains(text(),'Security')]");
	
	By passwordInput1 = By.xpath("//input[@placeholder='Old Password']");

	By passwordInput2 = By.xpath("//input[@placeholder='New Password']");
	
	By changePasswordButton = By.xpath("//button[contains(text(),'Change Password')]");
	
	By changePasswordAlert = By.xpath("//div[contains(text(),'Password updated successfully')]");
	
	By logOut = By.xpath("//a[contains(text(),'Log Out')]");
	
	
	public By profileLink() {

		return profileLink;
	}
	
	public WebElement getProfileLink() {

		return driver.findElement(profileLink);
	}
	
	public WebElement getFullName() {

		return driver.findElement(fullName);
	}
	
	public WebElement getUserName() {

		return driver.findElement(userName);
	}
	
   public By updateDetailsButton(){
		
		return updateDetailsButton;
	}
	
	public WebElement getUpdateDetailsButton() {

		return driver.findElement(updateDetailsButton);
	}

	public By updateSuccessfulAlert(){
		
		return updateSuccessfulAlert;
	}
	
	public WebElement getUpdateSuccessfulAlert () {

		return driver.findElement(updateSuccessfulAlert);
	}
	
	public By securityTab() {

		return securityTab;
	}
	
	public WebElement getSecurityTab () {

		return driver.findElement(securityTab);
	}
	
	public WebElement getPasswordInput1() {

		return driver.findElement(passwordInput1);
	}
	
	public WebElement getPasswordInput2() {

		return driver.findElement(passwordInput2);
	}
	
	public WebElement getChangePasswordButton() {

		return driver.findElement(changePasswordButton);
	}
	
public By changePasswordAlert(){
		
		return changePasswordAlert;
	}
	
	public WebElement getChangePasswordAlert () {

		return driver.findElement(changePasswordAlert );
	}
	
	public WebElement getLogoutButton() {

		return driver.findElement(logOut);
	}
	
	

}
