package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("wbdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		
		//WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));   //Xpath example
		//UserName.sendKeys("abc@xyz.com");
		WebElement UserNameCSS = driver.findElement(By.cssSelector("input#email"));		//CSSSelector example
		UserNameCSS.sendKeys("abc@xyz.com");		
				
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("FacebookTest123");
		
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		LoginButton.click();
		
		
		//driver.close();
		
	}

}
