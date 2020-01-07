package cn.itcast.intercepter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 *
 * @author d.he
 * @date 2020/01/03
 */

public class MyIntercepter implements HandlerInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyIntercepter.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        LOGGER.debug("preHandle method is running");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        LOGGER.debug("postHandle method is running");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        LOGGER.debug("afterCompletion method is running");
    }
}
