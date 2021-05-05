import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner1 { 
	public static void main(String[] args) {
		//1.although in eclipse there is built in plugin to run the test
		//2.below code is a programmatic approach to make test runner 
		System.out.println("Running test class...");
		Result result = JUnitCore.runClasses(TestMyJUnit.class);
		 System.out.println("Getting failure if it has....");
		 for(Failure failure : result.getFailures()) {
			 System.out.println(failure.toString()); 
System.out.println("----------------------------------");
		 }
System.out.println("Status :"+result.wasSuccessful()); 
} 
}