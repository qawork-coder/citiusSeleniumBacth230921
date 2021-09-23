package day10;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumBrowserDriversJarFiles\\chromedriver_win32_91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ndtv.com/business");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//*[contains(@name,\"google_ads_iframe_\")])[1]")).click();
		
		String currentTab=driver.getWindowHandle();
		System.out.println(currentTab + driver.getCurrentUrl());
		
		Set<String> handles=driver.getWindowHandles();
		for(String lis:handles)
		{
			if(!lis.equalsIgnoreCase(currentTab))
				
			{
				driver.switchTo().window(lis);
				System.out.println(lis + driver.getCurrentUrl());
			}
		}
		
		
	}

}
