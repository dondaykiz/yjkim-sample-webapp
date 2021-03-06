package com.basic.boot.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Spring Boot Application 설정.
 *
 * @author yjkim@ntels.com
 */
@SpringBootApplication
public class BootApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BootApplication.class);
    }

    /**
     * Main 메소드.
     *
     * @param args 인자
     */
    public static void main(String args[]) {
        SpringApplication.run(BootApplication.class, args);
    }
}
