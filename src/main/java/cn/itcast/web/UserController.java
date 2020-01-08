package cn.itcast.web;

import cn.itcast.dto.Response;
import cn.itcast.dto.ServiceStatus;
import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 
 * @author d.he
 * @date 2020/01/03
 *
 */
@RestController
@RequestMapping("user")
public class UserController {

//    @Autowired
//    private DataSource dataSource;

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User getUser(@PathVariable("id") Long id){
        User user = userService.queryById(id);
        return user;
    }

    @GetMapping("add/user")
    @ResponseBody
    public Response addUser(@RequestBody User user){
        Response response=new Response(ServiceStatus.SUCCESS, null);
        Integer id = userService.insertUser(user);
        if (null == id){
            return new Response(ServiceStatus.FAIL, null);
        }
        return response;
    }
}
