package cn.itcast.web;

import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author d.he
 * @date 2020/01/03
 *
 */
@Controller
@RequestMapping("user")
public class HelloController {

//    @Autowired
//    private DataSource dataSource;

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    @ResponseBody
    public User hello(@PathVariable("id") Long id){
        return userService.queryById(id);
    }
}
