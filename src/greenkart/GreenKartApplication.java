package greenkart;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Subrat2022/SELENIUM/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		
		String[] productNeeded = {"Cauliflower","Cucumber", "Brocolli"};
		//addItems(driver,productNeeded); -- make the method static.
		GreenKartApplication greenKart = new GreenKartApplication();
		greenKart.addItems(driver, productNeeded);
		greenKart.checkoutProcess(driver, wait);
		
		
		
		
		
	}
	

	public void addItems(WebDriver driver,String[] productNeeded ) {
		int j = 0;
		List<WebElement> veggieName = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i =0; i<veggieName.size();i++) {

			String name[] = veggieName.get(i).getText().split("-");
			String formattedName = name[0].trim();
			//System.out.println("----name: "+name[0].trim());
			//converting array into arrayList
			List productNeededList = Arrays.asList(productNeeded);
			//System.out.println(productNeeded[0]);
			
		
				if(productNeededList.contains(formattedName)) {
					j++;
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					
					System.out.println(formattedName + " --> Clicked");
					if(j==productNeeded.length) {
						break;
					}
				}
		
			 
		}
		
		
	}
	
	public void checkoutProcess(WebDriver driver, WebDriverWait wait) {
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
		
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		WebElement dropDown = driver.findElement(By.cssSelector("Select[style='width: 200px;']"));
		Select dropSelect = new Select(dropDown);
		dropSelect.selectByValue("India");
		System.out.println(dropSelect.getFirstSelectedOption().getText());
		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
	}
}

