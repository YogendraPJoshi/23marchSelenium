package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
	}

}
