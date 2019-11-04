package Elementidentification;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		PropertyConfigurator.configure("config/log4j.properties");
	    Logger logger = Logger.getLogger(LinkText.class);
		String url="https://mail.rediff.com/cgi-bin/login.cgi";
		String driverpath="C:\\lib\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath );
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().fullscreen();
		logger.info("chrome browser is launched");
		WebElement linkCreateAcc =driver.findElement(By.linkText("Create a new account"));
		linkCreateAcc.click();

	}

}
