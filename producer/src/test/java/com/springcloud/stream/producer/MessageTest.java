package com.springcloud.stream.producer;

import com.springcloud.stream.producer.message.MessageSource;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 集成测试
 * */
@SpringBootTest(classes = ProducerApplication.class)
@RunWith(SpringRunner.class)
@Slf4j
public class MessageTest {

  @Autowired
  MessageSource messageSource;
  @Autowired
  StreamBridge streamBridge;

  /** 发送消息测试 */
  @Test
  public void test() {
    messageSource.output().send(MessageBuilder.withPayload("测试消息").build());
    //streamBridge.send("source1-out-0","测试消息");
  }
}
