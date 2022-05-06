import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingGrid {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Subrat2022/SELENIUM/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		int sum = 0;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)");
		
		Thread.sleep(2000);
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

		for(int i =0; i<values.size();i++) {
			System.out.println(Integer.parseInt(values.get(i).getText()));
			sum = sum+Integer.parseInt(values.get(i).getText());
			
		}
		System.out.println("Sum = "+sum);
		String Answer = driver.findElement(By.cssSelector(".totalAmount")).getText();
		String ans = Integer.toString(sum);
		if(Answer.contains(ans)) {
			System.out.println("Test case is successfull");
		}
		
		
		Thread.sleep(5000); js.
		executeAsyncScript("document.querySelector(\".tableFixHead\").scrollTop = 5000");
		 
		
		
		
	}

}
