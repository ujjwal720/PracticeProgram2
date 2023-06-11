package trackit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathaxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * xpath axes following-sibling
		 * following
		 * parent
		 * 
		 * this are the following for the following xpath axes
		 */
		
		/*
		 * xpath axes following-sib;ing
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='radioselenium']/following-sibling::input[1]"));
		
		/*
		 * xpath axes
		 */
		
		driver.findElement(By.xpath("//input[@name='radioselenium']/following::input[1]"));
		
		/*
		 * xpath axes1
		 */

	}

}
