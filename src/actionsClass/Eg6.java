package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eg6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/r.php");
		Thread.sleep(1000);
		
		//1.
		WebElement dayField = driver.findElement(By.id("day"));
		
		//2.
		Actions action= new Actions(driver);
		
		//3.
		action.click(dayField).perform();
		
		for(int i=1;i<=4;i++) {
		Thread.sleep(1000);
		action.sendKeys(Keys.ARROW_UP).perform();
		}
		
		action.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
	}

}
