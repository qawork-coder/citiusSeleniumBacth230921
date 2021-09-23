package day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumBrowserDriversJarFiles\\chromedriver_win32_91\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		WebDriverWait wait=new WebDriverWait(driver, 60);
		
	//	wait.until(ExpectedConditions.invisibilityOfElementWithText(locator, text));
		
	}

}
