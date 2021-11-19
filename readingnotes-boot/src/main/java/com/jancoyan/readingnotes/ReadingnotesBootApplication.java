package com.jancoyan.readingnotes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jancoyan.readingnotes.mapper")
public class ReadingnotesBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadingnotesBootApplication.class, args);
    }

}
