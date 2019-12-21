package cn.itcast.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

//    @Autowired
//    private DataSource dataSource;

    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello,spring boot! ";
    }
}
