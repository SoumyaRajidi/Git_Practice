package testcases;

import java.util.logging.Logger;

import org.testng.annotations.Test;

import testNgDemo.testNGBase;

public class testcaseA extends testNGBase{
	@Test
	public void testA(){
		log.info("this is testcaseA");
	}
	
	@Test
	public void testB() {
		log.info("this is testcaseB");
		System.out.println("testcaseB");
	}
}
