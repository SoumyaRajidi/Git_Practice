package testNgDemo;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class testSequence {
	@Test (priority=2, description="this is priority 2", dependsOnMethods="testc")
	public void testa() {
	System.out.println("test a");	
    
	}
	@Test(priority=1)
	public void testb(){
	System.out.println("test b");	
    
	}
	@Test(priority=3)
	public void testc() {
	List list=new ArrayList();
	list.get(2);
	
    
	}
	
}


