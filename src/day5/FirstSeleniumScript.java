package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumBrowserDriversJarFiles\\chromedriver_win32_91\\chromedriver.exe");
		//System - A class
		//Set property is the method being offered by the class
		//The lines means that = which driver are we going to launch and what is the location for that driver 
		
		WebDriver driver=new ChromeDriver();
		//WebDriver - Interface ( a set of unimplemented methods) 
		//driver - but an object name 
		//ChromeDriver - Its a class . This is the one that is defining the body of the unimplemented methods in interface
		driver.get("https://www.google.com");
		//get metgod is used for launching the browser 
		
		
	}

}
