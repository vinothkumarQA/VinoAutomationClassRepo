package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class genericPage {
	protected WebDriver driver;
	public genericPage(WebDriver driver)
	{
		this.driver = driver;
		
	}

	public void clickElement(By locator)
	{
		driver.findElement(locator).click();
	}
	
	public void enterText(By locator,String text)
	{
		driver.findElement(locator).sendKeys(text);
	}
	
	public void getElementText(By locator)
	{
		driver.findElement(locator).getText();
	}
	
	public void selectDate1(By locator,String text)
	{
		driver.findElement(locator).sendKeys(text);
	}
	
	public void selectDate(By calendarLocator,String date)
	{
		driver.findElement(calendarLocator).click();
		
		List<WebElement> dates = driver.findElements(calendarLocator);
		for (WebElement element : dates) {
			if (element.getText().equals(dates)) {
				element.click();
				break;		
			}
			
		}
	}
	


}
