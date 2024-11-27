package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.StudentRegistrationPage;

public class StudentRegistrationFormTest {
	
	
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	}
	
	@Test
	public void RegistrationForm()
	{
	/*
		String obj= "08-09-2024";
		driver.findElement(By.xpath("//input[@id=\"dob\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"dob\"]")).sendKeys(obj);
	*/
	 StudentRegistrationPage stp = new StudentRegistrationPage(driver);
	 stp.enterMobileNoTxt("95786");
	 stp.selectDate1("08-09-2024");
	}
/*	
	@AfterTest
	public void exit()
	{
		driver.quit();
	}
*/
}
