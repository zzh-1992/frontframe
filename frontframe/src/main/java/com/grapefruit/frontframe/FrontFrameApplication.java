package com.grapefruit.frontframe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangzhihuang
 */
@SpringBootApplication
@MapperScan(basePackages = "com.grapefruit.frontframe.dao")
public class FrontFrameApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrontFrameApplication.class, args);
    }

}
