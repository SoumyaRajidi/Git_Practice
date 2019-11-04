package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basiccommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:www.amazon.com");
		System.out.println("Title is"+driver.getTitle());
		System.out.println("Url is"+driver.getCurrentUrl());
		driver.manage().window().maximize();
		driver.navigate().to("http://www.seleniumhq.org");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
