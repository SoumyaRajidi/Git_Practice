package TestBase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import configReader.log4j;

public class Domainobject {
	public String browser;
	public String url;
	public String usename;
	public String password;
	public static WebDriver driver;
	public static Logger logger;
	public String environment;
	public String testurl;
	public String stageurl;
   String ProFileLoc= "config/configaration.properties";

}
