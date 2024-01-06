package guvitask20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GuviSignUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.guvi.in/");
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Duser");
		driver.findElement(By.id("email")).sendKeys("mtfssoq876@iemail.one");
		driver.findElement(By.id("password")).sendKeys("Dummey@123");
		driver.findElement(By.id("mobileNumber")).sendKeys("9789984611");
		driver.findElement(By.xpath("//a[@id='signup-btn']")).click();
		Thread.sleep(4000);
		WebElement ver = driver.findElement(By.xpath("//h1[@class='mainHeading']"));
		if(ver.isDisplayed()) {
			System.out.println("signup verified");
		}
		driver.findElement(By.xpath("//a[@id='laterBtn']")).click();
		
		
		
	}

}
