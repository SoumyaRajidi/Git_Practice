package Elementidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathStartsWith {

	public static void main(String[] args) {
		String url="https://register.rediff.com/register/register.php?FormName=user_details";
		String driverpath="C:\\lib\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath );
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().fullscreen();
		WebElement txtTitle =driver.findElement(By.xpath("//input[starts-with(@name,'name')]"));
		txtTitle.sendKeys("SOUMYA RAJIDI");
		WebElement txtTitle1 =driver.findElement(By.xpath("//input[contains(@name,'login')]"));
		txtTitle1.sendKeys("ID");
		

	}

}
