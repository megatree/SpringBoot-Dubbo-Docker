package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by wangzhe.bj on 2018-06-12.
 */
@SpringBootApplication
public class ControllerApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ControllerApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ControllerApplication.class);
    }
}
