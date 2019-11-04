package Selenium;

import java.time.LocalTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\lib\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http:www.naukri.com");
				System.out.println("time is"+LocalTime.now());
				//Thread.sleep(8000);
				driver.manage().window().fullscreen();
				driver.manage().window().maximize();
				driver.close();
				driver.quit();
				

	}

}
