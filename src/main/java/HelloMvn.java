import org.apache.log4j.Logger;

/**
 * Created @2017/6/21 14:48
 */
public class HelloMvn {

    public static void main(String... args) {
        System.out.println("Hello mvn!!!");

        Logger.getLogger("XXX").info("Hello");
        Logger.getLogger("XXX").debug("Hello");
        Logger.getLogger("XXX").warn("Hello");
        Logger.getLogger("XXX").error("Hello");
    }
}
