package week2.day1Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				
		driver.findElement(By.name("UserFirstName")).sendKeys("Madhavi");
		driver.findElement(By.name("UserLastName")).sendKeys("Mishra");
		driver.findElement(By.name("UserEmail")).sendKeys("Madhavi@gmail.com");
		
		WebElement jobTitle = driver.findElement(By.name("UserTitle"));
	    Select selectedJobTitle = new Select(jobTitle);
	    selectedJobTitle.selectByValue("Developer");
		
		driver.findElement(By.name("CompanyName")).sendKeys("ABC");
		
		WebElement employees = driver.findElement(By.name("CompanyEmployees"));
	    Select emSelect = new Select(employees);
	    emSelect.selectByIndex(3); 
		
		driver.findElement(By.name("UserPhone")).sendKeys("1233455689");
		
		//WebElement country = driver.findElement(By.name("CompanyCountry"));
	   // Select SelectedCountry = new Select(employees);
	   // SelectedCountry.selectByVisibleText("India");
		
	    WebElement checkbox = driver.findElement(By.className("checkbox-ui"));
	    checkbox.click();
		
	    
	}

}
