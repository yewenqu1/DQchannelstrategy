package cn.box51.bld;

import cn.box51.bld.bean.BO.LogonRequest;
import cn.box51.bld.bean.BO.LogonResponse;
import com.rop.MessageFormat;
import com.rop.client.CompositeResponse;
import com.rop.client.DefaultRopClient;

/**
 * Created by wq on 2018/1/23.
 */
public class RopCilentTest {

    public static void main(String[] args) {

        DefaultRopClient client = new DefaultRopClient(
                "http://localhost:8081/router",
                "00001",
                "abcdeabcdeabcdeabcdeabcde",
                MessageFormat.json
        );

        LogonRequest request = new LogonRequest();
        request.setUserName("1234");
        request.setPassword("123567");

        CompositeResponse compositeResponse =  client.buildClientRequest().post(request, LogonResponse.class,"user.logon","1.0");

        System.out.println(((LogonResponse)compositeResponse.getSuccessResponse()).getSessionId());
    }
}
