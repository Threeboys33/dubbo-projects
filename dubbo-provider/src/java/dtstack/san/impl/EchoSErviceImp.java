package dtstack.san.impl;

import dtstack.san.IHelloService;
import dtstack.san.RequestObject;
import dtstack.san.ResponseObject;

/**
 * @description:
 * @author: 33
 * @time: 2019/11/3 0:08
 */

public class EchoSErviceImp implements IHelloService {
    @Override
    public ResponseObject sayHello(RequestObject requestObject) {
        return new ResponseObject().setCode(200).setMsg("EchoHello Service invoke success").setData(requestObject);
    }
}
