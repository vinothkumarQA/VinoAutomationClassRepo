package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentRegistrationPage extends genericPage{
	
	
	private By RegistrationFormTitle = By.xpath("//form[@name=\"TextForm\"]//h1");
	private By enterNameTxt = By.id("name");
	private By enterEmailIdTxt = By.id("email");
	private By clickRadioBtn = By.xpath("(//input[@type='radio'])[1]");
	private By enterMobileNoTxt = By.id("mobile");
	private By selectDOB = By.xpath("//input[@id=\"dob\"]");
	private By enterSubjectTxt = By.id("subjects");
	private By checkBoxHobbies = By.xpath("//input[@type=\"checkbox\"]");
	
	
	public StudentRegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public void enterNameTxt(String name)
	{
		enterText(enterNameTxt, name);
	}
	
	public void enterEmailIdTxt(String email)
	{
		enterText(enterEmailIdTxt, email);
	}

	public void clickRadioBtn()
	{
		clickElement(clickRadioBtn);
	}
	
	public void enterMobileNoTxt(String mobile)
	{
		enterText(enterMobileNoTxt, mobile);
	}
	
	public void selectDate1(String date)
	{
		selectDate1(selectDOB, date);
		
	}
	
	
	

}
