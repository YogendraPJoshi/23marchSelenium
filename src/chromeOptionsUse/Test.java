package chromeOptionsUse;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Test {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions options= new ChromeOptions();
		
	
		WebDriver driver= new ChromeDriver(options);
		
		driver.get("https://www.justdial.com/");
		
		
//		Thread.sleep(4000);
//		driver.findElement(By.name("q")).sendKeys("Velocity");
//		String timeStamp= new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
//		String myText = driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).getText();
//		System.out.println(myText);
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest= new File("D:\\Velocity\\Java Class\\23 March 2024 Morning\\myScrreenShot\\test_"+timeStamp+".png");
//		FileHandler.copy(src, dest);
		

	}

}
