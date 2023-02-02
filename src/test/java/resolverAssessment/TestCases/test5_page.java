package resolverAssessment.TestCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import resolverAssessment.BaseClass.BaseClass;
import resolverAssessment.PageObjects.HomePage;

public class test5_page extends BaseClass{
	
	@Test
	public void test5() throws IOException, AWTException {
		HomePage hp = new HomePage(driver);
		//Getting the message after clicking
		hp.Handling_button();
		String Success_Messsage = hp.Get_AlertMessage();
		Assert.assertEquals(Success_Messsage, "You clicked a button!", "Success message didnot match");
		logger.info("Assertion done : Success message matches as *You clicked a button!*");
		//checking if the button is disabled afer clicking
		boolean Button_disabled = hp.check_disabledButton();
		Assert.assertEquals(Button_disabled, false, "Button is enabled");
		logger.info("Assertion done : Button is disabled after clicking");
		roboMethod();
		//capturing screenshot
		captureSrceenshot(driver, "test5");
	}
}
