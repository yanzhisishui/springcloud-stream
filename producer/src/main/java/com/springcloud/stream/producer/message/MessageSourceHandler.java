package com.springcloud.stream.producer.message;//package com.stream.product;

import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * 该注解用来指定一个或多个定义了 @Input 或 @Output 注解的接口，以此实现对消息通道（Channel）的绑定
 * */
@EnableBinding(MessageSource.class)
public class MessageSourceHandler {

}
