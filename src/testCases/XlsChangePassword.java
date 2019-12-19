package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testcasesRunner.RunPaswrdChangedPage;
import utillity.Element;

public class XlsChangePassword {
	WebDriver driver;

public XlsChangePassword(WebDriver driver){
	this.driver=driver;
}

			
	
@FindBy(how=How.XPATH, using=Element.XAccMenu)
//@FindBy(xpath=Constants.AccMenu)
WebElement AccSetting;

@FindBy(how=How.XPATH,using =Element.changePasswdLink)
WebElement EditPasswdLink; 





@Test(dataProvider="xlsChangePasswrd", dataProviderClass= RunPaswrdChangedPage.class)
public xlsEditPasswordPage passwordChangeLink(String LoggedEmail, String LoggedPasswd) throws Exception{
	 driver.findElement(By.cssSelector("u")).click();
	 driver.findElement(By.xpath("//*[@id='bodyContent']/div[2]/div/form/table/tbody/tr[1]/td[2]/input")).sendKeys(LoggedEmail); 
	 driver.findElement(By.xpath("//*[@id='bodyContent']/div[2]/div/form/table/tbody/tr[2]/td[2]/input")).sendKeys(LoggedPasswd);
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.findElement(By.id("tdb5")).click();
	  AccSetting.click();
	  EditPasswdLink.click();
	 
	  xlsEditPasswordPage editPsswordPage =PageFactory.initElements(driver, xlsEditPasswordPage.class);
	  return editPsswordPage;
}
}
	  
	  
	  
	  
	  
	  