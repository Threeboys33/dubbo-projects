package dtstack.san.dubbo.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *
 * @author 33
 * @version 1.0.0
 */
public class MyProtocolTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-user.xml"});
        context.start();

//        Protocol myProtocol = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("myProtocol");
//        int defaultPort = myProtocol.getDefaultPort();
//        System.out.println(defaultPort);

        System.out.println(ExtensionLoader.getExtensionLoader(Protocol.class).getDefaultExtension().getDefaultPort());
    }
}
