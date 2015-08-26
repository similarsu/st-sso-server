package cn.st.sso.server.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.st.sso.server.entity.User;
import cn.st.sso.server.service.UserService;
import cn.st.sso.server.soa.view.DataView;
import cn.st.sso.server.util.Constant;
import cn.st.sso.server.util.Messages;
import cn.st.sso.server.util.TokenGenerator;
import cn.st.sso.server.util.TokenManager;
import cn.st.util.CookieUtil;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * <p>
 * desciption: 登录登出控制器
 * </p>
 * 
 * @author coolearth
 * @date 2015年7月27日
 */
@Controller
public class LoginController extends BaseController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String toLogin(@RequestParam(required = false) String redirectUrl, ModelMap modelMap) {
        modelMap.put("redirectUrl", redirectUrl);
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam String loginName, @RequestParam String password,
            @RequestParam(required = false) String redirectUrl, ModelMap modelMap,
            HttpServletResponse response) throws Exception {
        setErrorForward("login");
        User userTmp = userService.findByLoginNameAndPassword(loginName, password);
        if (userTmp == null) {
            Messages.setErrorMessage("error.login.errorAccPwd");
            modelMap.put("redirectUrl", redirectUrl);
            return "login";
        }
        getRequest().getSession().setAttribute(Constant.USER_SESSION, userTmp);
        String token = TokenGenerator.getToken();
        TokenManager.addToken(token, userTmp);
        CookieUtil.addCookie(response, Constant.TOKEN, token, null, "/", -1);
        if (StringUtils.isBlank(redirectUrl)) {
            return "redirect:/index/main";
        }
        return "redirect:" + redirectUrl;

    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        getRequest().getSession().removeAttribute(Constant.USER_SESSION);
        return "redirect:/login";
    }

    @RequestMapping(value = "/validate", method = RequestMethod.GET)
    @ResponseBody
    @JsonView(DataView.class)
    public User validate(@RequestParam(required = false) String token) {
        // return TokenManager.validateToken(token);
        User user = new User();
        user.setChineseName("黄首都");
        user.setPassword("xxx");
        user.setLoginName("admin");
        return user;
    }
}
