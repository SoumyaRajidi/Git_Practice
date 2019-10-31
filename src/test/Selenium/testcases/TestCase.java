package testcases;

import org.testng.annotations.Test;

import com.sun.org.slf4j.internal.Logger;

import TestBase.testbase;
import TestBase.testbase2;

public class TestCase extends testbase2 {
	@Test
	public void TestCase() {
		logger = logger.getLogger("TestCase");
		enterUrl("http://seleniumhq.org");
		
	}
}
