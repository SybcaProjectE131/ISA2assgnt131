package question4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CountDigitsTest {

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
    public void testCountDigitsPositive() {
        assertEquals(4, CountDigits.countDigits(1234));
    }

    @Test
    public void testCountDigitsZero() {
        assertEquals(1, CountDigits.countDigits(0));
    }

}