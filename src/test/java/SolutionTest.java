import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {
    private int input1;
    private int input2;
    private int expected;
    private Solution soln = new Solution1();

    public SolutionTest(int input1, int input2, int output) {
        this.input1 = input1;
        this.input2 = input2;
        this.expected = output;
    }

    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][]{
                {3, 2, 3},
                {7, 3, 28}
        });
    }

    @Test
    public void testFunction() {
        assertEquals(expected, soln.uniquePaths(input1, input2));
    }
}