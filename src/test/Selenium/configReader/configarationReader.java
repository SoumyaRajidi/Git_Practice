package configReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class configarationReader {
	String ProFileLoc= "config/configaration.properties";
	public String browser;
	public String url;
	public String environment; 
	public static WebDriver driver;
	public String testurl;
	public String stageurl;
	
	public static Logger logger = Logger.getLogger(log4j.class);
	
	protected void ConfigReader() throws IOException {
		File file=new File(ProFileLoc);
		FileInputStream infile=new FileInputStream (file);
		Properties prop=new Properties();
		prop.load(infile);
		logger.info("properties file initialised");
		browser=prop.getProperty("browser");
		testurl=prop.getProperty("testurl");
		stageurl=prop.getProperty("stageurl");
	    environment = prop.getProperty("environment");
}
	protected void initializelog4j() {
		 //PropertiesConfigurator is used to configure logger from properties file
        PropertyConfigurator.configure("config/log4j.properties");
 
        //Log in console in and log file
        logger.debug("Log4j appender configuration is successful !!");
	}
}
