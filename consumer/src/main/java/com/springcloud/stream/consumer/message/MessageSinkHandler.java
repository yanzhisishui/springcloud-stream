package com.springcloud.stream.consumer.message;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.SendTo;

@EnableBinding(MessageSink.class)
public class MessageSinkHandler {

    /**
     * 监听 input-channel-demo 通道的消息
     * */
    @StreamListener("input-channel-demo")
    public void consume(String message){
        System.out.println("接受到消息："+message);

    }
}
