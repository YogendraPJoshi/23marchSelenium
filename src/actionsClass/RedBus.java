package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBus
{
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	Thread.sleep(1000);
	
	WebElement src = driver.findElement(By.xpath("//input[@id='src']"));
	src.sendKeys("Pu");
	
	Actions act= new Actions(driver);
	
	act.sendKeys(src,Keys.ARROW_DOWN).
	sendKeys(Keys.ARROW_DOWN).build().perform();
}
}
