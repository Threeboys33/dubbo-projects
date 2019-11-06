package dtstack.san;

import java.io.Serializable;

/**
 * @description: 响应结果
 * @author: 33
 * @time: 2019/11/2 23:53
 */

public class ResponseObject implements Serializable {

    private static final long serialVersionUID = 3398774812184718097L;
    private int code;
    private String msg;
    private Object data;

    public int getCode() {
        return code;
    }

    public ResponseObject setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResponseObject setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return data;
    }

    public ResponseObject setData(Object data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "ResponseObject: [ code:"+ code + ", msg:\'"+ msg +"\', date:\'"+ data +"\']";
    }
}
