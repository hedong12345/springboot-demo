package cn.itcast.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author d.he
 * @date 2020/01/03
 */
@Controller
public class HelloControllerV2 {

    private static final Logger logger = LoggerFactory.getLogger(HelloControllerV2.class);

    @GetMapping("getHello")
    @ResponseBody
    public String hello(){
        logger.warn("hello method is running");
        return "hello,this is my spring boot project! ";
    }
}
