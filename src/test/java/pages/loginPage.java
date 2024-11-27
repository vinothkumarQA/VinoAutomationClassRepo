package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage extends genericPage {

	
	private By applicationTitle = By.xpath("//div[@class=\"login_logo\"]");
	private By Username = By.id("user-name");
	private By Password = By.id("password");
	private By loginbtn = By.id("login-button");
	
	
	
	public loginPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public void enterUsernameTxt(String username)
	{
		enterText(Username, username);
	}
	
	public void enterPasswordTxt(String password)
	{
		enterText(Password, password);
	}
	
	public void clickLoginBtn()
	{
		clickElement(loginbtn);
	}
	
	

	
	
	
}
