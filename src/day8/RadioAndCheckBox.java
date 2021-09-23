package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumBrowserDriversJarFiles\\chromedriver_win32_91\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		
		driver.findElement(By.xpath("//*[@value='Option 1']")).click();
		
		driver.findElement(By.xpath("//*[@value='checkbox1']")).click();
		driver.findElement(By.xpath("//*[@value='checkbox1']")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@value='checkbox1']")).isSelected());
		
	System.out.println(driver.findElement(By.xpath("//*[@value='checkbox1']")).isDisplayed());
		
	}

}
