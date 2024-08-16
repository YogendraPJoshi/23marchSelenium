package chromeOptionsUse;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class ChromeOptinsUse {

	public static void main(String[] args) throws IOException 
	{
		
		ChromeOptions options= new ChromeOptions();
		//options.addArguments("start-maximized");
	//	options.addArguments("incognito");
		options.addArguments("headless");
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("velocity");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\Velocity\\Java Class\\23 March 2024 Morning\\myScrreenShot\\test.png");
		FileHandler.copy(src, dest);
		
		

	}

}
