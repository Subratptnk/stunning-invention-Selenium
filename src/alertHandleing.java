import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertHandleing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Subrat2022/SELENIUM/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		String text = "Subrat";
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		String alertText =  driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(alertText);
		String name[] = alertText.split(",");
		System.out.println(name[0]);
		System.out.println(name[1]);
		
		String[] extractName = name[0].split(" ");
		System.out.println("Name of the user is "+extractName[1]);
		
	}

}
