package cn.st.sso.server.util;

import java.util.UUID;

/**
 * <p>
 * desciption: token生成器
 * </p>
 * 
 * @author coolearth
 * @date 2015年8月20日
 */
public class TokenGenerator {

    private TokenGenerator() {

    }

    public static String getToken() {
        return UUID.randomUUID().toString().replaceAll("-", "").toLowerCase();
    }

}
