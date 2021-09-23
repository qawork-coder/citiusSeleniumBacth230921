package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumBrowserDriversJarFiles\\chromedriver_win32_91\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		Select sel=new Select(driver.findElement(By.id("select-demo")));
		sel.selectByIndex(4);
		sel.selectByValue("Sunday");
		sel.selectByVisibleText("Friday");
		
		
		
		
		
	}

}
