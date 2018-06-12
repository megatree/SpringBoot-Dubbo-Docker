package com.demo.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.facade.UserService;

/**
 * Created by wangzhe.bj on 2018-06-12.
 */

@Service(version = "1.0.0")
@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUser(String id) {
        return id + " has got";
    }
}
