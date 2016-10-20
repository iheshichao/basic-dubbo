package cn.lingban.springboot.controller;

import cn.lingban.springboot.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heshichao on 16-9-8.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping(value = "/test")
    public String test() {
        return userService.test();
    }
}
