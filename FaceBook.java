package week2.day1Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Madhavi");
		driver.findElement(By.name("lastname")).sendKeys("Mishra");
		driver.findElement(By.name("reg_email__")).sendKeys("9677233256");
		driver.findElement(By.id("password_step_input")).sendKeys("123@maggie");
		WebElement dobDay = driver.findElement(By.id("day"));
	    Select drop1 = new Select(dobDay);
	    drop1.selectByValue("21");
	    WebElement dobMonth = driver.findElement(By.id("month"));
	    Select drop2 = new Select(dobMonth);
	    drop2.selectByValue("10");
	    WebElement dobYear = driver.findElement(By.id("year"));
	    Select drop3 = new Select(dobYear);
	    drop3.selectByVisibleText("1995");
	    WebElement radio =driver.findElement(By.name("sex"));
	    radio.click();
	    

	    
	  
	    
 	}

}
