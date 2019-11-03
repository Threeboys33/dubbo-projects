package dtstack.san;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        IHelloService iHelloService = null;
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-user.xml");
        iHelloService = (IHelloService) context.getBean("helloService");
        ResponseObject responseObject = iHelloService.sayHello(new RequestObject().setID("1"));
        System.err.println(responseObject);

    }
}
