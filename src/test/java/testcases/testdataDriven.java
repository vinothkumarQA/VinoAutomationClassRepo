package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testdataDriven {
	WebDriver driver;
	
	@DataProvider(name = "logicdata")
	public Object[][] getData()
	{
		Object[][] data = new Object[][]
				{
			{
				"standard_user","secret_sauce"
			},
			{
				"locked_out_user","secret_sauce"
			},
			
			{
				"problem_user","secret_sauce"
			},
			
			{
				"performance_glitch_user","secret_sauce"
			},
			{
				"error_user","secret_sauce"
			},
			{
				"visual_user","secret_sauce"
			},
				};
		return data;
				
	}
	
	

	@Test(dataProvider = "logicdata")
	public void Login1(String username, String password)
	{
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		
		
		
		
		driver.get("https://www.saucedemo.com/");
		
	
		driver.findElement(By.id("user-name")).sendKeys(username);	
		driver.findElement(By.id("password")).sendKeys(password);
		
		//Thread.sleep(10);
		
		driver.quit();
	}


}
