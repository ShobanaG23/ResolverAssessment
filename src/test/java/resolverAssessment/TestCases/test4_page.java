package resolverAssessment.TestCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import resolverAssessment.BaseClass.BaseClass;
import resolverAssessment.PageObjects.HomePage;

public class test4_page extends BaseClass{
	
	@Test
	public void test4() throws IOException, AWTException {
		HomePage hp = new HomePage(driver);
		//checking status of first button
		boolean FirstButton_status = hp.verify_firstButton();
		Assert.assertTrue(FirstButton_status, "butoon is not enabled");
		logger.info("Assertion done : First button is enabled");
		roboMethod();
		//checking status of second button
		boolean SecondButton_status  = hp.verify_secondButton();
		Assert.assertEquals(SecondButton_status, false , " Second button is enabled");
		logger.info("Assertion done : Second button is disabled");
		roboMethod();
		//capturing screenshot
		captureSrceenshot(driver, "test4");
		
	}

}
