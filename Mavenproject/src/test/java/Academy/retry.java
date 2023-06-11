package Academy;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retry implements IRetryAnalyzer {
	
	int count=0;
	int retry=3;

	public boolean retry(ITestResult result) {
		
		if(count<retry) {
			
			count++;
			return true;
		}
		
		return false;
		// TODO Auto-generated method stub
	
		
	}

}
