package testcases;

import org.testng.annotations.Test;

import pages.loginPage;

public class loginTest extends baseLogin{

	
	@Test
	public void verify_validUserLogin()
	{
		loginPage lp = new loginPage(driver);
		 
		 //System.out.println(lp.identifyText());
		
		lp.enterUsernameTxt("standard_user");
		lp.enterPasswordTxt("secret_sauce");
		lp.clickLoginBtn();

	}
}
