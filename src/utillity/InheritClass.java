package utillity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
@Listeners(listinerDemo.TestNGListener.class)
public class InheritClass {
	public static WebDriver driver;
	
	
	
	 @BeforeMethod
		public void SetsUp( ){
	  
	   			 System.setProperty("webdriver.chrome.driver","C://SoftwareTesting//Browsers//chromedriver.exe" );
	   				driver= new ChromeDriver();
	   		 
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("http://www.carguruji.com/shop/");
	  
	    }
	 


@AfterMethod
public void tearDown(){

driver.close();
driver.quit();

}
}
