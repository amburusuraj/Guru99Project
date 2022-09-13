package withouttestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {

	public static void main(String[] args) {
		
		System.out.println("Test Case Running Successfully...");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome opened....");
		driver.get("https://www.demo.guru99.com/V4/");
		System.out.println("Navigated to Login page....");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement userid=driver.findElement(By.name("uid"));
		userid.sendKeys("mngr428939");
		System.out.println("User id Entered....");
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("vejEmUm");
		System.out.println("Password Entered....");
		driver.findElement(By.name("btnLogin")).submit();
		System.out.println("Login Success and HomePage is Displayed");
		String expectedTitle="Guru99 Bank Manager HomePage";
		String actualTitle=driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Title Validation Successfull");
		}
		else
		{
			System.out.println("Title Valodation Failed");
		}
		
		driver.close();
		System.out.println("Chrome closed...");
		
		

	}

}
