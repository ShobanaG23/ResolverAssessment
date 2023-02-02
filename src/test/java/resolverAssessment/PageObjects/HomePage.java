package resolverAssessment.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor;

public class HomePage {
	//1. Initialize WebDriver instance
	public WebDriver driver;
	
	//2. create a constructor
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//---------------------------locators for test 1----------------------------------------
	//locator for email id
	@FindBy(id = "inputEmail")
	WebElement sign_in_field;
	
	//locator for password
	@FindBy(id = "inputPassword")
	WebElement password_field;
	
	//locator for sign-in
	@FindBy(xpath = "//button[@type='submit']")
	WebElement sign_in_button;
	
	//---------------------locators for test2---------------------------------------------
	//locator for list_items
	@FindBy(xpath = "//li[@class='list-group-item justify-content-between']")
	List<WebElement> List_items;
	
	//locator for list_item2
	@FindBy (xpath = "//li[@class='list-group-item justify-content-between'][2]")
	WebElement second_item;
	
	//locator for badge value of second item
	@FindBy (xpath = "(//span[@class= 'badge badge-pill badge-primary'])[2]")
	WebElement second_item_badge;
	
	//------------------------------locators for test 3------------------------------------
	//locator for dropdown
	@FindBy (id = "dropdownMenuButton")
	WebElement btn_dropdown;
	
	//locators for option3
	@FindBy (xpath = "(//a[@class='dropdown-item'])[3]")
	WebElement btn_option3;
	
	//-------------------------------locators for test4------------------------------------
	//locator for first button
	@FindBy (xpath = "(//button[@class='btn btn-lg btn-primary'])[1]")
	WebElement btn_first;
	
	//locator for second button
	@FindBy (xpath = "//button[@class='btn btn-lg btn-secondary']")
	WebElement btn_second;
	
	//--------------------------locators for test5-----------------------------------------
	//locator for button
	@FindBy (xpath = "(//button[@class='btn btn-lg btn-primary'])[2]")
	WebElement btn_test5;
	
	//locator for alert message
	@FindBy (id = "test5-alert")
	WebElement txt_alertMessage;
	
	//---------------------------locators for test6----------------------------------------
	//locator for Ventosanzap
	@FindBy (xpath = "//table[@class='table table-bordered table-dark']/tbody/tr[3]/td[3]")
	WebElement txt_cellValue;
	
	//locator for all elements in the table 
	@FindBy (xpath = "//table[@class='table table-bordered table-dark']/tbody/tr/td")
	List<WebElement> txt_Table;
	
	
	//4. methods with logics to implement
	//---------------------------------TEST1-------------------------------------------------
	public void verify_elements() {
		//verifying for input field		
		boolean Page_Has_sign_in_field = sign_in_field.isDisplayed();
		if (Page_Has_sign_in_field == true) {
			System.out.println("Sign_in_field is displayed on the page");
		} else {
			System.out.println("Sign_in_field is not displayed on the page");		
		}
		
		//verifying for password field
		boolean Page_Has_password_field= password_field.isDisplayed();
		if (Page_Has_password_field == true) {
			System.out.println("Password_field is displayed on the page");		
		} else {
			System.out.println("Password_field is not displayed on the page");		
		}
		
		//verifying for sign in button
		boolean Page_Has_sign_in_button = sign_in_button.isDisplayed();
		if (Page_Has_sign_in_button == true) {
			System.out.println("Sign_in_button is displayed on the page");
		} else {
			System.out.println("Sign_in_button is not displayed on the page");		
		}
	}
	
	public void fill_login(String email, String password) throws InterruptedException {
		//enter in sign in field
		sign_in_field.clear();
		sign_in_field.sendKeys(email);
		//enter in password field		
		password_field.clear();
		password_field.sendKeys(password);
		System.out.println("Email and Password entered as : "+ email + " and "+ password);
		Thread.sleep(5000);
	}
	
	public void click_button() {
		//click on sign in button
		sign_in_button.click();
		System.out.println("Clicked on sign in button");
	}
	
	//---------------------------------------TEST2-------------------------------------------------
	public int verify_list_elements() {
		//list size	
		int List_size = List_items.size();
		System.out.println("Number of elements in the list is : "+ List_size);
		System.out.println("Name of the elements in the list are: ");
		//get values in the list
		for(int i=0;i<List_size;i++) {
			String list_elements = List_items.get(i).getText();
			System.out.println(list_elements);
		}
		return List_size;
	}
	
	public String verify_list_item_value() {
		//get name in list item 2
		String list_2 = List_items.get(1).getText();
		String second_item_value = list_2.substring(0, 11);
		System.out.println("Value in the list_item 2 is : " + second_item_value);
		return second_item_value;
	}
	
	public int verify_badge_value() {
		//get badge value
		String value = second_item_badge.getText();
		int second_item_badge_value = Integer.parseInt(value);
		System.out.println("Badge value in the second_item is : " +second_item_badge_value);
		return second_item_badge_value;
	}
	
	//--------------------------------TEST3----------------------------------------------------
	public String Handling_FromDropdown() {
		//get values in the dropdown
		String dropDownName = btn_dropdown.getText();
		System.out.println("DropDown name dislayed in test3 is : " + dropDownName);
		return dropDownName;
	}
	
	public void Select_FromDropDown() {
		//make mouse over action to scroll through the dropdown
		Actions act = new Actions(driver);
		act.click(btn_dropdown).build().perform();
		act.click(btn_option3).build().perform();
		System.out.println("Selected option from the Dropdown is Option 3" );
		
	}	
		
	//------------------------------------------TEST4----------------------------------------------
	public boolean verify_firstButton() {
		//check for first button is enabled
		boolean FirstButton = btn_first.isEnabled();
		if (FirstButton == true) {
			System.out.println("First button is enabled");
		} else {
			System.out.println("First button is not enabled");
		} 
		return FirstButton;
	}
	
	public boolean verify_secondButton() {
		//check for second button is disabled
		boolean SecondButton = btn_second.isEnabled();
		if (SecondButton == true) {
			System.out.println("Second button is enabled");
		} else {
			System.out.println("Second button is disabled");
		} 
		return SecondButton;
	}
	
	//---------------------------------------test5---------------------------------------
	public void Handling_button() {
		//wait till the element appears
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(btn_test5));
		//to click the button
		if(btn_test5.isEnabled() == true) {
			btn_test5.click();
			System.out.println("Button in test5 is clicked");
		}
	}
	
	public String Get_AlertMessage() {
		//to get message
		String message = txt_alertMessage.getText();
		System.out.println("Alert message displayed after clicking the button is : "+ message);
		return message;
	}
		
	public boolean check_disabledButton() {
		// to check if the button is disabled
		boolean disabled_button  = btn_test5.isEnabled();
		if(disabled_button == false) {
			System.out.println("The button is disabled after clicking");
		} else {
			System.out.println("The button is not disabled after clicking");
		}
		return disabled_button;
	}
		 
	//---------------------------------test6-----------------------------------------
	public void Handling_tables(){
		//siZe of the table
		int row_size = txt_Table.size();
		System.out.println("Values in the table: ");
		for(int i=0;i<row_size;i++) {
			String value_inTable = txt_Table.get(i).getText();
			System.out.println(value_inTable);
		}
	}
	
	public String get_valueInCell() throws InterruptedException {
		//get value in cell[2][2]
		String Value = txt_cellValue.getText();
		Thread.sleep(5000);
		System.out.println("Value dispplayed in cordinate [2][2] is : "+ Value);
		return Value;
	}
}
	
	
	
	
	

