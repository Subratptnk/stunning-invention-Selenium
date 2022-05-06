import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Subrat2022/SELENIUM/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		WebElement blinkText = driver.findElement(By.cssSelector("a[class='blinkingText']"));
		blinkText.click();
		//shift the focus from parent browser to child browser

		Set<String> windows = driver.getWindowHandles(); //[parentid,childid]
		
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String para= driver.findElement(By.cssSelector(".im-para.red")).getText(); 
		String[] splitPara = para.split(" ");
		System.out.println(splitPara[4]);
		String username = splitPara[4];
		String emailid = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		WebElement userName = driver.findElement(By.cssSelector("input[id='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		userName.sendKeys(emailid);
		password.sendKeys("learning");
		
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		}
		
	}

