package Test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I successfully 	executed Listeners pass code");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("This test has been failed" +result.getName());
	}

}
