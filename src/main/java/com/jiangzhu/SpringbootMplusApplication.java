package com.jiangzhu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jiangzhu.mapper")
public class SpringbootMplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMplusApplication.class, args);
    }

}
