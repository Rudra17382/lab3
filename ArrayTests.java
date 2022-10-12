import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


    @Test
    public void testReversed() {
        int[] input1 = { };
        assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    }

    // New Tests

    @Test 
    public void testReverseInPlace1() {
    int[] input1 = { 3, 4, 5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 5, 4, 3 }, input1);
    }
    
    @Test
    public void testReversed1() {
      int[] input1 = { 3, 4, 5 };
      assertArrayEquals(new int[]{ 5, 4, 3 }, ArrayExamples.reversed(input1));
    }

    @Test
    public void testAverageWithoutLowest() {
        double[] input1 = { 1.0, 1.0, 1.0, 2.0, 3.0 };

        assertEquals(2.5, ArrayExamples.averageWithoutLowest(input1), 0);
    }
}
