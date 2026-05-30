package com.imqh.msitems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MsitemsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsitemsApplication.class, args);
    }

}
