package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Velocity");
//		driver.get("https://www.facebook.com/signup");
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Velocity");
		
		
		

	}

}
