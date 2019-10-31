package Elementidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException{
		String url="https://mail.rediff.com/cgi-bin/login.cgi";
		String driverpath="C:\\lib\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath );
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().fullscreen();
		WebElement txtTitle =driver.findElement(By.xpath("//input[@id='login1']"));
		txtTitle.sendKeys("Soumya.rajidi");
		Thread.sleep(2000);
		txtTitle.clear();
		Thread.sleep(2000);
		txtTitle.sendKeys("updated");
		
		
		

	}

}
