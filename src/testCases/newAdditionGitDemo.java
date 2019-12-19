package testCases;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import testcasesRunner.RunXlsLoggerPage;

public class newAdditionGitDemo {

	WebDriver driver;
	/*

	@FindBy(xpath=Element.AccEdit)               
	WebElement editAccInfo;

	@FindBy(name=Element.AccfirstNmae)
	WebElement editFirstName;

	@FindBy(id=Element.AccContinueButton)
	WebElement  editUpdateButton;
	*/


	
//LOG INTO SITE.
	public newAdditionGitDemo(WebDriver driver){
		this.driver=driver;
		}
	        //this is for git 
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
	        




//EDIT MY NAME
 @Test(dataProvider= "XlsDProvider", dataProviderClass= RunXlsLoggerPage.class)
public XlsProSearchPage EditmyFirstName( String firstName ){
/*	 driver.findElement(By.cssSelector("u")).click();
	 driver.findElement(By.name("email_address")).sendKeys(LoggedEmail); 
	 driver.findElement(By.name("password")).sendKeys(LoggedPasswd);
	 driver.findElement(By.id("tdb5")).click();*/
	 driver.findElement(By.cssSelector("#tdb3 > span.ui-button-text")).click();
	 try{
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 System.out.println("TestPASS:contained My Account Information" );
	Assert.assertTrue(driver.findElement(By.xpath("//*[@id='bodyContent']/h1")).getText().contains("My Account Information"));
	 }catch(Exception e6){
			System.out.println("TestFAIL: not contained: My Account Information " +e6);
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	 driver.findElement(By.linkText("View or change my account information.")).click();
	WebElement RegsName= driver.findElement(By.name("firstname"));
	String my_RegName= RegsName.getAttribute("value");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	 driver.findElement(By.name("firstname")).clear();
	 driver.findElement(By.name("firstname")).sendKeys(firstName);
	 driver.findElement(By.id("tdb5")).click();
	 

	 try {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Assert.assertTrue((driver.findElement(By.xpath("//*[@id='bodyContent']/table/tbody/tr/td")).isDisplayed()));
		System.out.println("Your account has been successfully updated.");
	} catch (NoSuchElementException e7) {
		System.out.println("TestFAIL: Your account not updated." +e7);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	 driver.findElement(By.cssSelector("#tdb3 > span.ui-button-text")).click();
	 Assert.assertEquals( firstName, my_RegName, "Edited name do not marched");
	System.out.println("Edited named matched");
	 } catch (Throwable Exception ) {
	driver.findElement(By.xpath("//*[@id='tdb3']/span[2]")).click();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
/*
driver.findElement(By.name("keywords")).sendKeys(ItemName);
driver.findElement(By.cssSelector("input[type=\"image\"]")).click();
driver.findElement(By.cssSelector("#tdb4 > span.ui-button-text")).click();*/

	
	 XlsProSearchPage prodSearch=PageFactory.initElements(driver, XlsProSearchPage.class);
		return prodSearch;
	
/*	 
editAccInfo.click();
editFirstName.clear();
editFirstName.sendKeys(firstName);
editUpdateButton.click();
XlsProSearchPage prodSearch=PageFactory.initElements(driver, XlsProSearchPage.class);
return prodSearch;*/

/*}

 @DataProvider(name="XlsDProvider")
 public Object[][]getData(){
 	//ExcelLiabary readData= new ExcelLiabary ("C://Users//User//androidworkspace//POMCarwale//CarwaleProjectPOM//src//ExcelData//GuruShopTestData.xlsx");
 	//int rows=readData.getRowCount(0);
 	
 	Object[][]  data= new Object[2][4];
 		
 	{

 		data[0][0]="its.thakur010@gmail.com";
 		data[0][1]="ashish123";
 		data[0][2]="Michael";
 		data[0][3]="beloved";
 	}
 	
	data[1][0]="its.thakur010@gmail.com";
		data[1][1]="ashish123";
		data[1][2]="segun";
		data[1][3]="Speed";
 	return data;*/
 }
 }






	

