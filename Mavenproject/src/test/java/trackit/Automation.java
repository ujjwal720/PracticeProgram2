package trackit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         * css selector
         */
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("hello");
		System.out.println("The following si an test");

	}

}
