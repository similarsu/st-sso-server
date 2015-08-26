package cn.st.sso.server.mapper;

import cn.st.mybatis.core.mapper.BaseMapper;
import cn.st.sso.server.entity.User;

/**
 * <p>
 * desciption:
 * </p>
 * 
 * @author coolearth
 * @date 2015年8月3日
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * @param user
     * @return
     */
    public User findByLoginNameAndPassword(User user);
}
