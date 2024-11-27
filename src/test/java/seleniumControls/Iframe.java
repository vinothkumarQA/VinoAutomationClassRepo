package seleniumControls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {
	
	 static WebDriver driver;
	 
	 
	
	
	
	@Test(priority = 2)
	public static void Setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 
		 driver = new ChromeDriver();

	       driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
       Thread.sleep(5000);
          //Switch to the iframe which contains the checkboxes

       System.out.println("hai");
         driver.switchTo().frame("iframeResult");
         
         List<WebElement>chkboxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
         
         int size=chkboxes.size();
         
         for (int i=0; i<size; i++) 
         {
        	 
        	 chkboxes.get(i).click();

         }
         
         driver.close();
	}
	
	
	@Test(priority = 1)
	public static void withoutIframe() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 
		 driver = new ChromeDriver();

	       driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
       Thread.sleep(5000);
          //Switch to the iframe which contains the checkboxes

       System.out.println("hai");
       
       driver.findElement(By.xpath("//input[@value=\"Bike\"]")).click();
       
         driver.switchTo().frame("iframeResult");
         
         List<WebElement>chkboxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
         
         int size=chkboxes.size();
         
         for (int i=0; i<size; i++) 
         {
        	 
        	 chkboxes.get(i).click();

         }
         
         driver.close();
	}

}
