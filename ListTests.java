import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;
import java.util.*;

public class ListTests {
    @Test
    public void testFilter() {
        String[] stringCheckerArray = {"David Bowie", "Thom Yorke", "Kevin Shields", "Lou Reed"};
        ArrayList<String> stringCheckerArrayList = new ArrayList<String>(
            Arrays.asList(stringCheckerArray)
        );
        StringCheckerClass sc = new StringCheckerClass(stringCheckerArrayList);
        List<String> input1 = new ArrayList<String>();
        List<String> expected = new ArrayList<String>();

        input1.add("David Bowie");
        input1.add("Thom Yorke");
        input1.add("Kevin Shields");
        input1.add("Lou Reed");
        
        expected.add("David Bowie");
        expected.add("Thom Yorke");
        expected.add("Kevin Shields");
        expected.add("Lou Reed");

        assertThat(ListExamples.filter(input1, sc), is(expected));
    }
}