package seleniumControls;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassMethod {
	
	
	static WebDriver driver;
	
	
	@Test(priority = 1)
	public static void SendKeysDemo() throws InterruptedException
	{
		//specify the driver location 
		WebDriverManager.chromedriver().setup(); 
        //instantiate the driver
		driver = new ChromeDriver();   
         //specify the URL of the webpage 
         driver.get("https://www.google.com/"); 
         //maximize the window 
         driver.manage().window().maximize(); 
         //specify the locator of the search box 
         WebElement element = driver.findElement(By.xpath("//textarea[@title=\"Search\"]")); 
         //create an object for the Actions class 
          Actions action = new Actions(driver); 
         //pass the product name that has to be searched on the website 
         action.sendKeys(element, "Welcome").build().perform(); 
         
         
       
         
         
        
         
         
         
         
         //Close the browser 
         
         Thread.sleep(5000);         driver.quit(); 
          
    } 
	
	@Test(priority = 2)
	public static void MouseClick()
	{
		//specify the driver location 
		WebDriverManager.chromedriver().setup(); 
        //instantiate the driver
		driver = new ChromeDriver();   
  
         //specify the URL of the webpage 
         driver.get("https://www.amazon.in/"); 
         //maximize the window
          driver.manage().window().maximize(); 
          //create an object for the Actions class 
          Actions action = new Actions(driver); 
          //specify the locator of the search box in which the product has to be typed 
          WebElement elementToType = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")); 
          //pass the value of the product 
          elementToType.sendKeys("Iphone14"); 
          //specify the locator of the search button 
          WebElement elementToClick = driver.findElement(By.xpath("//input[@type='submit']")); 
          //Click on the search button 
          action.click(elementToClick).build().perform(); 
          //verify the title of the website after searching for the product 
          assertEquals(driver.getTitle(), "Amazon.in : Iphone14"); 
          driver.close(); 
    }

	
	@Test(priority = 3)
	public static void MoveToElement()
	{
		//specify the driver location 
		WebDriverManager.chromedriver().setup(); 
        //instantiate the driver
		driver = new ChromeDriver();   
  
		String url = "https://selenium08.blogspot.com/2020/01/click-and-hold.html"; 
		   driver.get(url); 

		// Locate the element A by By.xpath. 
		   WebElement titleA = driver.findElement(By.xpath("//li[text()= 'A']")); 
		   WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']")); 

		// Create an object of actions class and pass reference of WebDriver as a parameter to its constructor. 
		   Actions actions = new Actions(driver); 

		// Call moveToElement() method of actions class to move mouse cursor to a WebElement A. 
		   actions.moveToElement(titleA); 
		   actions.clickAndHold(); 
		   
		   actions.moveToElement(titleC); 
		   actions.release().perform(); 
} 
        
    
       
	
	@Test(priority = 4)
	public static void DoubleAndContentClick()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();    
        driver.get("https://demoqa.com/buttons");
         //Maximize the window 
        driver.manage().window().maximize(); 
         WebElement element = driver.findElement(By.xpath("//button[text()='Double Click Me']")); 
         Actions action = new Actions(driver); 
         
         action.doubleClick(element).build().perform(); 
         driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); 
         WebElement element1 = driver.findElement(By.xpath("//button[text()='Right Click Me']")); 
         action.contextClick(element1).build().perform();
         
         
         
         
         driver.close(); 
    } 
	
	@Test(priority = 5)
	public static void DragAndDrop() throws InterruptedException
	{
        // specify the driver location 
		WebDriverManager.chromedriver().setup();
        // instantiate the driver 
       
		driver = new ChromeDriver();  
        
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); 
        driver.manage().window().maximize(); 
        
        Thread.sleep(3000); 
        
        Actions action = new Actions(driver);
         WebElement source = driver.findElement(By.xpath("//*[@id='credit2']/a")); 
         Thread.sleep(1000);
         WebElement target = driver.findElement(By.xpath("//*[@id='bank']/li")); 
         
         action.dragAndDrop(source, target).build().perform(); 
         Thread.sleep(3000); // we have put hard sleep so that the user can see whether the item got dropped to its location or not 
         //close the browser 
         driver.close(); 
      }
	
	@Test(priority = 6)
	public static void KeyUpAndDown() throws InterruptedException
	{
		// specify the driver location 
				WebDriverManager.chromedriver().setup();
		        // instantiate the driver 
		       
				driver = new ChromeDriver(); 
        driver.get("https://www.google.com/"); 
        driver.manage().window().maximize(); 
        WebElement element = driver.findElement(By.xpath("(//input[@name=\"btnK\" and @value=\"Google Search\"])[2]")); 
        Actions action = new Actions(driver); 
        //holds the SHIFT key and converts the text to uppercase 
        action.keyDown(element,Keys.SHIFT).sendKeys("testSigma").build().perform(); 
        Thread.sleep(5000); 
        driver.close(); 
	}
	
	
	@Test(priority = 0)
	public static void KeyDown()
	{
		//specify the driver location 
		WebDriverManager.chromedriver().setup(); 
        //instantiate the driver
		driver = new ChromeDriver();   
  
         //specify the URL of the webpage 
         driver.get("https://www.amazon.in/"); 
         //maximize the window
          driver.manage().window().maximize(); 
          //create an object for the Actions class 
          Actions action = new Actions(driver); 
          //specify the locator of the search box in which the product has to be typed 
          WebElement elementToType = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")); 
          //pass the value of the product 
          elementToType.sendKeys("Iphone14"); 
          //specify the locator of the search button 
          WebElement element = driver.findElement(By.xpath("//input[@type='submit']")); 
          //Click on the search button 
          action.keyDown(element,Keys.SHIFT).build().perform(); 
          //verify the title of the website after searching for the product 
          assertEquals(driver.getTitle(), "Amazon.in : Iphone14"); 
          driver.close(); 
	}
	
	
}




