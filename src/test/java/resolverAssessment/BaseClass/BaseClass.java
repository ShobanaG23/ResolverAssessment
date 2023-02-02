package resolverAssessment.BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public Logger logger = LogManager.getLogger(this.getClass());

	@BeforeClass
	public void setup() throws IOException {
		// to initialize the .html file from the location
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\rarav\\eclipse-workspace\\resolverAssessment\\resources\\config.properties");
		prop.load(fis);
		//opening the chrome browser		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//getting the .html from the location
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
		System.out.println("Assessment page is openened successfully");	
	}
	
	@AfterClass
	public void teardown() {
		//close the browser
		driver.quit();
		System.out.println("Assessment page is closed successfully");
	}
	
	public void captureSrceenshot(WebDriver driver, String testName) throws IOException {
		//capturing the screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source =  ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"\\screenshots\\"+testName+".png");
		//to copy and paste
		FileUtils.copyFile(source, target);
		logger.info("Screenshot captured successfully");
	}
	
	public void roboMethod() throws AWTException {
		//scroll down the page
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	
}
