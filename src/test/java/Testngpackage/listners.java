package Testngpackage;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class listners implements ITestListener {


	public void onTestStart(ITestResult result) {
		
		System.out.println("test started execution");
	}

	
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("test passed");
	}


	public void onTestFailure(ITestResult result) {
		
		System.out.println("test Failed");
	}

	
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped");
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}


	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	
	public void onStart(ITestContext context) {
		System.out.println("test suit stared");
	}


	public void onFinish(ITestContext context) {
		System.out.println("test suit finished execution");
	
	}
	
	
	
	
	
	
	
	

}
