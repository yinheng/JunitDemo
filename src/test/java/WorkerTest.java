import org.junit.Assert;
import org.junit.Test;

/**
 * Created @2017/6/21 14:50
 */

public class WorkerTest {

    @Test
    public void testWorker() {
        // 需要添加依赖。
        // 去仓库搜索就可以了。

        Assert.assertTrue(new Worker().doSomeWork());

        // 还可以在终端运行测试。
        // 模拟一个失败的。
    }

    @Test
    public void mockFail() {
        Assert.fail();
    }
}
