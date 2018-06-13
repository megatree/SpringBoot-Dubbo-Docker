package com.demo.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.facade.UserService;

/**
 * Created by wangzhe.bj on 2018-06-13.
 */
@Service(version = "2.0.0")
@org.springframework.stereotype.Service
public class DualUserServiceImpl implements UserService {

    @Override
    public String getUser(String id) {
        return id + " has got by version 2";
    }
}
