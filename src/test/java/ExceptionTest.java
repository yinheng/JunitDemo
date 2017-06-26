import org.junit.Test;

/**
 * Created @2017/6/25 17:28
 */
public class ExceptionTest {
    @Test(expected =  ArithmeticException.class, timeout = 1000)
    public void divisionWithException() {
       while (true);

    }
}
