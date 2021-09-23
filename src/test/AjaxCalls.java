package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxCalls {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverWait wait;
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumBrowserDriversJarFiles\\chromedriver_win32_91\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		
		By container = By.cssSelector(".container");
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(container));
		
		//Get the text before performing an ajax call
		WebElement noTextElement = driver.findElement(By.className("radiobutton"));
		String textBefore = noTextElement.getText().trim();
		
		//Click on the radio button
		driver.findElement(By.id("yes")).click();
	
		//Click on Check Button
		driver.findElement(By.id("buttoncheck")).click();
		
		/*Get the text after ajax call*/
		WebElement TextElement = driver.findElement(By.className("radiobutton"));
		wait.until(ExpectedConditions.visibilityOf(TextElement));
		String textAfter = TextElement.getText().trim();
		
		/*Verify both texts before ajax call and after ajax call text.*/
		//Assert.assertNotEquals(textBefore, textAfter);
		System.out.println("Ajax Call Performed");
		
		String expectedText = "Radio button is checked and it's value is Yes";
		
		/*Verify expected text with text updated after ajax call*/
		//Assert.assertEquals(textAfter, expectedText);
		driver.close();
		
	}

}
