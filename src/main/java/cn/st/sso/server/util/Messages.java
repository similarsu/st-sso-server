package cn.st.sso.server.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * <p>
 * desciption: 提示信息处理
 * </p>
 * 
 * @author coolearth
 * @date 2015年8月20日
 */
public final class Messages {
    private static final Logger LOGGER = LoggerFactory.getLogger(Messages.class);

    private static final String MESSAGE_SUCCESS = "message_success";

    private static final String MESSAGE_WARN = "message_warn";

    private static final String MESSAGE_ERROR = "message_error";

    private static HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
                .getRequest();
    }

    /**
     * 设置成功信息
     * 
     * @param message
     */
    public static void setSuccessMessage(String message) {
        HttpSession session = getRequest().getSession(false);
        if (null != session) {
            session.setAttribute(MESSAGE_SUCCESS, message);
        } else {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("set success msg:{}", message);
            }
        }
    }

    /**
     * 设置警告信息
     * 
     * @param message
     */
    public static void setWarnMessage(String message) {
        HttpSession session = getRequest().getSession(false);
        if (null != session) {
            session.setAttribute(MESSAGE_WARN, message);
        } else {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("set warn msg:{}", message);
            }
        }
    }

    /**
     * 设置错误信息
     * 
     * @param message
     */
    public static void setErrorMessage(String message) {
        HttpSession session = getRequest().getSession(false);
        if (null != session) {
            session.setAttribute(MESSAGE_ERROR, message);
        } else {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("set error msg:{}", message);
            }
        }
    }
}
