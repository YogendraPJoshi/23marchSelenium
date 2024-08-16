package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivTest 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(4000);
		//handle hidden div popup
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Hotels'])[1]")).click();
		
	}

}
