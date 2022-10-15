import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
    @Test
    public void testFilter() {
        StringCheckerClass sc = new StringCheckerClass("l");
        String input1 = "Hello";
        List<String> expected = new List<String>();
        assertEquals(expected, ListExamples.filter(input1, sc));
    }
}