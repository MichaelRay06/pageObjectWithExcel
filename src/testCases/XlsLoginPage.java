package testCases;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testcasesRunner.RunXlsLoggerPage;

public class XlsLoginPage {
	WebDriver driver;
	

public XlsLoginPage(WebDriver driver){
	this.driver=driver;
	}
        
        @Test(dataProvider= "XlsDProvider", dataProviderClass=RunXlsLoggerPage.class) 
		public XlsEditNamePage invalidLoggedIn( String LoggedEmail, String LoggedPasswd){
		 driver.findElement(By.cssSelector("u")).click();
		 driver.findElement(By.name("email_address")).sendKeys(LoggedEmail); 
		 driver.findElement(By.name("password")).sendKeys(LoggedPasswd);
		 driver.findElement(By.id("tdb5")).click();		
		 //String TitleExpected=  driver.getTitle();
		 
		 try{
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Assert.assertTrue( driver.findElement(By.xpath("//*[@id='bodyContent']/h1")).getText().contentEquals("Welcome to SoftwareTestingHelp.com eCommerce Live Project"));
		Assert.assertTrue (driver.findElement(By.xpath("//*[@id='tdb4']/span")).isDisplayed());
		 }catch(NoSuchElementException e4) {
			 System.out.println(e4.getMessage());
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 WebElement RegName= driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[1]/span"));
		
		WebElement register= RegName;
		 
		 try{ 
		
		RegName.getText();
		RegName.getTagName();
		RegName.getCssValue("class");
	    RegName.getAttribute("class");
		}catch(NoSuchElementException e5) {
	    
		System.out.println("getText is:" + RegName + e5);
	    System.out.println("getTagName is:" + RegName + e5);
	    System.out.println("getCssValue is:" + RegName  + e5);
	    System.out.println("RegElement is:" + RegName  + e5);
		
		}
			
		}
		 XlsEditNamePage xlsEdit=PageFactory.initElements(driver, XlsEditNamePage.class);
			return xlsEdit;
        
}
}

