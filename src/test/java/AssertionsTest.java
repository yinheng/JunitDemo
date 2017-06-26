import org.junit.Assert;
import org.junit.Test;

import static java.lang.Thread.sleep;
import static junit.framework.TestCase.assertEquals;

/**
 * Created @2017/6/25 11:21
 */
public class AssertionsTest {

    private String obj1 = "test";
    private String obj2 = "test";
    private String obj3 = "hello";
    private String obj4 = new String("hello");

    private int[] array1 = {1, 2, 3};
    private int[] array2 = {1, 2, 3};

    @Test
    public void testAssertions() throws InterruptedException {

        new Thread(new Runnable() {
            public void run() {
                System.out.println("BBBB");
            }
        }).start();

        assertEquals(obj1, obj2);
        // Assert.assertSame(obj3, obj4);
        Assert.assertNotSame(obj3, obj4);
        Assert.assertNotNull(obj1);
//        Assert.assertNull(obj1);
        Assert.assertArrayEquals(array1, array2);
        Assert.assertTrue(obj1.equals(obj2));

        System.out.println("AAAA");

        sleep(1000);
    }
}
