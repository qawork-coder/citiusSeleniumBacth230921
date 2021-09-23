package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumBrowserDriversJarFiles\\chromedriver_win32_91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		Actions act = new Actions(driver);
		WebElement SignIn = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		WebElement yourAccount = driver.findElement(By.xpath("(//*[text()='Your Account'])[1]"));

		Action mouseHover = act.moveToElement(SignIn).contextClick(yourAccount).build();

		mouseHover.perform();
		mouseHover.perform();

	}

}
