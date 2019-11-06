package dtstack.san;

import java.io.Serializable;

/**
 * @description: 请求传入参数
 * @author: 33
 * @time: 2019/11/2 23:53
 */

public class RequestObject implements Serializable {
    private String username;
    private String ID;

    public String getUsername() {
        return username;
    }

    public RequestObject setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getID() {
        return ID;
    }

    public RequestObject setID(String ID) {
        this.ID = ID;
        return this;
    }

    @Override
    public String toString() {
        return "RequestObject: [username:\'" + username + "\', ID:\'" + ID + "\']";
    }
}
