package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Navigate to the demoqa website
		driver.get("https://www.demoqa.com");
		
		driver.quit();
	}

}
