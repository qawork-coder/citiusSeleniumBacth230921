package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAndPartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumBrowserDriversJarFiles\\chromedriver_win32_91\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		
		
		//driver.findElement(By.linkText("Pregnancy")).click();
		
		driver.findElement(By.partialLinkText("Pregnancy")).click();
		
	}

}
