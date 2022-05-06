import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PRE-Condition: 
				System.setProperty("webdriver.chrome.driver", "D:/Subrat2022/SELENIUM/chromedriver/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://demo.applitools.com/");
				
				
		//Process
				
		// Implicit Wait:
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Locator - Id:
				System.out.println("Locator: ID");
				driver.findElement(By.id("username")).sendKeys("TestSele01");
		// Locator - CSS-Selector
				System.out.println("Locator: CSS-Selector");
				driver.findElement(By.cssSelector("input[type = 'password']")).sendKeys("Test1!2022");
		// Locator - Class
				System.out.println("Locator: Class");
				driver.findElement(By.className("btn-primary")).click();
				
		// Locator - xpath
				System.out.println("Locator xpath");
				driver.findElement(By.xpath("//span[contains(text(),'Add Account')]")).click();
				
				
				
		// POST condition:
				System.out.println("Execution Successsfull");
				//driver.close();		


	}

}
