package listinerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {

	@Override
	public void onFinish(ITestContext result) {
		System.out.println(" executed  test suits" +  result.getAllTestMethods());
		System.out.println(" executed  test suits" +  result.getPassedTests());	

	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("This test cases failed" +  result.SUCCESS_PERCENTAGE_FAILURE);	
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("This test cases failed" +  result.getName());	
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("This test cases skipped" +  result.getName());	
	}
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(" executed  test suits" +  result.getName());	

	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("This test cases passed" +  result.getTestName());	
	}
	@Override
	public void onStart(ITestContext arg0) {
	
		
	}

}
