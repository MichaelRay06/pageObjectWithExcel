package testcasesRunner;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testCases.XlsEditNamePage;
import testCases.XlsLoginPage;
import testCases.XlsProSearchPage;
import utillity.InheritClass;

@Listeners(listinerDemo.TestNGListener.class)
public class RunXlsLoggerPage  extends InheritClass{


	@Test(dataProvider= "XlsDProvider")
	public void testXLSlogger( String LoggedEmail , String LoggedPasswd, String firstName, String ItemName ){
		 System.out.println("LoggedEmail is:"+LoggedEmail +"LoggedPasswd is:" + LoggedPasswd +"firstName is:" + firstName );

		
		XlsLoginPage xlsLogger =PageFactory.initElements(driver, XlsLoginPage.class);
		XlsEditNamePage editName =xlsLogger.invalidLoggedIn(LoggedEmail, LoggedPasswd);
		XlsProSearchPage proSearch= editName.EditmyFirstName(firstName);
		proSearch.searchIttem(ItemName);
		
	
	
	
	}
	
	@DataProvider(name="XlsDProvider")
	public Object[][]getData(){
		//ExcelLiabary readData= new ExcelLiabary ("C://Users//User//androidworkspace//POMCarwale//CarwaleProjectPOM//src//ExcelData//GuruShopTestData.xlsx");
		//int rows=readData.getRowCount(0);
		
		Object[][]  data= new Object[2][4];
			
		{

			data[0][0]="its.thakur10@gmail.com";
			data[0][1]="sonsofgod";
			data[0][2]="Michael";
			data[0][3]="beloved";
		}
		
	    data[1][0]="its.thakur10@gmail.com";
		data[1][1]="sonsofgod";
		data[1][2]="segun";
		data[1][3]="Speed";
		return data;
		
	
	}

}
	
	
	
	
	
	
	


/*@DataProvider(name="XlsDProvider")
public Object[][]getData(){
	ExcelLiabary readData= new ExcelLiabary ("C://Users//User//androidworkspace//POMCarwale//CarwaleProjectPOM//src//ExcelData//GuruShopTestData.xlsx");
	int rows=readData.getRowCount(0);
	
	Object[][]  data= new Object[rows][4];
	for(int i=0; i<rows; i++)
		
	{

		data[i][0]=readData.getData(0, i, 0);
		data[i][1]=readData.getData(0, i, 1);
		data[i][2]=readData.getData(0, i, 2);
		data[i][3]=readData.getData(0, i, 3);
	}
	return data;
}
}*/



		
	


