import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	//public final void findMaxTest1() {
		//fail("Not yet implemented");
		//System.out.println("This is the testcase for HelloWorld");
        //String str1="This is the testcase for HelloWorld";
        //String str2="This is the testcase for HelloWorld";
        //assertEquals(str1, str2);
		//int[] arrA = {1,3,2,4};
		//assertEquals("test if biggest integer is 4", 3, HelloWorld.findMax(arrA));

	//}
	
	public final void findMaxTest2() {
		int[] arrB = {-11,-3,-1, -2,-4};
		assertEquals("test if biggest integer is -1", -1, HelloWorld.findMax(arrB));
	}
}
