package resolverAssessment.TestCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import resolverAssessment.BaseClass.BaseClass;
import resolverAssessment.PageObjects.HomePage;

public class test6_page extends BaseClass{
	
	@Test
	public void test6() throws IOException, AWTException, InterruptedException {
		
		HomePage hp = new HomePage(driver);
		roboMethod();
		hp.Handling_tables();
		roboMethod();		
		String Value_InCell = hp.get_valueInCell();
		roboMethod();
		Assert.assertEquals(Value_InCell, "Ventosanzap", "values doesnt match");
		logger.info("Assertion done: value in the cell is Ventosanzap");
		captureSrceenshot(driver, "test6");

		
	}

}
