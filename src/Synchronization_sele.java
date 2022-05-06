import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * To synchronize between script execution and application,
 * we need to wait after performing appropriate actions. Let us look at the ways to achieve the same.
 * 
 * Thread.Sleep : Thread.Sleep is a static wait and it is not a good way to use in scripts as it is sleep without condition.
 * 
 * Explicit Waits : An 'explicit wait,' waits for a certain condition to occur before proceeding further. 
 * It is mainly used when we want to click or act on an object once it is visible.
 * 
 * Implicit Wait: Implicit wait is used in cases where the WebDriver cannot locate an object immediately because of its unavailability. 
 * The WebDriver will wait for a specified implicit wait time and it will not try to find the element again during the specified time period.
 * 
 */

public class Synchronization_sele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Subrat2022/SELENIUM/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		//implicit wait -- Wait globally
		
		
	}

}
