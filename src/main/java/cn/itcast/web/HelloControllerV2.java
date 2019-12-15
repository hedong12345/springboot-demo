package cn.itcast.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerV2 {

    @GetMapping("getHello")
    public String hello(){
        return "hello,this is my spring boot project! ";
    }
}
