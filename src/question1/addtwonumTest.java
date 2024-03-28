package question1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class addtwonumTest {

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
	    public void testAddPositiveNumbers() {
	        assertEquals(12, addtwonum.add(5, 7));
	    }

	    @Test
	    public void testAddNegativeNumbers() {
	        assertEquals(-2, addtwonum.add(-5, 3));
	    }
}