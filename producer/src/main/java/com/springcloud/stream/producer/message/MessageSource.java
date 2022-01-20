package com.springcloud.stream.producer.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * 声明所有的消息输出通道 channel
 * */
public interface MessageSource {
    @Output("output-channel-demo")
    MessageChannel output();
}