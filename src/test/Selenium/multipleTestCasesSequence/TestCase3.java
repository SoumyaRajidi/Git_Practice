package multipleTestCasesSequence;

import org.testng.annotations.Test;

import TestBase.testbase2;

public class TestCase3 extends testbase2{
	@Test(priority=3)
	public void test3(){
		System.out.println("this is testcase3");
	}
}
