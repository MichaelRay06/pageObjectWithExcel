package testcasesRunner;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testCases.XlsChangePassword;
import testCases.xlsEditPasswordPage;
import utillity.InheritClass;


@Listeners(listinerDemo.TestNGListener.class)
public class RunPaswrdChangedPage extends  InheritClass{
	
	@Test(dataProvider="xlsChangePasswrd")
  public void testChangePasswrd(String LoggedEmail, String LoggedPasswd, String currentPassword, String newPassword, String confirmPassword ) throws Exception{
		 System.out.println("Email is:"+LoggedEmail +"password is:" + LoggedPasswd );
		 System.out.println("currentPassword is:"+currentPassword +"newPassword is:" + newPassword +"confirmPassword is:" + confirmPassword );
		
		XlsChangePassword xlspsswrd=PageFactory.initElements(driver, XlsChangePassword.class);
		xlsEditPasswordPage xlsEditPawrd= xlspsswrd.passwordChangeLink(LoggedEmail, LoggedPasswd);
		xlsEditPawrd.updateMyPasswrd(currentPassword, newPassword, confirmPassword);
		
	 
  }
	//*** Element info: {Using=xpath, value=//*[@id='bodyContent']/div/div[1]/ul/li[3]/a}


@DataProvider(name="xlsChangePasswrd")
	
	public Object[][]getData(){
	Object[][] data =new Object[4][5];
	

	data[0][0]="its.thakur10@gmail.com";
	data[0][1]="sonsofgod";
	data[0][2]="sonsofgod";
	data[0][3]="ashish123";
	data[0][4]="ashish123";
	
	data[1][0]="its.thakur10@gmail.com";
	data[1][1]="ashish123";
	data[1][2]="ashish123";
	data[1][3]="sonsofgod";
	data[1][4]="sonsofgod";
	
	data[2][0]="its.thakur10@gmail.com";
	data[2][1]="sonsofgod";
	data[2][2]="sonsofgod";
	data[2][3]="ashish123";
	data[2][4]="ashish123";
	
	data[3][0]="its.thakur10@gmail.com";
	data[3][1]="ashish123";
	data[3][2]="ashish123";
	data[3][3]="sonsofgod";
	data[3][4]="sonsofgod";
			
return data;


}
}

	/*@DataProvider(name="XlsDProvider")
	public Object[][]getData(){
		//ExcelLiabary readData= new ExcelLiabary ("C://Users//User//androidworkspace//POMCarwale//CarwaleProjectPOM//src//ExcelData//GuruShopTestData.xlsx");
		//int rows=readData.getRowCount(0);
		
	

			
}*/