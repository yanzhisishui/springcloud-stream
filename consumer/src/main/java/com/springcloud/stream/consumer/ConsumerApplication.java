package com.springcloud.stream.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    /**
     * springcloud-function 接受消息
     * */
    @Bean
    public Consumer<String> sink1() {
        return message -> System.out.println("收到消息:" + message);
    }
}
