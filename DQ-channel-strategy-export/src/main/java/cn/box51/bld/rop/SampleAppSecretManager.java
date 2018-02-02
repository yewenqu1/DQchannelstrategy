package cn.box51.bld.rop;
import com.rop.security.AppSecretManager;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * 功能说明：
 * </pre>
 *
 * @author 陈雄华
 * @version 1.0
 */
public class SampleAppSecretManager implements AppSecretManager {

    private static Map<String, String> appKeySecretMap = new HashMap<String, String>();

    static {
        appKeySecretMap.put("00001", "abcdeabcdeabcdeabcdeabcde");
        appKeySecretMap.put("00002","abcdeabcdeabcdeabcdeaaaaa");
        appKeySecretMap.put("00003","abcdeabcdeabcdeabcdeaaaaa");
    }


    public String getSecret(String appKey) {
        System.out.println("use SampleAppSecretManager!");
        return appKeySecretMap.get(appKey);
    }


    public boolean isValidAppKey(String appKey) {
        return getSecret(appKey) != null;
    }
}

