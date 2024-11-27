package seleniumControls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertFalse {
	
static WebDriver driver;
	




	@Test
	public static void assertFalse_smokeTesting() throws InterruptedException {
		
		
		//This method works opposite of that of assertTrue(). 
		//The Assertion verifies the Boolean value returned by the condition. 
		//If the Boolean value is false, then the assertion passes the test case.
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.get("https://www.saucedemo.com/");
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.manage().window().maximize();
		
       
         boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Swag Labs");

         Assert.assertFalse(verifyTitle);
         System.out.println("Application is verified successfully");
         
         Thread.sleep(2000);
         driver.close();
		
	}

}
