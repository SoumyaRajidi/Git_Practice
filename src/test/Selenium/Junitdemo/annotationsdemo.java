package Junitdemo;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configReader.log4j;

public class annotationsdemo {

	
	@Test
	public void openAmazon() {
	    Logger logger = Logger.getLogger("open amazon");
		PropertyConfigurator.configure("config/log4j.properties");
		System.setProperty("webdriver.chrome.driver", "C:\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:www.amazon.com");
		System.out.println("Title is"+driver.getTitle());
		System.out.println("Url is"+driver.getCurrentUrl());
		driver.manage().window().maximize();
        logger.info("amazon browser launched");
        String title=driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more",title);
		driver.quit();

	}
	@Test
	public void openSelenium() {
		Logger logger = Logger.getLogger("open selenium");
		PropertyConfigurator.configure("config/log4j.properties");
		System.setProperty("webdriver.chrome.driver", "C:\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.seleniumhq.org");
		logger.info("selenium browser launched");
		String title1=driver.getTitle();
		System.out.println(title1);
		Assert.assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more",title1);
		driver.quit();
	}
	@Test
	public void exception()
	{
	Logger logger = Logger.getLogger("Exception");
	PropertyConfigurator.configure("config/log4j.properties");
    System.setProperty("webdriver.chrome.driver", "C:\\lib\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	ArrayList list=new ArrayList();
	System.out.println(list.get(2));
	logger.error("exception given");
	
			
			}
		
	}

