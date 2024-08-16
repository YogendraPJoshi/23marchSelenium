package commonMethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement myElement = driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']"));
		Thread.sleep(1000);
		Utility.scrollIntoView(driver, myElement);
		Utility.takeScreenShot(driver, "MyFile");
		
		WebElement textBox = driver.findElement(By.id("name"));
		String FileName="D:\\Velocity\\Java Class\\23 March 2024 Morning\\excelTest.xlsx";
//		String myData = Utility.readDataFromExcel(FileName, "Sheet3", 1, 0);
//		textBox.sendKeys(myData);
		
		textBox.sendKeys(Utility.readDataFromExcel(FileName, "Sheet3", 1, 0));

	}

}
