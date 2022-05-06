import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Subrat2022/SELENIUM/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Output: "+driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		
		// want to click adult 3 times
		
		int i =1;
		while (i < 3) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		String currentValue = driver.findElement(By.id("spanAudlt")).getText();
		System.out.println("Number of adults: "+currentValue);
		
		// want to add 6 infant 
		
		for(int j = 0; j<4 ; j++) {
			driver.findElement(By.xpath("//span[@id = \"hrefIncInf\"]")).click();
		}
		System.out.println("Number of infacts: "+driver.findElement(By.xpath("//span[@id = \"spanInfant\"]")).getText());
		
		
		driver.findElement(By.xpath("(//input[@class = \"buttonN\"])[1]")).click();
		System.out.println("Output: "+driver.findElement(By.id("divpaxinfo")).getText());
		
		
		
		
	}

}
