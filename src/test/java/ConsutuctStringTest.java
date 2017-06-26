import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created @2017/6/25 16:43
 */
@RunWith(Parameterized.class)
public class ConsutuctStringTest {

    private String string1, string2, string3, expect;

    public  ConsutuctStringTest(String string1,  String string2, String string3, String expect ) {
        this.string1 = string1;
        this.string2 = string2;
        this.string3 = string3;
        this.expect = expect;
    }

    @Parameterized.Parameters
    public static Collection createParams() {
        String[] str1 = new String[] {"h", "e", "l", "hel"};
        String[] str2 = new String[] {"w", "o", "r", "wor"};

        ArrayList arrayList = new ArrayList();

        arrayList.add(str1);
        arrayList.add(str2);

        return arrayList;
    }

    @Test
    public void combineString() {
        ConsutuctString consutuctString = new ConsutuctString();
        Assert.assertEquals(expect, consutuctString.combineString(string1, string2, string3));
    }
}