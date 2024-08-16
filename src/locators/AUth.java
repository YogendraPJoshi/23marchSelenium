package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AUth 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		String url="the-internet.herokuapp.com/basic_auth";
		String password="admin";
		String username="admin";
		
		//syntax:https://username:password@URL
		
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		//driver.get("https://"+username+":"+password+"@"+url);
		driver.get("https://www.ilovepdf.com/pdf_to_word");
			WebElement addfilesButton = driver.findElement(By.id("pickfiles"));
			//addfilesButton.click();
			Thread.sleep(2000);
			addfilesButton.sendKeys("D:\\Velocity\\Java Class\\23 March 2024 Morning\\screenShot.pdf");
		
	}

}
