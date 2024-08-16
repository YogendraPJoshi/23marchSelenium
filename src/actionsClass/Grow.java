package actionsClass;

import java.time.Duration;

import org.bouncycastle.crypto.prng.drbg.DualECPoints;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://groww.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement loginButton = driver.findElement(By.xpath("//*[text()='Login/Register']"));
		loginButton.click();
		WebElement userEmail = driver.findElement(By.id("login_email1"));
		userEmail.sendKeys("yjoshi02@gmail.com");
		
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(2000);
		WebElement passwordField = driver.findElement(By.id("login_password1"));
		passwordField.sendKeys("Bhargav@07062019");
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1248");
	}

}
