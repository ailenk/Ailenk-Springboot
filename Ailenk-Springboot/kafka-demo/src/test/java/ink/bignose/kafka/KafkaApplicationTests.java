package ink.bignose.kafka;

import ink.bignose.kafka.message.Message;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;

import javax.annotation.Resource;

@Slf4j
// 获取启动类，加载配置，确定装载 Spring 程序的装载方法，它回去寻找 主配置启动类（被 @SpringBootApplication 注解的）
@SpringBootTest
class KafkaApplicationTests {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    @Test
    void testSendMessage() throws Exception{
        Message<String> message = new Message();
        message.setId("1");
        message.setContent("test");
        // 发送消息
        kafkaTemplate.send("test_topic", message.toString());
        // 让主线程睡眠10秒
        Thread.currentThread().sleep(10000);
    }

    @BeforeEach
    void testBefore(){
        log.info("测试开始!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @AfterEach
    void testAfter(){
        log.info("测试结束!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

}
