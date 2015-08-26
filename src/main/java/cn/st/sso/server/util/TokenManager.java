package cn.st.sso.server.util;

import java.util.HashMap;

import cn.st.sso.server.entity.User;

/**
 * <p>
 * desciption: token管理
 * </p>
 * 
 * @author coolearth
 * @date 2015年8月20日
 */
public class TokenManager {
    private TokenManager() {

    }

    private static HashMap<String, User> dataMap = new HashMap<String, User>();

    /**
     * 添加token
     * 
     * @param token
     * @param user
     */
    public static void addToken(String token, User user) {
        dataMap.put(token, user);
    }

    /**
     * 移除token
     * 
     * @param token
     */
    public static void removeToken(String token) {
        dataMap.remove(token);
    }

    /**
     * 验证token
     * 
     * @param token
     * @return
     */
    public static User validateToken(String token) {
        return dataMap.get(token);
    }
}
