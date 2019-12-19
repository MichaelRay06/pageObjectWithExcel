package listinerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class mytestLitener implements ITestListener  {


	@Override
	public void onTestFailure(ITestResult testResult) {
		System.out.println("This test cases failed" +  testResult.getName() + testResult.getThrowable().getMessage());	
		
	}

	@Override
	public void onTestSkipped(ITestResult testResult) {
		System.out.println("This test cases skipped" +  testResult.getName());
		
	}

@Override
public void onTestSuccess(ITestResult testResult) {
	System.out.println("This test cases passed" +  testResult.getTestName());	
}

	@Override
	public void onTestStart(ITestResult testResult) {
		System.out.println(" executed  test suits" +  testResult.getName());
		
	
	}
		@Override
		public void onFinish(ITestContext testResult) {
			System.out.println(" executed  test suits" +  testResult.getAllTestMethods());
			System.out.println(" executed  test suits" +  testResult.getPassedTests());	

			
		}

		@Override
		public void onStart(ITestContext testResult) {
			// TODO Auto-generated method stub
		}
		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult testResult) {
			// TODO Auto-generated method stub
		
	}
}