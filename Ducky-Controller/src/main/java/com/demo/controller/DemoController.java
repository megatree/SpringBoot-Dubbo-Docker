package com.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.facade.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangzhe.bj on 2018-06-12.
 */
@RestController
public class DemoController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @Reference(version = "2.0.0")
    private UserService userService2;


    @GetMapping("/login")
    public String login(String id) {
        String info = userService.getUser(id);
        return info + " ,from controller";
    }

    @GetMapping("/login2")
    public String login2(String id) {
        String info = userService2.getUser(id);
        return info + " ,from controller";
    }

}
