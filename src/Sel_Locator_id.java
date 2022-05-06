import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Locator_id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PRE-Condition: 
		System.setProperty("webdriver.chrome.driver", "D:/Subrat2022/SELENIUM/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		// Process (Logic)
		driver.get("https://test.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("subratApex@subs.com");
		driver.findElement(By.id("password")).sendKeys("15@Sp#98");
		driver.findElement(By.id("Login")).click();
		//driver.close();
		
		
		//Capturing the error message
		System.out.println("Capturing the error text ");
	
		System.out.println(driver.findElement(By.id("error")).getText());
		
		// POST condition:
		System.out.println("Execution Successsfull");
		driver.close();
	}

}
