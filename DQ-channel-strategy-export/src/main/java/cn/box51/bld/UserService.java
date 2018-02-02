package cn.box51.bld;

import cn.box51.bld.bean.BO.LogonRequest;
import cn.box51.bld.bean.BO.LogonResponse;
import com.rop.annotation.IgnoreSignType;
import com.rop.annotation.NeedInSessionType;
import com.rop.annotation.ServiceMethod;
import com.rop.annotation.ServiceMethodBean;
import com.rop.client.DefaultRopClient;
import com.rop.session.SimpleSession;

/**
 * Created by wq on 2018/1/22.
 */
@ServiceMethodBean(ignoreSign= IgnoreSignType.YES)
public class UserService {

    @ServiceMethod(method = "user.logon",version = "1.0",needInSession = NeedInSessionType.NO)
    public Object logon(LogonRequest request) {
        //创建一个会话
        SimpleSession session = new SimpleSession();
        session.setAttribute("userName",request.getUserName());
        request.getRopRequestContext().addSession("mockSessionId1", session);
        //返回响应
        LogonResponse logonResponse = new LogonResponse();
        logonResponse.setSessionId("mockSessionId1");

        return logonResponse;
    }
}
