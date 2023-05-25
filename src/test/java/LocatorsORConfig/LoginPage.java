package LocatorsORConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	static WebDriver driver;
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		}
	//Identify WebElements
	By username= By.xpath("//input[@id=\"user-name\"]");
	By password = By.xpath("//input[@id=\"password\"]");
	By loginBtn = By.xpath("//input[@id=\"login-button\"]");
	
	//Create methods to perform actions on locators
	public String verifyUrl() {
		String str =driver.getCurrentUrl();
		return str;
	}
	
	public void Enterusername() {
		driver.findElement(username).sendKeys("standard_user");
	}
	public void Enterpassword() {
		driver.findElement(password).sendKeys("secret_sauce");
	}
	public void ClickonLoginBtn() {
		driver.findElement(loginBtn).click();
	}

}
