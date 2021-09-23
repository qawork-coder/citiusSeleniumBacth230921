package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumBrowserDriversJarFiles\\chromedriver_win32_91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nseindia.com/");
		
		String text=driver.findElement(By.xpath("//div[@id='tab1_tableLoser']//table//tbody//tr[2]/td[3]")).getText();
		System.out.println(text);
	}

}
