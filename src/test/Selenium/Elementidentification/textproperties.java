package Elementidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textproperties {

	public static void main(String[] args) {
		String url="https://www.totaljobs.com/account/register";
		String driverpath="C:\\lib\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath );
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().fullscreen();
		WebElement txtFirstName =driver.findElement(By.xpath("//input[@id='firstname']"));
		 txtFirstName.sendKeys("soumya");
		 WebElement txtsure =driver.findElement(By.id("surname"));
		 txtsure.sendKeys("rajidi");
		 WebElement txtmailid =driver.findElement(By.xpath("//input[@id='email']"));
		 txtmailid.sendKeys("soumya.rjaidi@gmail.com");
		 WebElement lable1 =driver.findElement(By.xpath("//select[@name='educationId']"));
		 lable1.click();

	}

}
