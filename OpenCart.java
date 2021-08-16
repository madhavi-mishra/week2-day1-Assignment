package week2.day1Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("input-username")).sendKeys("madhaviMishra");
		driver.findElement(By.id("input-firstname")).sendKeys("Madhavi");
		driver.findElement(By.id("input-lastname")).sendKeys("Madhavi");
		driver.findElement(By.id("input-email")).sendKeys("madhavimishra21895@gmail.com");
		WebElement drop1 =  driver.findElement(By.id("input-country"));
		Select drpDwn = new Select(drop1);
		drpDwn.selectByValue("99");
		
		driver.findElement(By.id("input-password")).sendKeys("123@maggie");
		driver.findElement(By.className("btn btn-primary btn-lg hidden-xs")).click();
		
	}

}
