package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("wbdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement CreateNew = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		CreateNew.click();
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("Test");
		
		WebElement LastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		LastName.sendKeys("Bot");
		
		WebElement EmailOrMobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		EmailOrMobile.sendKeys("0867856745");
		
		//WebElement EmailConf = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		//EmailConf.sendKeys("testbot@gmail.com");
		
		WebElement NewPassword = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		NewPassword.sendKeys("abc123456!");
		
		WebElement Day = driver.findElement(By.name("birthday_day"));
		Select ddDay = new Select(Day);
		ddDay.selectByVisibleText("1");
		
		WebElement Month = driver.findElement(By.name("birthday_month"));
		Select ddMonth = new Select(Month);
		ddMonth.selectByVisibleText("Feb");
		
		WebElement Year = driver.findElement(By.name("birthday_year"));
		Select ddYear = new Select(Year);
		ddYear.selectByVisibleText("1986");
		
//		List<WebElement> Days = ddDay.getOptions();
//		for(WebElement elm: Days) {
//			System.out.println(elm.getText());
//		}
//		
//		List<WebElement> Months = ddMonth.getOptions();
//		for(WebElement elm: Months) {
//			System.out.println(elm.getText());
//		}
//		
//		List<WebElement> Years = ddYear.getOptions();
//		for(WebElement elm: Years) {
//			System.out.println(elm.getText());
//		}
		
		List<WebElement> AllMonths = driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
		for(WebElement elm: AllMonths) {
			System.out.println(elm.getText());
		}
		
		System.out.println("Selected Month is " + ddMonth.getFirstSelectedOption().getText());
		
//		List<WebElement> SelectedMonth = driver.findElements(By.xpath("//select[@name='birthday_month']/option[@selected='1'"));
//		for(WebElement elm: SelectedMonth) {
//			System.out.println(elm.getText());
//		}
		
		String Gender = "Female";
		
//		WebElement Female = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
//		WebElement Male = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
//		WebElement Custom = driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
//		
//		if(Gender.equals("Female")) {
//			Female.click();
//		}else if(Gender.equals("Male")) {
//			Male.click();
//		}else {
//			Custom.click();
//		}

//String Xpath = "//label[text()='Placeholder']/following-sibling::*";
//String newXpath = Xpath.replace("PlaceHolder", Gender);
//WebElement GenderRadioBtn = driver.findElement(By.xpath(newXpath));
		
		WebElement GenderRadioBtn = driver.findElement(By.xpath("//label[text()='" + Gender + "']/following-sibling::*"));
		
		GenderRadioBtn.click();

		//driver.close();
		
	}

}
