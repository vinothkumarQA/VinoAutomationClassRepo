package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseLogin {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		
		
		
		
		driver.get("https://www.saucedemo.com/");
		
		
	}
	
	@Test
	public void Login1()
	{
		driver.findElement(By.id("user-name")).sendKeys("Hello");	
		driver.findElement(By.id("password")).sendKeys("Welcome");
		
		
	}

	@Test
	public void Login2()
	{
		driver.findElement(By.id("user-name")).sendKeys("Hello");	
		driver.findElement(By.id("password")).sendKeys("Welcome");
	}
	
	@Test
	public void Login3()
	{
		driver.findElement(By.id("user-name")).sendKeys("Hello");	
		driver.findElement(By.id("password")).sendKeys("Welcome");
	}
	
	@AfterTest
	public void exit()
	{
		driver.quit();
	}
	

}
