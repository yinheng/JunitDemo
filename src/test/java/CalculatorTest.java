import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created @2017/6/25 16:27
 */

@RunWith(Parameterized.class)
public class CalculatorTest {

    private int a, b, expected;

    public CalculatorTest(int expected, int a, int b) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "XXXX-{index}:a={0}, b={1}")
    public static List createParams() {

        Integer[] test1 = new Integer[]{4, 1, 3};

        Integer[] test2 = new Integer[]{5, 2, 3};

        ArrayList list = new ArrayList();
        list.add(test1);
        list.add(test2);

        return Arrays.asList(test1, test2);
    }


    @Test
    public void sum() throws Exception {
        Calculator c = new Calculator();
        Assert.assertEquals(expected, (c.sum(a, b)));
    }

}