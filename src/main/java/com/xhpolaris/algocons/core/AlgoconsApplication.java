package com.xhpolaris.algocons.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
@SpringBootApplication
@ServletComponentScan
@EnableCaching
@EnableConfigurationProperties
@EnableScheduling
public class AlgoconsApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlgoconsApplication.class, args);
    }

    @RequestMapping
    public String hello() {
        return "Hello Freud";
    }
}