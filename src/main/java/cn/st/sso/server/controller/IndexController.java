package cn.st.sso.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * desciption:首页控制器
 * </p>
 * 
 * @author coolearth
 * @date 2015年8月19日
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    @RequestMapping("/main")
    public String toMain() {
        return "main";
    }

    @RequestMapping("/left")
    public String toLeft() {
        return "left";
    }

    @RequestMapping("/default")
    public String toDefault() {
        return "default";
    }
}
