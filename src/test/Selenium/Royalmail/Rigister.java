package Royalmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rigister {

	public static void main(String[] args) {
		String url="https://www.royalmail.com/user/register/personal";
		String driverpath="C:\\lib\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath );
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().fullscreen();
		//WebElement droptxt=

	}

}
