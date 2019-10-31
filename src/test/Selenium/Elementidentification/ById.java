package Elementidentification;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import configReader.log4j;

public class ById {

	public static void main(String[] args) {
		PropertyConfigurator.configure("config/log4j.properties");
	    Logger logger = Logger.getLogger(ById.class);
		System.setProperty("webdriver.chrome.driver", "C:\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.weddingshop.com/register");
		driver.manage().window().fullscreen();
		logger.info("chrome browser is launched");
		logger.error("browser launching failed");
		WebElement txtTitle =driver.findElement(By.id("title"));
        txtTitle.sendKeys("SoumyaRajidi");
        driver.findElement(By.id("title")).sendKeys("Updated");
        //driver.navigate().to("https://login.yahoo.com/");
        //driver.findElement(By.id("login-username")).sendKeys("soumya.rajidi@yahoo.com");
       // driver.findElement(By.id("login-signin")).click();
	}

}
