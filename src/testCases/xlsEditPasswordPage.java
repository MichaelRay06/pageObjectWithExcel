package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;

import testcasesRunner.RunPaswrdChangedPage;
import utillity.Element;

public class xlsEditPasswordPage {
	WebDriver driver;
	
	


@FindBy(how=How.XPATH, using=Element.EditCurrentPasswrd)
WebElement changeCurrentPaswrd;
@FindBy(how=How.XPATH, using=Element.EditNewPasswrd)
WebElement changeNewPaswrd;
@FindBy(how=How.XPATH, using=Element.EditConfirmPasswrd)
WebElement chamgeConfirmPaswrd;
@FindBy(how=How.XPATH, using=Element.EditPasswrdButton)
WebElement clickEditPasswrdButton;
@FindBy(how=How.XPATH, using=Element.VerifyPasswrdUpdate)
WebElement passwrodUpdate;


	public xlsEditPasswordPage(WebDriver driver){
	this.driver=driver;

}
	
@Test(dataProvider="xlsChangePasswrd", dataProviderClass=RunPaswrdChangedPage.class)
	public void updateMyPasswrd( String currentPassword,  String newPassword, String confirmPassword ){

changeCurrentPaswrd.clear();
changeCurrentPaswrd.sendKeys(currentPassword);
changeNewPaswrd.clear();
changeNewPaswrd.sendKeys(newPassword);
chamgeConfirmPaswrd.clear();
chamgeConfirmPaswrd.sendKeys(confirmPassword);
clickEditPasswrdButton.click();

Assert.assertTrue(driver.findElement(By.xpath("//*[@id='bodyContent']/table/tbody/tr/td")).getText().contentEquals(" Your password has been successfully updated."));
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@id='tdb4']/span")).click();
return ;




}

}





