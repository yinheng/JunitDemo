import org.junit.*;

/**
 * Created @2017/6/25 11:06
 */
public class AnnotationsTest {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("@beforeClass");
    }

    @Before
    public void before() {
        System.out.println("@before");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("@afterClass");
    }

    @After
    public void after() {
        System.out.println("@after");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

    @Ignore
    @Test
    public void test3() {
        System.out.println("Test 3");
    }


}
