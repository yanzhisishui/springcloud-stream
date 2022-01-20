package com.springcloud.stream.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Supplier;

@SpringBootApplication
public class ProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

    /**
     * SpringCloud-function 发送消息
     * */
//    @Bean
//    public Supplier<String> source1() {
//        return () -> "测试定时消息";
//    }
}
