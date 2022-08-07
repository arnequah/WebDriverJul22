package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("wbdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		// Step 1. Click on the Login Link
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		
		// Step 2. Enter user login
		
		WebElement UserLogin = driver.findElement(By.name("user_login"));
		UserLogin.sendKeys("abc@xyz.com");
		
		// Step 3. Enter password
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("SeleniumTest123");
		
		// Step 4. Click on Remember me checkbox
		
		WebElement Checkbox = driver.findElement(By.className("rememberMe"));
		Checkbox.click();
		
		// Step 5. Click on the Login button
		
		WebElement LoginButton = driver.findElement(By.name("btn_login"));
		LoginButton.click();
		
		// Step 6. Validate the error message on screen
		
		WebElement Error = driver.findElement(By.id("msg_box"));
		
		String ActError = Error.getText();
		String ExpError = "The email or password you have entered is invalid.";
		
		if(ActError.equals(ExpError)) {
			System.out.println("TC Passed");
		}else {
			System.out.println("TC Failed");
		}
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("Total num of links are " + Links.size());
		
		for(int index=0;index<Links.size();index++) {
			
			System.out.println(Links.get(index).getAttribute("href"));
		}
		
		//Step 7: Close the browser
		driver.close();

	}

}
