package week2.day1Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatLead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Madhavi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mishra");
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpDwn = new Select(source);
		drpDwn.selectByValue("LEAD_CONFERENCE");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Madhu");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Mishra");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Manager");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Maddy");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("12LPA");
		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpDwn1 = new Select(marketing);
		drpDwn1.selectByValue("CATRQ_CAMPAIGNS");
		//driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("21/08/1995");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Developer");
		WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select drpDwn2 = new Select(currency);
		drpDwn2.selectByVisibleText("INR - Indian Rupee");
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpDwn3 = new Select(industry);
		drpDwn3.selectByValue("IND_SOFTWARE");
		WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drpDwn4 = new Select(owner);
		drpDwn4.selectByValue("OWN_PARTNERSHIP");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("123456");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("51");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hi, This is Madhavi Mishra working as Software Engineer");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("importantNote");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("411027");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9455522632");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("5");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("maddy");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("madhavimishra21895@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Ujjwal");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Deepak");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Virar");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Manvelpada");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Mumbai");
		
		Select state =new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
			   state.selectByIndex(1);
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("401305");
		Select country =new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
		   state.selectByIndex(1);
		   
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("+91");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		/////////////Resulting screen
		//String actualTitle= driver.findElement(By.id("sectionHeaderTitle_leads")).getTitle();
		// String title ="View Lead ";
		String expectedTitle = "View Lead";
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Congratulation Lead has been created");
		}
		else
		{
			System.out.println("Title of resulting page is not matching");
		}
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.close();		
	}

}
