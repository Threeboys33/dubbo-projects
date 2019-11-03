package dtstack.san;

import com.alibaba.dubbo.rpc.RpcContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        IHelloService iHelloService = null;
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-user.xml");
        iHelloService = (IHelloService) context.getBean("helloService");
//        ResponseObject responseObject = iHelloService.sayHello(new RequestObject().setID("1"));

        iHelloService.sayHello(new RequestObject().setID("1"));
        Future<ResponseObject> future = RpcContext.getContext().getFuture();
        System.out.println("异步调用之前");
        ResponseObject responseObject = future.get();
        System.err.println(responseObject);

    }
}
