package LocatorsORConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	static WebDriver driver;
	//Constructor
	public HomePage(WebDriver driver) {
		this.driver= driver;
	}
	//identify WebElements
	By title = By.xpath("//div[@class=\"primary_header\"]//div[@class=\"app_logo\"]");
	By allItems = By.xpath("//button[@id=\"react-burger-menu-btn\"]");
	By about = By.xpath("//nav[@class=\"bm-item-list\"]//a[2]");
	By search = By.xpath("//div[@class=\"css-u4p24i\"]//div[@class=\"MuiBox-root css-vxcmzt\"]");
	By typeInSearchFld = By.xpath("//input[@id=\"search\"]");
	By closeSearch = By.xpath("//div[@class=\"css-u4p24i\"]//div[@class=\"MuiBox-root css-1anwfkt\"]");
	
	//Methods to perform actions on Locators
	public String VerifyTitle() {
		String str =driver.findElement(title).getText();
		return str;
	}
	public void clickOnAllItems() {
		driver.findElement(allItems).click();
	}
	public void clickOnAbout() {
		driver.findElement(about).click();
	}
	public void clickOnSearchBtn() {
		driver.findElement(search).click();
	}
	public void typeInSearch() {
		driver.findElement(typeInSearchFld).sendKeys("Selenium Jenkins");
	}
	public void closeSearchfld() {
		driver.findElement(closeSearch).click();
	}
	
	

}
