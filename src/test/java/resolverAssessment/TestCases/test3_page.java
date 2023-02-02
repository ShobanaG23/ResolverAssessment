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
		//getting the name displayed in dropdown
		String Displayed_name = hp.Handling_FromDropdown();
		Assert.assertEquals(Displayed_name, "Option 1", "Both value doesnt match");
		logger.info("Assertion done : Both value matches, displayed name is as per the requiremnet");
		//selecting option 3 in dropdown
		hp.Select_FromDropDown();
		//scrolling down to capture screenshot
		roboMethod();
		//capturing screenshot
		captureSrceenshot(driver, "test3");
	}
}
