import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SaucePan {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");	
		//driver.findElement(By.linkText("item_4_title_link"));
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
				//.id("user-name")).sendKeys("standard_user");	
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.linkText("item_4_title_link"));
		//driver.close();
		;
	}

}
