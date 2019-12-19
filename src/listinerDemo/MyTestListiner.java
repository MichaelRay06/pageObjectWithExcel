package listinerDemo;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class MyTestListiner extends TestListenerAdapter {
	
	static MyTestResult testResults = new MyTestResult();
	
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("This test cases failed" +  result.getName());	
		testResults.increamentTestFailed();
		System.out.println("FAILLED TEST" +testResults.getTestPassed());
		
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("This test cases skipped" +  result.getName());
		testResults.increamentTestSkipped();
		System.out.println("SKIPPED TEST" +testResults.getTestSkipped());
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("This test cases passed" +  result.getTestName());	
		testResults.increamentTestPassed();
		System.out.println("PASSED TEST"  +testResults.getTestPassed());
		
	}
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(" TEST STARTS" +  result.getName());
	}
		@Override
		public void onFinish(ITestContext result) {
			System.out.println("TOTAL TESTS"+  result.getAllTestMethods());
			System.out.println(" executed  test suits" +  result.getPassedTests());	
			try {
				testResults.write();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				
			}
		


	}
		
}
	
		
	



