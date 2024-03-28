package question3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FibonacciSeriesTest {

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
	    public void testGenerateFibonacci() {
	        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
	        assertArrayEquals(expected, FibonacciSeries.generateFibonacci(10));
	    }

	    @Test
	    public void testGenerateFibonacciWithNegativeTerms() {
	        assertThrows(IllegalArgumentException.class, () -> FibonacciSeries.generateFibonacci(-5));
	    }

}