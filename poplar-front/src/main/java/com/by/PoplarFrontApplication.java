package com.by;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
@MapperScan("com.by.dao")
public class PoplarFrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoplarFrontApplication.class, args);
    }

}
