package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class testbase2 extends Domainobject {
	@BeforeSuite 
	public void initialize() throws IOException{
		logger = logger.getLogger("testbase2");
		initializelog4j();
		ConfigReader();
		launchBrowser();
		//enterurl();
	}
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		logger.info("browser closing @after suite");
	}
		@BeforeClass
		public void beforeclass() {
			logger.info("@BeforeClass");
			
		}
	  @AfterClass
	  public void AfettrClass() {
		  logger.info("@AfterClass");
		  
	  }
	@BeforeMethod
	public void BeforeMethod() {
		logger.info("@BeforeMethod");
		}
	@AfterMethod
	public void closingBrowser() {
		//driver.quit();
		logger.info("@after method");
	}
	@org.testng.annotations.BeforeTest
	public void BeforeTest() {
		logger.info("@BeforeTest");
		}
	@org.testng.annotations.AfterTest
	public void AfterTest() {
		//driver.quit();
		logger.info("@AfterTest");
	}

	private void enterUrl() {
		//logger = logger.getLogger("testbase2");
    logger.info("environment selelcted :" + environment);
	if(environment.equalsIgnoreCase("test")) {
		url=testurl;
	}
	
	else
		if(environment.equalsIgnoreCase("stage")) {
			url=stageurl;
		}
	logger.info("url selected "+url);
	driver.get(url);
	}
	protected void enterUrl(String url) {
		//logger = logger.getLogger("testbase2");
		logger.info("url selected "+url);
		driver.get(url);
	}
	private void launchBrowser() {
		//logger = logger.getLogger("testbase2");
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		logger.info("chrome browser is launched");
	}
		else
			if(browser.equalsIgnoreCase("ie")) {
			
		System.setProperty("webdriver.IE.driver", ".\\Drivers\\IEdriverServer.exe");
		driver=new InternetExplorerDriver();
		
	}
	}
  //properties file
	public void ConfigReader() throws IOException{
		//logger = logger.getLogger("testbase2");
		File file=new File(ProFileLoc);
		FileInputStream infile=new FileInputStream (file);
		Properties prop=new Properties();
		prop.load(infile);
		browser=prop.getProperty("browser");
		logger.info("browser selected from the properties "+browser);
	    url=prop.getProperty("testurl");
		logger.info("url selected from the properties "+url);
		
	}

	private void initializelog4j() {
		//logger = logger.getLogger("testbase2");
		//PropertiesConfigurator is used to configure logger from properties file
        PropertyConfigurator.configure("config/log4j.properties");
 
        //Log in console in and log file
        logger.info("Log4j initialised successfully!");
		
	}
}
	


