package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.Wait;

public class CreateAccountPage extends BaseClass{
	
	//create object Repository with the help of @Findby annotation
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="email_rpt")
	private WebElement email_rpt;
	
	@FindBy(name="uniqname")
	private WebElement uniqname;
	
	@FindBy(name="name")
	private WebElement name;
	
	@FindBy(name="passwd")
	private WebElement passwd;
	
	@FindBy(name="rptpasswd")
	private WebElement rptpasswd;
	
	@FindBy(name="phone")
	private WebElement phone;
	
	@FindBy(name="country")
	private WebElement country;

	@FindBy(name="state")
	private WebElement state;
	
	@FindBy(name="city")
	private WebElement city;
	

	@FindBy(name="pincode")
	private WebElement pincode;
	
	@FindBy(name="profession")
	private WebElement profession;
	
	@FindBy(name="annual_income")
	private WebElement annual_income;
	
	//initialize the Object Repository by using PageFactory.iniElements() method
	public CreateAccountPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//create associated method for each and every object repository without entering
	//the test data and inside the this associated method call reusable script code methods from
	//Utility Layer package by using class name dot  method name
	
	public void createMemberAccount(String Email,String AltEmail,String uName,String Name,String
			Password,String RPassword,String Phone,String Country,String State,String City,
			String Pincode,String Profession,String income)
	{
		//call reusable script code methods from Wait Class to enter text in text box
		Wait.sendKeys(email, Email);
		Wait.sendKeys(email_rpt, AltEmail);
		Wait.sendKeys(uniqname, uName);
		Wait.sendKeys(name, Name);
		Wait.sendKeys(passwd, Password);
		Wait.sendKeys(rptpasswd, RPassword);
		Wait.sendKeys(phone,Phone);
		Wait.sendKeys(country, Country);
		Wait.sendKeys(state, State);
		Wait.sendKeys(city, City);
		Wait.sendKeys(pincode, Pincode);
		
		// call reusable script code method from HandleDropDown class to select the value 
		//by using selectByVisibleText() method
		HandleDropDown.selectByVisibleText(profession, Profession);
		
		// call reusable script code method from HandleDropDown class to select the value 
		//by using selectByValue() method
		HandleDropDown.selectByValue(annual_income, income);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
