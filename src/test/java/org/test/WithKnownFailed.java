package org.test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class WithKnownFailed  implements IRetryAnalyzer
{
  int mincount=1,maxcount=5;
	@Override
	public boolean retry(ITestResult result) {
		if(mincount<maxcount) {
		mincount=mincount+1;
			return true;      //Test Fail condition pass
	}
		return false;   //Test pass condition fail

}
}