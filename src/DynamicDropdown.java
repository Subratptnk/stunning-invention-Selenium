import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Subrat2022/SELENIUM/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		driver.findElement(By.xpath("//input[@id= \"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		driver.findElement(By.cssSelector("a[value = 'DEL']")).click();
		
		//driver.findElement(By.cssSelector(" input[id = 'ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		//driver.findElement(By.cssSelector("a[value = 'BLR']")).click();
		driver.findElement(By.xpath("(//a[@value = 'BLR'])[2]")).click();
		
	}

}
