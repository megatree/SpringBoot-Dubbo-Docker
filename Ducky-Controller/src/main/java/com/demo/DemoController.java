package com.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.facade.UserService;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangzhe.bj on 2018-06-12.
 */
@RestController
public class DemoController {

    @Reference(version = "1.0.0")
    private UserService userService;

    public String login(String id) {

        // 登录鉴权
        String info = userService.getUser(id);
        return info + " ,from controller";
    }

}
