package testCases;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

import testcasesRunner.RunXlsLoggerPage;
import utillity.Element;

public class XlsProSearchPage {
	WebDriver driver;
	public XlsProSearchPage(WebDriver driver){
		this.driver=driver;
	}

	@FindBy(name=Element.searchFild)
	WebElement prodName;
	@FindBy(how=How.CSS, using=Element.clikToSearch)
	WebElement searchProduct;
	@FindBy(how=How.LINK_TEXT, using=Element.prodName)
    WebElement verifyProdName;
	@FindBy(how=How.CSS, using=Element.prodImage)
	WebElement IsProdPresent;

	@Test(dataProvider= "XlsDProvider", dataProviderClass=RunXlsLoggerPage.class)
public void searchIttem( String ItemName){
		
	
	 new GregorianCalendar().getTime();
	prodName.clear();
	prodName.sendKeys(ItemName); 
		 searchProduct.click();
		 
		 
 try {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	 Assert.assertTrue (driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[1]/div[1]/div[2]/table/tbody/tr/td[2]/a")).isDisplayed());
	 	//Assert.assertTrue( verifyProdName.findElement(By.linkText(Element.prodName)).isDisplayed());
	 System.out.println("PASSED: search product DISPLAYED");
 } catch (ElementNotVisibleException e) {	
	 System.out.println("FAIL: search product not Found : product search class"+ e);
	 
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	 WebElement prodFound =driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[1]/div[1]/div[2]/table/tbody/tr/td[2]/a"));
	  Assert.assertEquals(prodFound.getAttribute("id"),ItemName,  "FAIL: Product Searched no matched Test Fail");
System.out.println("TESTPASSED:ItemName matched Product Searched");
 }catch (ElementNotFoundException e2) {	
	 System.out.println(e2.getAttributeName());
			 
			 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			 WebElement ImageProd= driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[1]/div[1]/div[2]/table/tbody/tr/td[1]/a/img"));
Assert.assertEquals(ImageProd.getAttribute("title"), ItemName, "FAIL: Product IMAGE Searched no matched Test Fail");
System.out.println("PASSED:  product image DISPLAYED");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

 }catch (NoSuchElementException eb) {	
	 System.out.println(eb.getMessage());
 }
	driver.findElement(By.xpath("//*[@id='tdb4']/span")).click();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	return;
	}
}
	
	
	


/*
  try{
	WebElement ProdSrch= driver.findElement(By.name(Element.searchFild));
   String atualProduct= ProdSrch.getAttribute("vale");
  
   
   
   System.out.println("searchFild Found Pass : product search class");
	}catch(NoSuchElementException e){
		System.out.println("searchFild Found Fail : product search class" + e.getMessage());
		
		 searchProduct.click();
		   try{
  WebElement prodFound =driver.findElement(By.linkText(Element.prodName));
  String ExpectedProduct=prodFound.getAttribute("");
	}catch(NoSuchElementException e1){

		
 
String atualProduct; String ExpectedProduct;
System.out.println("Actual:" + atualProduct + "Expected"+ ExpectedProduct);
  Assert.assertTrue(driver.findElement(By.linkText(Element.prodName)).isDisplayed());
  Assert.assertEquals(atualProduct, ExpectedProduct, "Product Searched no matched Test Fail");
  
  //OR
  Assert.assertEquals(prodFound.getAttribute(""),ItemName);
  new GregorianCalendar().getTime();
	}
          
   
 */
