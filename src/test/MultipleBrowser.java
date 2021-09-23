package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowser {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumBrowserDriversJarFiles\\chromedriver_win32_91\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		
		Robot r = new Robot();        
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_T);
        
        ((JavascriptExecutor)driver).executeScript("window.open()");
        
        String currentHandle=driver.getWindowHandle();
        
        Set<String> handles=driver.getWindowHandles();
        for(String actual:handles)
        {
        	if(!actual.equalsIgnoreCase(currentHandle))
        	{
        		  driver.switchTo().window(actual);
        		  System.out.println(driver.getCurrentUrl());
        	}
        }
		
		//driver.findElement(By.cssSelector(“body”)).sendKeys(Keys.CONTROL+ “t”);
		
	}

}
