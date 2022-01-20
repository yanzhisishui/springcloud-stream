package com.springcloud.stream.consumer.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * 声明消息输入通道 channel
 * */
public interface MessageSink {

    @Input("input-channel-demo")
    SubscribableChannel input();
}