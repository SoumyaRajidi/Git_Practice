package TestBase;

import java.io.IOException;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import configReader.configarationReader;

public class testbase extends configarationReader {
	@Before
	public void initialise() throws IOException   {
		initializelog4j();
		ConfigReader();
		launchBrowser();
		enterurl();
	}

	private void enterurl() {
		if(environment.equalsIgnoreCase("test")) {
			url=testurl;
		}
		else
			if(environment.equalsIgnoreCase("stage")) {
				url=stageurl;
			}
		driver.get(url);
		
	}

	private void launchBrowser() {
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		logger.info("chrome driver is launched");
	}
		else
			if(browser.equalsIgnoreCase("ie")) {
			
		System.setProperty("webdriver.IE.driver", ".\\Drivers\\IEdriverServer.exe");
		driver=new InternetExplorerDriver();
		
	}

}
}
