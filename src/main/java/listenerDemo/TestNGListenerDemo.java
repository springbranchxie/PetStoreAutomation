package listenerDemo;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListenerDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		ITestListener.super.onTestStart(result);
		System.out.println("TestCases started and details are "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		ITestListener.super.onTestSuccess(result);
		System.out.println("TestCases success and details are "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		ITestListener.super.onTestFailure(result);
		System.out.println("TestCases failed and details are "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		ITestListener.super.onTestSkipped(result);
		System.out.println("TestCases skipped and details are "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	
}
