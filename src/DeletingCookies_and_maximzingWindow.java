import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeletingCookies_and_maximzingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		
		System.setProperty("webdriver.chrome.driver", "D:/Subrat2022/SELENIUM/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());

	}

}
