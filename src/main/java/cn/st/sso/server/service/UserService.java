package cn.st.sso.server.service;

import cn.st.mybatis.core.service.BaseService;
import cn.st.sso.server.entity.User;

/**
 * <p>
 * desciption:
 * </p>
 * 
 * @author coolearth
 * @date 2015年8月4日
 */
public interface UserService extends BaseService<User> {
    public User findByLoginNameAndPassword(String loginName, String password);
}
