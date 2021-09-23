package day12;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertionScenario {

	@Test
	public void checkAssertion()
	{
		

		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumBrowserDriversJarFiles\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
			
		assertEquals(driver.findElement(By.name("gfq")).isDisplayed(), true);
		
	//	System.out.println(driver.findElement(By.name("gfq")).isDisplayed());
		
	}
}
