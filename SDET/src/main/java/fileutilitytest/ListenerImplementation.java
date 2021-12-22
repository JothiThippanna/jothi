package fileutilitytest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


//Listeners is the important feature of the testNG which allows you to customize the logs and reports and it will listen to the testNG Listeners
//there are several Type of Listeners which will allow you to modifiy the testNG behaviour
//IAnnotation transformer, IAnnotation transformer2,IHookable,IInovkedMethodListener,IMethodIntercepator,Ireporter,ISuiteListener,ITestListener
//two different ways to implement 1.we can extend either TestListener Adapter and second way is to implement Interface ITestListener which have certain methods for implementation
//we can implement on class level as well as suite level

public class ListenerImplementation implements ITestListener
{

	/**public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}**/

	public void onTestFailure(ITestResult result) 
	{
		
        System.out.println("Test case failed and details are"+ result.getName());		
	}

	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test case skipped and details are"+ result.getName());
	}

	/**public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		System.out.println("Test case failed and details are"+ result.getName());
	}

	public void onTestFailedWithTimeout(ITestResult result) 
	{
		System.out.println("Test case failed and details are"+ result.getName());
	}**/

	public void onStart(ITestContext result) 
	{
		System.out.println("Test case are started and details are"+ result.getName());
	}

	public void onFinish(ITestContext result) 
	{
		System.out.println("Test case finished and details are"+ result.getName());
	}
	
	

}
