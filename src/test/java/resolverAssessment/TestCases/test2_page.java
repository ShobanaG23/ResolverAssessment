package resolverAssessment.TestCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import resolverAssessment.BaseClass.BaseClass;
import resolverAssessment.PageObjects.HomePage;

public class test2_page extends BaseClass{
			
	@Test
	public void test2() throws IOException {
		HomePage hp = new HomePage(driver);
		System.out.println("----------verifying_list_elements-------------------");
		//getting number of elemets in list
	    int Count = hp.verify_list_elements();
	    Assert.assertEquals(Count, 3, "list displayed does not contain 3 elements");
	    logger.info("Assertion done : List displayed contains 3 elements");
	    System.out.println("-------------verifying_list_item_value----------------");
	    //getting value of second element
   	    String second_item_val  = hp.verify_list_item_value();
	    Assert.assertEquals(second_item_val, "List Item 2");
	    logger.info("Assertion done : Value in the second list item is: "+second_item_val);
	    System.out.println("-------------------verifying_badge_value---------------");
	    //getting the badge value
	    int Badge_val =   hp.verify_badge_value();
	    Assert.assertEquals(Badge_val, 6 , " Badge value is not 6");
	    logger.info("Assertion done : Badge value displayed is :" + Badge_val);
	    //capturing screenshot
	    captureSrceenshot(driver, "test2");
	}
}