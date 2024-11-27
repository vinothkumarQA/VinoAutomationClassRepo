package seleniumControls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AssertEquals {

	static WebDriver driver;
	
	@Test
	public static void smokeTesting() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        // System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("https://www.saucedemo.com/");
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.manage().window().maximize();
		
         String actualTitle = driver.getTitle();
         String expectedTitle = "Swag Labs";

         
         //We can use directly
       //  Assert.assertEquals(actualTitle,expectedTitle);
         System.out.println("Application is verified successfully");
         
         
       //we can use for the same in if condition
         if (actualTitle.equalsIgnoreCase(expectedTitle)) {
        	 System.out.println("Title Matched");
		} else {
			System.out.println("Title is not Matched");
		}
         
         

         
         Thread.sleep(2000);
         driver.close();
		
	}

}
