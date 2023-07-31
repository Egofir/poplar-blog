package com.by.poplarfront;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class PoplarFrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoplarFrontApplication.class, args);
    }

}
