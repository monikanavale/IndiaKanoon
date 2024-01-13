package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.CreateAccountPage;

public class CreateAccountPageTest extends BaseClass {
	
	private CreateAccountPage createAccountPage;

	// pre condition annotations -- call BaseClass initialization() method by using
	// Classname
	@BeforeTest
	public void setUp() {
		BaseClass.initialization();
	}

	// create the test cases using @Test annotation, maintain the text execution
	// flow using priority attribute etc..
	// create Object of Page Layer class and then call associated method at the time
	// of callig this method enterthe test data.
	@Test
	public void validateNewMemberAccountUser() {
		createAccountPage = new CreateAccountPage();
		createAccountPage.createMemberAccount("monika@gmail.com", "monika123@gmail.com", "Monika",
				"Monika", "Monika@123", "monika@123", "90909090",
				"India", "Maharashtra", "Pune", "112211", "Engineer", "3");
	}

	// Post condition annotation	
	@AfterTest
	public void tearDown()
	{
		//driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
