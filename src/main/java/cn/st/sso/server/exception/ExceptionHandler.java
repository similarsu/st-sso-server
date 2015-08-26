package cn.st.sso.server.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import cn.st.sso.server.util.Messages;


/**
 * <p>
 * desciption:
 * </p>
 * 
 * @author coolearth
 * @date 2015年8月19日
 */
public class ExceptionHandler implements HandlerExceptionResolver {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);

    final static String ERROR = "/error";

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response,
            Object handler, Exception ex) {
        // TODO Auto-generated method stub
        if (logger.isErrorEnabled()) {
            logger.error("{}", handler, ex);;
        }
        Messages.setErrorMessage(ex.getMessage());
        String errorForward = (String) request.getAttribute("errorForward");
        ModelAndView modelAndView = new ModelAndView();
        // Enumeration enumeration = request.getParameterNames();
        // while (enumeration.hasMoreElements()) {
        // String param = (String) enumeration.nextElement();
        // Object value = request.getParameterValues(param);
        // modelAndView.addObject(param, value);
        // }
        if (!StringUtils.isBlank(errorForward)) {
            modelAndView.setViewName(errorForward);
        } else {
            modelAndView.setViewName(ERROR);
        }
        return modelAndView;
    }
}
