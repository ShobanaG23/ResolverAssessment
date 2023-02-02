package resolverAssessment.TestCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import resolverAssessment.BaseClass.BaseClass;
import resolverAssessment.PageObjects.HomePage;

public class test3_page extends BaseClass{

	@Test
	public void test3() throws IOException, AWTException {
		
	HomePage hp = new HomePage(driver);
	
	
	String Displayed_name = hp.Handling_FromDropdown();
	Assert.assertEquals(Displayed_name, "Option 1", "Both value doesnt match");
	logger.info("Assertion done : both value matches, displayed name is as per the requiremnet");
	
	hp.Select_FromDropDown();
	roboMethod();
	captureSrceenshot(driver, "test3");
	}
}
