package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumBrowserDriversJarFiles\\chromedriver_win32_91\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
	
		Actions act=new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//*[@id='column-a']"));
		WebElement target=driver.findElement(By.xpath("//*[@id='column-b']"));
		
		act.dragAndDrop(source,target).build().perform();
		
		
		
	}
}
