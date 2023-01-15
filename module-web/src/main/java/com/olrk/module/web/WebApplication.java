package com.olrk.module.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liaoruikai
 * @date 2023/1/12
 */
@SpringBootApplication(scanBasePackages = "com.olrk.module")
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
