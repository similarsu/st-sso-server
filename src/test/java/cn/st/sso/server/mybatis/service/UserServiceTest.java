package cn.st.sso.server.mybatis.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.st.mybatis.core.support.Pager;
import cn.st.sso.server.BaseTest;
import cn.st.sso.server.entity.User;
import cn.st.sso.server.service.UserService;

/**
 * <p>
 * desciption:
 * </p>
 * 
 * @author coolearth
 * @date 2015年8月4日
 */
public class UserServiceTest extends BaseTest {
    @Autowired
    private UserService userService;

    @Test
    public void load() {
        User user = userService.load(1l);
        System.out.println(user);
    }

    @Test
    public void add() {
        User user = new User();
        user.setChineseName("XXX");
        user.setLoginName("XXX");
        user.setPassword("xxx");
        userService.add(user);
    }

    @Test
    public void findAll() {
        List<User> userList = userService.findAll(null);
        for (User u : userList) {
            System.out.println(u);
        }
    }

    @Test
    public void findPage() {
        Pager<User> pager = new Pager<User>(1, 1);
        User user = new User();
        user.setOrderStr("create_date desc");
        user.setPager(pager);
        pager = userService.findPage(user);
        List<User> userList = pager.getList();
        for (User u : userList) {
            System.out.println(u);
        }

    }

}
