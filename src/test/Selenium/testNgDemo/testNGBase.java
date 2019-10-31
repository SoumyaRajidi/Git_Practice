package testNgDemo;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGBase {
	public static Logger log;


	public  testNGBase() {
		log=Logger.getLogger("annotations");
		PropertyConfigurator.configure("C:\\Users\\soumy\\Documents\\soumya\\config\\log4j.properties");
		log.info("Constructor");
	}
	
	@Test
	public void testSoumyaAnnot() {
		log.info("Test annotation");
	}
	@Test
	public void testA(){
		log.info("this is testcaseA");
	}
	
	@Test
	public void testB() {
		log.info("this is testcaseB");
		System.out.println("testcaseB");
	}
	@BeforeClass
	public void beforeclass() {
		log.info("@before class annotation");
	}
	@AfterClass
	public void afterclass() {
		log.info("@after class annotation");	
	}

	@BeforeMethod
	public void beforemethod() {
		log.info("@before method annotation");

	}
	@AfterMethod
	public void aftermethod() {
		log.info("@after method annotation");	
	}

	@BeforeSuite
	public void beforesuit() {
		log.info("@before suit annotation");
	}
	
	@AfterSuite
	public void aftersuit(){
		log.info("@after suit annotation");

	}
	@BeforeTest
	public void beforetest() {
		log.info("@beforetest annotation");

	}
	@AfterTest
	public void aftertest() {
		log.info("@after test annotation");
	}
}