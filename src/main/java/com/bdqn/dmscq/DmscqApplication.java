package com.bdqn.dmscq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.bdqn.dmscq.mapper")
@MapperScan("com.bdqn.dmscq.service")
@SpringBootApplication
public class DmscqApplication {
    public static void main(String[] args) {
        SpringApplication.run(DmscqApplication.class,args);
    }
}
