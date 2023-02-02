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
		//getting values in the table
		hp.Handling_tables();
		roboMethod();		
		//getting the value in cel[2][2]
		String Value_InCell = hp.get_valueInCell();
		roboMethod();
		Assert.assertEquals(Value_InCell, "Ventosanzap", "values doesnt match");
		logger.info("Assertion done: Value in the cell is Ventosanzap");
		//capturing screenshot
		captureSrceenshot(driver, "test6");
	}
}
