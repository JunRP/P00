import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
		//fail("Not yet implemented");
		public final void testAdd() {
			//fail("Not yet implemented");
			int a = 1234;
			int b = 8765;
			
			Calculator cal = new Calculator();
			int actual = cal.add(a, b);
			
			int expected = 9999;
			assertEquals (expected,actual);
		}
		
		@Test
		public final void testSubtract() {
			int a = 9876;
			int b = 4321;
			
			Calculator cal = new Calculator();
			int actual = cal.subtract(a, b);
			int expected = 5555;
			
			assertEquals (actual,expected);
		}
		
		@Test
		public final void testMultiple() {
			int a = 2222;
			int b = 1111;
			
			Calculator cal = new Calculator();
			int actual = cal.multiply(a, b);
			int expected = 2468642;
			
			assertEquals (actual,expected);
		}
		@Test
		public final void testDivision() {
			int a = 20;
			int b = 2;
			
			Calculator cal = new Calculator();
			int actual = cal.division(a, b);
			int expected = 10;
			
			assertEquals (actual,expected);
		
	
	}

}
