import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Intro  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 1: Invoking the browser
		// Chrome - ChromeDriver --to execute selenum in Chorme Broswer
		/*
		 * ChromeDriver driver = new ChromeDriver();  --> This is the menthod
		 *  {This Driver object here has access to all the methods of Chrome Driver}
		 * 
		 * WebDriver driver = new ChromeDriver();
		 * {Driver object has access to all methods of chrome driver which are defined in web driver interface}
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "D:/Subrat2022/SELENIUM/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
