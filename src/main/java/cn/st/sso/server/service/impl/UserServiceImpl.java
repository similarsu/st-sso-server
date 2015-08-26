package cn.st.sso.server.service.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.st.mybatis.core.service.impl.BaseServiceImpl;
import cn.st.sso.server.entity.User;
import cn.st.sso.server.mapper.UserMapper;
import cn.st.sso.server.service.UserService;

/**
 * <p>
 * desciption:
 * </p>
 * 
 * @author coolearth
 * @date 2015年8月4日
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @PostConstruct
    public void injectBaseMapper() {
        // TODO Auto-generated method stub
        super.injectBaseMapper(userMapper);
    }

    @Override
    public User findByLoginNameAndPassword(String loginName, String password) {
        // TODO Auto-generated method stub
        User user = new User();
        user.setLoginName(loginName);
        user.setPassword(password);
        return userMapper.findByLoginNameAndPassword(user);
    }



}
