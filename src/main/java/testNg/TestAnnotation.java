package testNg;

import org.testng.annotations.Test;

public class TestAnnotation {
	
	@Test (dependsOnMethods={"tc02","tc05"})
	void tc01() {
		System.out.println("Test 1");
	}
	@Test (groups= "software")
	void tc02() {
		System.out.println("Test 2");
	}

	@Test (groups="software") //it will help to set limited time
	void tc03() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test 3");
	}

	//high priority 1  5000low priority 
	
	@Test 
	void tc04() {
		System.out.println("Test 4");
	}

	@Test //it will rum before test 5
	void tc05() {
		System.out.println("Test 5");
	}
}

// depends on :When 1 test case depend on anothe so wherewe use depend 
