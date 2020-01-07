package cn.itcast.config;

import cn.itcast.intercepter.MyIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置拦截器
 *
 * @author d.he
 * @date 2019/01/03
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyIntercepter()).addPathPatterns("/**");
    }
}
