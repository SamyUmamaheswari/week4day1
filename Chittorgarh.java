package week4day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[@class='ch-bar-item ch-button'])[3]")).click();
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		List<WebElement> data = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr//td[3]"));
        for (WebElement each : data) {
			String text = each.getText();
			System.out.println(text);
			
		}
}
}
