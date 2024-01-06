package guvitask20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	
	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
		driver.findElement(By.xpath("//a[@data-date='22']")).click();
		driver.close();
		
	}
}
