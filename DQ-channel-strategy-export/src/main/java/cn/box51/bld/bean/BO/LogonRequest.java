package cn.box51.bld.bean.BO;

import com.rop.AbstractRopRequest;
import com.rop.annotation.IgnoreSign;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by wq on 2018/1/22.
 */
public class LogonRequest extends AbstractRopRequest {

    @NotNull
    @Pattern(regexp = "\\w{4,30}")
    private String userName;

    @IgnoreSign
    @Pattern(regexp = "\\w{6,30}")
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}