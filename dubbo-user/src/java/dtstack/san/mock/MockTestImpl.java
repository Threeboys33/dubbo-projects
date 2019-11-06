package dtstack.san.mock;

import dtstack.san.IHelloService;
import dtstack.san.RequestObject;
import dtstack.san.ResponseObject;

/**
 * @description:
 * @author: 33
 * @time: 2019/11/6 20:53
 */

public class MockTestImpl implements IHelloService {
    @Override
    public ResponseObject sayHello(RequestObject request) {
        return new ResponseObject().setCode(502).setMsg("<Mock>  Service invoke success").setData(request);
    }
}
