package day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumBrowserDriversJarFiles\\chromedriver_win32_91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");

		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_T);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_T);

		driver.get("https://www.google.com");

		String firstTab = driver.getWindowHandle();
		//System.out.println(firstTab);

		Set<String> handles = driver.getWindowHandles();
		for (String actual : handles) {

			System.out.println(actual);
			if(!actual.equalsIgnoreCase(firstTab))
			{
				driver.switchTo().window(actual);
				driver.get("https://www.amazon.com");
			}

		}

	}
}
