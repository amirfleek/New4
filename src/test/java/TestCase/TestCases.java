package TestCase;

import java.io.File;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.Baseclass;
import LocatorsORConfig.HomePage;
import LocatorsORConfig.LoginPage;
@Listeners({listners.Listners.class})
public class TestCases extends Baseclass{
	
	public WebDriver driver;
	
	//create objects of all pages  you have in project, for Baseclass also
	//Classname Refrence variable(Baseclass base)
	Baseclass base;
	LoginPage L1;
	HomePage L2;
	
	@BeforeTest
	public void Aobjects() {
		base = new Baseclass();
		driver= base.initialize_driver();
	}
	@Test
	public void BLoginPage() {
		driver.get("https://www.saucedemo.com/");
		L1= new LoginPage(driver);
		L1.Enterusername();
		L1.Enterpassword();
		L1.ClickonLoginBtn();
		L2= new HomePage(driver);
		Assert.assertEquals(L1.verifyUrl(), "https://www.saucedemo.com/inventory.html");
		System.out.println("Url is verified");
		}
	@Test
	public void CHomePage() throws InterruptedException {
		Assert.assertEquals(L2.VerifyTitle(),"Swag Labs1");
		System.out.println("Tittle is Verified");
		L2.clickOnAllItems();
		L2.clickOnAbout();
		System.out.println("hii");
//		L2.clickOnSearchBtn();
//		L2.typeInSearch();
//		L2.closeSearchfld();
	}
//	@AfterMethod
//	  public void Screenshot() {
//		  try {
//			  TakesScreenshot scrShot =(TakesScreenshot)driver;
//				File src=scrShot.getScreenshotAs(OutputType.FILE);
//			
//				String destinationFile = System.getProperty("user.dir")+"\\reports\\failed2.png";
//			
//				FileUtils.copyFile(src, new File(destinationFile));
//		  } catch(Exception e) {
//			  e.printStackTrace();
//		  }
//	  }
}

