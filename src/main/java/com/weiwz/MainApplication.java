package com.weiwz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author weiwz
 * 启动springboot项目程序主入口
 */

@SpringBootApplication //   这是一个SpringBoot应用
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args)
                ;
    }
}
