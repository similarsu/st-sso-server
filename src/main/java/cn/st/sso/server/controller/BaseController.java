package cn.st.sso.server.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import cn.st.sso.server.entity.User;
import cn.st.sso.server.util.Constant;

/**
 * <p>
 * desciption:基类控制类
 * </p>
 * 
 * @author coolearth
 * @date 2015年8月19日
 */
public class BaseController {

    @InitBinder
    public void initBider(WebDataBinder webDataBinder) {
        webDataBinder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    protected final static String ERROR = "error";

    protected HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
    }

    /**
     * 设置错误跳转页
     * 
     * @param uri
     */
    protected void setErrorForward(String uri) {
        this.getRequest().setAttribute("errorForward", uri);
    }

    /**
     * 获取用户session
     * 
     * @return
     */
    protected User getUserSession() {
        return (User) this.getRequest().getSession().getAttribute(Constant.USER_SESSION);
    }

    /**
     * 获取客户端ip
     * 
     * @return
     */
    protected String getClientIp() {
        String ipAddress = null;
        ipAddress = this.getRequest().getHeader("x-forwarded-for");
        if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = this.getRequest().getHeader("Proxy-Client-IP");
        }
        if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = this.getRequest().getHeader("WL-Proxy-Client-IP");
        }
        if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = this.getRequest().getRemoteAddr();
            if (ipAddress.equals("127.0.0.1")) {
                // 根据网卡取本机配置的IP
                InetAddress inet = null;
                try {
                    inet = InetAddress.getLocalHost();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                ipAddress = inet.getHostAddress();
            }

        }

        // 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
        if (ipAddress != null && ipAddress.length() > 15) { // "***.***.***.***".length() = 15
            if (ipAddress.indexOf(",") > 0) {
                ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
            }
        }
        return ipAddress;
    }
}
