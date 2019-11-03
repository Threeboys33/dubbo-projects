package dtstack.san.impl;

import dtstack.san.IHelloService;
import dtstack.san.RequestObject;
import dtstack.san.ResponseObject;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: 33
 * @time: 2019/11/3 0:08
 */

public class EchoSErviceImp implements IHelloService {
    @Override
    public ResponseObject sayHello(RequestObject requestObject) {
//        Thread.currentThread().sleep();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ResponseObject().setCode(200).setMsg("CLuster2 EchoHello Service invoke success").setData(requestObject);
    }
}
