package com.cio.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.cio.base.TestBase;

public class Retry extends TestBase implements IRetryAnalyzer {
	
	   private static final int    maxTry = 3;
	   private              int    count  = 0;

	@Override
	public boolean retry(final ITestResult result) {
		
		 if (!result.isSuccess ()) {
	           if (this.count < maxTry) {
	               log.info ("Retrying test " + result.getName () + " with status " + getResultStatusName (
	                   result.getStatus ()) + " for the " + (this.count + 1) + " time(s).");
	               this.count++;
	               return true;
	           }
	       }	
		// TODO Auto-generated method stub
		return false;
	}
	public String getResultStatusName (final int status) {
		   System.out.println("Test case status is "+status);
	       String resultName = null;
	       if (status == 1) {
	           resultName = "SUCCESS";
	           test.log(Status.PASS, "Test case status is "+status+" and test result is "+resultName);
	       }
	       if (status == 2) {
	           resultName = "FAILURE";
	           test.log(Status.FAIL, "Test case status is "+status+" and test result is "+resultName);
	       }
	       if (status == 3) {
	           resultName = "SKIP";
	           test.log(Status.SKIP, "Test case status is "+status+" and test result is "+resultName);
	       }
	       return resultName;
	   }
}
