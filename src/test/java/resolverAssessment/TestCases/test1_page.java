package resolverAssessment.TestCases;

import java.io.IOException;
import java.net.StandardSocketOptions;

import org.testng.annotations.Test;

import resolverAssessment.BaseClass.BaseClass;
import resolverAssessment.PageObjects.HomePage;

public class test1_page extends BaseClass {
		
	@Test
	public void test1() throws IOException, InterruptedException {
		HomePage hp = new HomePage(driver);
		System.out.println("---------------verifying_elements-----------------------");
		//verifying the presence of login elements
		hp.verify_elements();
		System.out.println("-----------------Filling_login-------------------------");
		//capturing the screenshot after entering the login details
		captureSrceenshot(driver,"test1");
		//entering the login details
		hp.fill_login("shobana.g@gmail.com", "test123");
		captureSrceenshot(driver,"test1");
		//clicking the sign in button
		hp.click_button();
	}
}
